package com.ltg.ltgmvprxjava.ui.fragment.mainHome;

import com.ltg.ltgmvprxjava.mvp.BasePresenterImpl;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MainHomePresenter extends BasePresenterImpl<MainHomeContract.View> implements MainHomeContract.Presenter{

    @Override
    public void startLoginUi(boolean sta) {
        if(sta == true){
            mView.startLoginC("成功11111");
        }else{
            mView.startLoginS("失败11111");
        }
    }
}
