package com.example.zhanggang.mvprxjavaretrofit.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhanggang on 2017/10/8.
 */

public class App extends Application{
    private static App content;

    @Override
    public void onCreate() {
        super.onCreate();
        this.content=this;
    }
    public static Context context(){
        return content;
    }
}
