package com.framework.util.util_framework.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * While writing this code, only God and I know what it is.
 * And now only God knows it
 * <p>
 * Created by xuweijie
 * on 2018/8/7 0007.
 */
public class VolleyUtils {

    private static VolleyUtils mInstance;
    private RequestQueue mRequestQueue;
    private ImageLoader mImageLoader;
    private ImageLoader.ImageCache mCache;

    private VolleyUtils(Context context) {
        mRequestQueue = Volley.newRequestQueue(context);
        //设置图片
        mCache = new ImageLoader.ImageCache() {
            @Override
            public Bitmap getBitmap(String url) {
                return null;
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {

            }
        };
        mImageLoader = new ImageLoader(mRequestQueue, mCache);
    }
    //單例模式
    public VolleyUtils newInstance(Context context) {
        if (mInstance == null) {
            synchronized (VolleyUtils.class) {
                if (mInstance == null) {
                    mInstance = new VolleyUtils(context);
                }
            }
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        return mRequestQueue;
    }

    public ImageLoader getImageLoader(){
        return mImageLoader;
    }

    /**
     * 发送一个字符串请求
     * @param method 请求方式GET/POST
     * @param url 请求的链接
     * @param params POST请求时的参数，可为null
     * @param listener 请求返回数据的监听器
     * @param errorListener 请求发生错误的监听器
     */
    public void sendStringRequest(final int method, String url, final Map<String, String> params, Response.Listener<String> listener,
                                  Response.ErrorListener errorListener){
        StringRequest stringRequest = new StringRequest(method, url, listener, errorListener){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                if (method == Method.POST) {
                    return params;
                }
                return null;
            }
        };
        mRequestQueue.add(stringRequest);
    }

    /**
     * 发送一个字符串请求
     * @param url 图片的链接
     * @param listener 成功获取到Bitmap的监听器
     * @param maxWidth 最大宽度，0则不限制
     * @param maxHeight 最大高度，0则不限制
     * @param scaleType ImageView的拉伸属性
     * @param decodeConfig 图片的格式
     * @param errorListener 失败的监听器
     */
    public void sendImageRequest(String url, Response.Listener<Bitmap> listener, int maxWidth, int maxHeight,
                                 ImageView.ScaleType scaleType, Bitmap.Config decodeConfig, Response.ErrorListener errorListener){
        ImageRequest imageRequest = new ImageRequest(url, listener, maxWidth, maxHeight, scaleType, decodeConfig, errorListener);
        mRequestQueue.add(imageRequest);
    }
}