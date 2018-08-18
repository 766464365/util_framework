package com.framework.util.util_framework.customview.CustomizeImage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * While writing this code, only God and I know what it is.
 * And now only God knows it
 * <p>
 * Created by xuweijie
 * on 2018/8/17 0017.
 */
public class CustomizeDraw extends View implements View.OnClickListener {
    private Paint mPaint;       //画笔
    private Rect mBounds;       //获取字体宽高
    private int mCount;         //计数

    public CustomizeDraw(Context context) {
        super(context);
    }

    public CustomizeDraw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        mBounds=new Rect();
        setOnClickListener(this);
    }

    public CustomizeDraw(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomizeDraw(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.RED);
        canvas.drawCircle(0,0,180,mPaint);
        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(50);
        String text=String.valueOf(mCount);
        //获取文字宽高
        mPaint.getTextBounds(text,0,text.length(),mBounds);
        float textWidth=mBounds.width();
        float textHeight=mBounds.height();
        canvas.drawText(text,getWidth()/2-textWidth/2,getHeight()/2+textHeight/2,mPaint);

    }

    @Override
    public void onClick(View view) {
        mCount++;
        invalidate();
    }
}
