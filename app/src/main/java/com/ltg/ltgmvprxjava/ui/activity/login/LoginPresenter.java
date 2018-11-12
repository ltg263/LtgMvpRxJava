package com.ltg.ltgmvprxjava.ui.activity.login;


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
            mView.loginFailed("登陆失败哦");
        }
    }
//        RxHttpParams params = new RxHttpParams.Build()
//                .url(Constants.URL)
//                .addQuery("name", name)
//                .addQuery("password", password)
//                .build();
//        RetrofitUtil.request(params, String.class, new RetrofitUtil.HttpCallBackImpl<String>() {
//            @Override
//            public void onCompleted(String contactsBean) {
//                if(contactsBean.equals("123") && contactsBean.equals("aaa")){
//                    mView.loginSucceed(contactsBean);
//                }else{
//                    mView.loginFailed("登陆失败哦");
//                }
//            }
//        });
//    }
}
