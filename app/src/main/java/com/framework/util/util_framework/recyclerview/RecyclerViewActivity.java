package com.framework.util.util_framework.recyclerview;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.framework.util.util_framework.R;
import com.xuwei.framework.base.BaseActivity;
import com.xuwei.framework.recyclerview.SpaceItemDecoration;
import com.xuwei.framework.utils.ToastUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends BaseActivity implements Adapter.OnItemClickListener {
    LinearLayoutManager mLayoutManager;
    Adapter adapter;

    @BindView(R.id.rv)
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);
        initview();
    }

    private void initview() {
        mLayoutManager=new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);
        rv.addItemDecoration(new SpaceItemDecoration(getResources()
                .getDimensionPixelOffset(R.dimen.y30)));
        adapter=new Adapter();
        adapter.setmItemClickListener(this);
        rv.setAdapter(adapter);

    }

    @Override
    public void onItemClick(View v, int position) {
        ToastUtils.getInstance(this).show(position+"");
        //scheme可以用来设置多种场景下的app页面打开
//        Intent intent = new Intent(Intent.ACTION_VIEW,
//                Uri.parse("xl://goods:8888/goodsDetail?goodsId=10011002"));
//        startActivity(intent);
        doSomeThing();
    }

    private void doSomeThing() {
        requestRunPermisssion(new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA}, new BaseActivity.PermissionListener() {
            @Override
            public void onGranted() {
                //表示所有权限都授权了
                Toast.makeText(RecyclerViewActivity.this, "所有权限都授权了，可以搞事情了", Toast.LENGTH_SHORT).show();
                //我们可以执行打电话的逻辑
                Intent intent = new Intent(Intent.ACTION_CALL);
                Uri uri = Uri.parse("tel:" + "10086");
                intent.setData(uri);
                startActivity(intent);
            }

            @Override
            public void onDenied(List<String> deniedPermission) {
                for(String permission : deniedPermission){
                    Toast.makeText(RecyclerViewActivity.this, "被拒绝的权限：" + permission, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
