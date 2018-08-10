package com.framework.util.util_framework.network.volley;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.framework.util.util_framework.R;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Volley activity.
 *
 * 适用于频繁且数据量小的请求
 */

public class VolleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);
    }

    /**
     * Get string request.
     *
     * 使用GET方法请求string
     */

    public void getStringRequest(){
        //1.创建出请求队列
        RequestQueue mRequestQueue = Volley.newRequestQueue(this);

        //2.创建出来字符串请求对象： StringRequest
        /**
         * 1param: 请求方式 get/post
         * 2p:请求的url地址
         * 3p:请求成功后的接口回调
         * 4p:请求失败后回调
         * 5p:成功的监听，通过参数返回请求到的数据
         * 6p:失败的监听，失败在这里处理
         */
        StringRequest mStrReq = new StringRequest(Request.Method.GET, "https://**************",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // 这个方法运行在主线程中，可以直接更新ui
                        // 通过参数返回请求到的数据


                        Toast.makeText(VolleyActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // 这个方法运行在主线程中，可以直接更新ui
                // 失败在这里处理
                Toast.makeText(VolleyActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
            }
        });

        //设置Tag值
        mStrReq.setTag("100");
        mRequestQueue.add(mStrReq);
    }

    /**
     * Post string request.
     *
     * 使用POST方式请求string
     */
    public void postStringRequest(){
        //1.创建出请求队列
        RequestQueue mRequestQueue = Volley.newRequestQueue(this);

        String url_post = "http://*****************";
        StringRequest mStrReq = new StringRequest(Request.Method.POST, url_post
                , new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //
            }
        }) {//这里需要重写getParams方法
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                //把post的请求参数，放入请求体中
                //请求条件：platform=2&gifttype=1&compare=60841c5b7c69a1bbb3f06536ed685a48
                Map<String, String> params = new HashMap<>();
                params.put("key1", "value1");
                params.put("key2", "value2");
                params.put("key3", "value3");
                return params;
            }
        };
        //点击加入到请求队列中
        mRequestQueue.add(mStrReq);
    }

    /**
     * Json request.
     * <p>
     * 发起json格式的请求
     */
    public void jsonRequest(){
        //1.创建出请求队列
        RequestQueue mRequestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest =new JsonObjectRequest(Request.Method.GET, "www.************", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        //点击加入到请求队列中
        mRequestQueue.add(jsonObjectRequest);
    }

    public void imageRequest(){
        //1.首先有请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        //2.请求对象
        //1) 图片下载的url
        //2) 下载成功后，返回一个bitmap对象
        //3)4) 最大宽度和最大高度，如果超过最大宽度和高度，会进行压缩到你设置的宽度和高度，0不限制
        //5) 图片加载的形式
        //6)图片显示的质量：RGB_565： 每个像素2字节   ARGB_8888:每个像素占4个字节
        //7)下载图片失败后，在这里边处理
        ImageRequest imgRequest = new ImageRequest("www.**********", new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                //请求成功显示成功的图片


            }
        }, 0, 0, ImageView.ScaleType.FIT_XY, Bitmap.Config.RGB_565, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //请求失败 设置失败的图片

            }
        });
        requestQueue.add(imgRequest);
    }


}
