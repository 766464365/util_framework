package com.framework.util.util_framework.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.framework.util.util_framework.R;
import com.xuwei.framework.recyclerview.SpaceItemDecoration;
import com.xuwei.framework.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends AppCompatActivity implements Adapter.OnItemClickListener {
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
    }
}
