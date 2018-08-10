package com.framework.util.util_framework.network.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    //数据测试
    @GET("/")
    Call<WaitOrderDataBase> getWaitOrderListCall();

}
