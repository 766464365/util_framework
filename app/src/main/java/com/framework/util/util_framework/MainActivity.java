package com.framework.util.util_framework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyView myView=findViewById(R.id.view);
        myView.createtoast(MainActivity.this);
    }


}
