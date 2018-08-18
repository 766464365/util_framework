package com.framework.util.util_framework.customview.CombineLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.framework.util.util_framework.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * While writing this code, only God and I know what it is.
 * And now only God knows it
 * <p>
 * Created by xuweijie
 * on 2018/7/27 0027.
 *
 * 调用方式可以直接在xml文件中加入包名控件即可  内容可以自定义 增加点击事件等
 */
public class OrderDetailItemClickable extends RelativeLayout {
    /**
     * The Tv title.
     */
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    /**
     * The Tv content.
     */
    @BindView(R.id.tvContent)
    TextView tvContent;
    /**
     * The Iv click.
     */
    @BindView(R.id.ivClick)
    ImageView ivClick;

    /**
     * Instantiates a new Order detail item clickable.
     *
     * @param context the context
     */
    public OrderDetailItemClickable(Context context) {
        super(context);
        initView();
    }

    /**
     * Instantiates a new Order detail item clickable.
     *
     * @param context the context
     * @param attrs   the attrs
     */
    public OrderDetailItemClickable(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    /**
     * Instantiates a new Order detail item clickable.
     *
     * @param context      the context
     * @param attrs        the attrs
     * @param defStyleAttr the def style attr
     */
    public OrderDetailItemClickable(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    /**
     * Init view.
     */
    void initView() {
        inflate(getContext(), R.layout.home_include_detail_item_clickable, this);
        ButterKnife.bind(this);
    }

    /**
     * Init.
     * <p>
     * 初始化
     *
     * @param title   the tv title  标题名  可为空
     * @param content the tv content  内容名     可为空
     */
    public void init(String title, String content) {
        tvTitle.setText(title);
        tvContent.setText(content);
    }

    /**
     * Set title color.
     * <p>
     * 设置标题字体颜色
     *
     * @param color the color   int颜色
     */
    public void setTitleColor(int color){
        tvTitle.setTextColor(color);
    }

    /**
     * Set content color.
     * <p>
     * 设置内容字体颜色
     *
     * @param color the color       int颜色
     */
    public void setContentColor(int color){
        tvContent.setTextColor(color);
    }

    /**
     * Set tv content.
     *
     * 设置内容
     * @param str the str
     */
    public void setTvContent(String str){
        tvContent.setText(str);
    }

    /**
     * Get tv content string.
     *
     * 获取内容
     * @return the string
     */
    public String getTvContent(){
        return tvContent.getText().toString().trim();
    }
}
