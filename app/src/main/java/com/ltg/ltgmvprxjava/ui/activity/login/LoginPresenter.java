package com.ltg.ltgmvprxjava.ui.activity.login;


import com.ltg.ltgmvprxjava.apiService.RetrofitUtil;
import com.ltg.ltgmvprxjava.apiService.RxHttpParams;
import com.ltg.ltgmvprxjava.baseManager.Constants;
import com.ltg.ltgmvprxjava.mvp.BasePresenterImpl;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class LoginPresenter extends BasePresenterImpl<LoginContract.View> implements LoginContract.Presenter{

    @Override
    public void login(String name, String password) {
        if(name.equals("123") && password.equals("abc")){
            mView.loginSucceed("");
        }else{
            RxHttpParams params = new RxHttpParams.Build()
                    .url(Constants.URL)
                    .build();
            RetrofitUtil.request(params, String.class, new RetrofitUtil.HttpCallBackImpl<String>() {
                @Override
                public void onCompleted(String contactsBean) {
                    mView.loginFailed(contactsBean);
                }

                @Override
                public void onError(String message) {
                    super.onError(message);
                    mView.loginFailed(message);
                }
            });
        }
    }
}
