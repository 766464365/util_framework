package com.framework.util.util_framework.network.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.framework.util.util_framework.R;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }

    private void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .client(new OkHttpClient())
                .baseUrl("https://766464365.github.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface requestInterface=retrofit.create(RequestInterface.class);
        Call<WaitOrderDataBase> call = requestInterface.getWaitOrderListCall();
        call.enqueue(new Callback<WaitOrderDataBase>() {
            @Override
            public void onResponse(Call<WaitOrderDataBase> call, Response<WaitOrderDataBase> response) {
                if(response.isSuccessful()){
                    if(response.body().getCode()==200){
                        Log.i("状态","请求成功");

                    }
                }
            }

            @Override
            public void onFailure(Call<WaitOrderDataBase> call, Throwable t) {

            }
        });
    }


}
