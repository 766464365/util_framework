package com.framework.util.util_framework;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;


public class MyView extends View {

    Paint paint;

    public MyView(Context context) {
        super(context);
        init();
    }


    public MyView(Context context, AttributeSet attrs) {
//        super(context, attrs);
        //加了自定义属性后需要重写
        this(context,attrs,0);
        init();
    }

    public MyView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        // 加载自定义属性集合CircleView
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CircleView);

        // 解析集合中的属性circle_color属性
        // 该属性的id为:R.styleable.CircleView_circle_color
        // 将解析的属性传入到画圆的画笔颜色变量当中（本质上是自定义画圆画笔的颜色）
        // 第二个参数是默认设置颜色（即无指定circle_color情况下使用）
        int mColor = a.getColor(R.styleable.CircleView_circle_color,Color.RED);

        // 解析后释放资源
        a.recycle();

        init();
    }


    public void createtoast(Context context){
        Toast.makeText(context,"我是自定义的view",Toast.LENGTH_SHORT).show();
    }

    public void init(){
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(5f);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        final int paddingleft=getPaddingLeft();
        final int paddingright=getPaddingRight();
        final int paddingtop=getPaddingTop();
        final int paddingbottom=getPaddingBottom();

        int width=getWidth()- paddingleft- paddingright;
        int height=getHeight()- paddingtop- paddingbottom;

        int width1=getWidth();
        int height1=getHeight();

        // 设置圆的半径 = 宽,高最小值的2分之1
        int r = Math.min(width, height)/2;
        canvas.drawCircle(width1/2,height1/2,r,paint);



    }
}
