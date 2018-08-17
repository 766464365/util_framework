package com.framework.util.util_framework.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.framework.util.util_framework.R;
import com.framework.util.util_framework.customview.CombineLayout.OrderDetailItemClickable;
import com.xuwei.framework.base.BaseActivity;
import com.xuwei.framework.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomizeActivity extends BaseActivity {

    @BindView(R.id.combineLayout)
    OrderDetailItemClickable combineLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);
        ButterKnife.bind(this);
        initView();
        ToastUtils.getInstance(getApplicationContext()).show("ahahah");
    }

    private void initView() {
        //组合类型view的初始化
        combineLayout.init("我是标题","我是内容");
    }
}
