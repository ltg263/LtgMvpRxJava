package com.ltg.ltgmvprxjava.ui.activity.login;


import com.ltg.ltgmvprxjava.mvp.BasePresenter;
import com.ltg.ltgmvprxjava.mvp.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class LoginContract {

    /**
     * View接口中编写成功和失败的回调
     */
    interface View extends BaseView {
        void loginSucceed(Object obj);
        void loginFailed(String message);
    }

    /**
     * 在Presenter接口中编写登陆调用的接口。
     */
    interface  Presenter extends BasePresenter<View> {
        void login(String name, String password);
    }
}
