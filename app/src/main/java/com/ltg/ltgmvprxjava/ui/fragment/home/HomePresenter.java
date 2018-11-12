package com.ltg.ltgmvprxjava.ui.fragment.home;


import com.ltg.ltgmvprxjava.mvp.BasePresenterImpl;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class HomePresenter extends BasePresenterImpl<HomeContract.View> implements HomeContract.Presenter{

    @Override
    public void startLoginUi(boolean sta) {
        if(sta == true){
            mView.startLoginC("成功2222");
        }else{
            mView.startLoginS("失败2222");
        }
    }
}
