package com.ltg.ltgmvprxjava.ui.fragment.home;


import com.ltg.ltgmvprxjava.apiService.RetrofitUtil;
import com.ltg.ltgmvprxjava.apiService.RxHttpParams;
import com.ltg.ltgmvprxjava.baseManager.Constants;
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
            RxHttpParams params = new RxHttpParams.Build()
                    .url(Constants.URL)
                    .build();
            RetrofitUtil.request(params, String.class, new RetrofitUtil.HttpCallBackImpl<String>() {
                @Override
                public void onCompleted(String contactsBean) {
                    mView.startLoginC(contactsBean);
                }

                @Override
                public void onError(String message) {
                    super.onError(message);
                    mView.startLoginC(message);
                }
            });
        }
    }
}
