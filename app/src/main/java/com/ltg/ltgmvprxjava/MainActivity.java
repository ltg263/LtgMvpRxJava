package com.ltg.ltgmvprxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ltg.ltgmvprxjava.apiService.RetrofitUtil;
import com.ltg.ltgmvprxjava.apiService.RxHttpParams;
import com.ltg.ltgmvprxjava.baseManager.Constants;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        RxHttpParams params = new RxHttpParams.Build()
                .url(Constants.URL)
//                .addQuery("key", key)
                .build();
        RetrofitUtil.request(params, String.class, new RetrofitUtil.HttpCallBackImpl<String>() {
            @Override
            public void onCompleted(String contactsBean) {

            }
        });
    }
}
