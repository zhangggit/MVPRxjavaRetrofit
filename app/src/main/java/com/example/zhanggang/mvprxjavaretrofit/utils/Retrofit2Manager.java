package com.example.zhanggang.mvprxjavaretrofit.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhanggang on 2017/10/8.
 * 封装retrofit
 */

public  class Retrofit2Manager {
    private Retrofit retrofit;
    private static final String BASE_URL="http://www.baidu.com";

    //一种单列模式
    private static class SingleHolder{
        private static final Retrofit2Manager instance = new Retrofit2Manager(BASE_URL);
    }
    //使用默认的retrofitmanager是默认的baseurl(单例模式中的)
    public static Retrofit2Manager getDefault(){
        return SingleHolder.instance;
    }
    //如果baseurl不是默认的话，那就调用这个方法，构造一个新的retrofitmanager
    public static Retrofit2Manager getretrofit2Manager(String baseurl){
        return new Retrofit2Manager(baseurl);
    }

    public Retrofit2Manager(String baseurl) {
        this.retrofit = buildRetrofit(baseurl);
    }

    private Retrofit buildRetrofit(String s) {
        Retrofit retrofit1 = new Retrofit.Builder()
                .baseUrl(s)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit1;
    }
    public <T> T create(Class<T> clazz){
        return retrofit.create(clazz);
    }

}
