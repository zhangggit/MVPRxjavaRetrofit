package com.example.zhanggang.mvprxjavaretrofit.model;


import com.example.zhanggang.mvprxjavaretrofit.constant.RegisterApi;
import com.example.zhanggang.mvprxjavaretrofit.utils.Retrofit2Manager;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;

/**
 * Created by zhanggang on 2017/10/8.
 */

public class RegisterModel {

    public Observable<ResponseBody> register(){
        //从retrofit获取到上游
        return Retrofit2Manager.getDefault().create(RegisterApi.class).register();
    }

}
