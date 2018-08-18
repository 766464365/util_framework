package com.framework.util.util_framework.customview.ExtendLayout;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * While writing this code, only God and I know what it is.
 * And now only God knows it
 * <p>
 * Created by xuweijie
 * on 2018/8/17 0017.
 */
public class ExtendLayout extends ListView {
    //数据容器
    private List<Integer> data;
    //手势探测器
    private GestureDetector mgestureDetector;
    //删除接口
    public interface OnDeleteListener{
        void onDelete(int index);
    }

    private OnDeleteListener mOnDeleteListener;
    //删除按钮
    private View mDeleteBtn;
    //
    private ViewGroup mItemLayout;

    private int mSelectedItem;

    private boolean isDeleteShown;

    public ExtendLayout(Context context, List<Integer> dataSet) {
        super(context);
        this.data=dataSet;
    }

    public ExtendLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ExtendLayout(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    public void setOnDeleteListener(OnDeleteListener listener){
        mOnDeleteListener=listener;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if(isDeleteShown){

            return false;
        }else
            return mgestureDetector.onTouchEvent(ev);

    }


}
