package com.example.zhanggang.mvprxjavaretrofit.constant;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableTake;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

/**
 * Created by zhanggang on 2017/10/8.
 */

public interface RegisterApi {

    @GET("http://www.baidu.com")
    Observable<ResponseBody> register();
}
