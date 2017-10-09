package com.example.zhanggang.mvprxjavaretrofit.presenter;

import com.example.zhanggang.mvprxjavaretrofit.model.RegisterModel;
import com.example.zhanggang.mvprxjavaretrofit.view.RegisterView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by zhanggang on 2017/10/8.
 */

public class RegisterPresent extends IPresenter<RegisterView> {

    private RegisterModel registerModel;

    public RegisterPresent(RegisterView view) {
        super(view);
    }

    @Override
    protected void init() {
        super.init();
        registerModel = new RegisterModel();  //实例化model
    }

    public void register() {
        //调用model的retrofit获取上游
        Observable<ResponseBody> observable = registerModel.register();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(@NonNull ResponseBody responseBody) throws Exception {
                        if (view!=null){
                            view.successed();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        if (view!=null){
                            view.failed();
                        }
                    }
                });

    }
}
