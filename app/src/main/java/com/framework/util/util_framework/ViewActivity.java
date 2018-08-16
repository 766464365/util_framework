package com.framework.util.util_framework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.framework.util.util_framework.R;
import com.xuwei.framework.customview.SlideSwitchButton;
//自定义开关按钮
public class ViewActivity extends AppCompatActivity implements SlideSwitchButton.SlideListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        SlideSwitchButton slideSwitchButton1 = (SlideSwitchButton) findViewById(R.id.slide2);
        slideSwitchButton1.setSlideListener(this);
        slideSwitchButton1.changeOpenState(false);
    }

    @Override
    public void openState(boolean isOpen, View view) {
        switch (view.getId()){
            case R.id.slide2:
                Toast.makeText(this,"状态"+isOpen,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
