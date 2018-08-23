package com.framework.util.util_framework.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.framework.util.util_framework.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TablayoutActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment currentFragment;

    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.framelayout)
    FrameLayout framelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        fragmentManager=getSupportFragmentManager();
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment temp=null;
                FragmentTransaction transaction=fragmentManager.beginTransaction();
                switch (tab.getText().toString().trim()){
                    case "fragment1":
                        if(fragment1==null){
                            fragment1=new Fragment1();
                            transaction.add(R.id.framelayout,fragment1);
                        }
                        temp=fragment1;
                        break;
                    case "fragment2":
                        if(fragment2==null){
                            fragment2=new Fragment2();
                            transaction.add(R.id.framelayout,fragment2);
                        }
                        temp=fragment2;
                        break;
                    default:
                        break;
                }
                if(currentFragment!=null){
                    transaction.hide(currentFragment);
                }
                transaction.show(temp);
                transaction.commitAllowingStateLoss();
                currentFragment=temp;
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tab.addTab(tab.newTab().setText("fragment1"),true);
        tab.addTab(tab.newTab().setText("fragment2"));

         TabLayoutUtils.setIndicator(tab, 25, 25);
    }
}
