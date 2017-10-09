package com.example.zhanggang.mvprxjavaretrofit.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.zhanggang.mvprxjavaretrofit.R;
import com.example.zhanggang.mvprxjavaretrofit.presenter.RegisterPresent;
import com.example.zhanggang.mvprxjavaretrofit.view.RegisterView;

public class MainActivity extends AppCompatActivity implements RegisterView{

    private RegisterPresent registerPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerPresent = new RegisterPresent(this);

    }
    //点击监听
    public void onClick(View view) {
        registerPresent.register();
    }

    @Override
    public void successed() {
        Toast.makeText(this, "成功！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failed() {
        Toast.makeText(this, "失败！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context content() {
        return this;
    }


}
