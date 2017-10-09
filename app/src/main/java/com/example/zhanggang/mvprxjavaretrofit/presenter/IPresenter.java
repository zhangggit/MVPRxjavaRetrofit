package com.example.zhanggang.mvprxjavaretrofit.presenter;

import android.content.Context;
import com.example.zhanggang.mvprxjavaretrofit.app.App;
import com.example.zhanggang.mvprxjavaretrofit.view.IView;

/**
 * 基类的presenter
 * Created by zhanggang on 2017/10/8.
 */

public class IPresenter<T extends IView> {
    protected T view;

    public IPresenter(T view) {
        this.view = view;
        init();
    }

    protected void init() {

    }

    public Context context() {
        if (view != null && view.content() != null) {
            return view.content();
        }
        return App.context();
    }
}
