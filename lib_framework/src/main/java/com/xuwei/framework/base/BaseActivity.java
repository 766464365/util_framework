package com.xuwei.framework.base;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有Activity的基类，处理了一些公共的事件
 *
 * @author xw  2018/5/29
 */
public abstract class BaseActivity extends AppCompatActivity {
    /** 是否注册EventBus */
    private boolean isRegisterEventBus = false;
    /*权限申请*/
    private PermissionListener mListener;
    private static final int PERMISSION_REQUESTCODE = 100;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        // 设置fitsSystemWindows参数为true
        setFitsSystemWindows(true);
    }

    /**
     * 注册EventBus，子类必须要在onCreare()方法中调用才能生效
     */
    protected void registerEventBus(){
        isRegisterEventBus = true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (isRegisterEventBus) {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    protected void onStop() {
        if (isRegisterEventBus) {
            EventBus.getDefault().unregister(this);
        }
        super.onStop();
    }

    /**
     * 设置状态栏颜色
     *
     * @param resourceId 颜色资源id
     */
    protected void setStatsBarColor(int resourceId) {
        // 1,先将状态栏设置为透明
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS |
                localLayoutParams.flags);
        }

        // 2,再设置颜色
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setStatusBarTintResource(resourceId);
    }

    /**
     * 设置fitsSystemWindows参数，等同于在布局中设置 android:fitsSystemWindows="true/false"
     */
    protected void setFitsSystemWindows(boolean isFitsSystemWindows) {
        ViewGroup parent = findViewById(android.R.id.content);
        for (int i = 0, count = parent.getChildCount(); i < count; i++) {
            View childView = parent.getChildAt(i);
            if (childView instanceof ViewGroup) {
                childView.setFitsSystemWindows(isFitsSystemWindows);
                ((ViewGroup) childView).setClipToPadding(isFitsSystemWindows);
            }
        }
    }

    /**
     * 权限申请
     */

    public void requestRunPermisssion(String[] permissions, PermissionListener listener){
        mListener = listener;
        List<String> permissionLists = new ArrayList<>();
        for(String permission : permissions){
            if(ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED){
                permissionLists.add(permission);
            }
        }

        if(!permissionLists.isEmpty()){
            ActivityCompat.requestPermissions(this, permissionLists.toArray(new String[permissionLists.size()]), PERMISSION_REQUESTCODE);
        }else{
            //表示全都授权了
            mListener.onGranted();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case PERMISSION_REQUESTCODE:
                if(grantResults.length > 0){
                    //存放没授权的权限
                    List<String> deniedPermissions = new ArrayList<>();
                    for(int i = 0; i < grantResults.length; i++){
                        int grantResult = grantResults[i];
                        String permission = permissions[i];
                        if(grantResult != PackageManager.PERMISSION_GRANTED){
                            deniedPermissions.add(permission);
                        }
                    }
                    if(deniedPermissions.isEmpty()){
                        //说明都授权了
                        mListener.onGranted();
                    }else{
                        mListener.onDenied(deniedPermissions);
                    }
                }
                break;
            default:
                break;
        }
    }
    /**
     * 已授权、未授权的接口回调
     */
    public interface PermissionListener {

        void onGranted();//已授权

        void onDenied(List<String> deniedPermission);//未授权

    }
}
