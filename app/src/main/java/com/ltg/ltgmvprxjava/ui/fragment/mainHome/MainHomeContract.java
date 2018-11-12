package com.ltg.ltgmvprxjava.ui.fragment.mainHome;

import com.ltg.ltgmvprxjava.mvp.BasePresenter;
import com.ltg.ltgmvprxjava.mvp.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MainHomeContract {
    interface View extends BaseView {
        void startLoginC(String ok);
        void startLoginS(String on);
    }

    interface Presenter extends BasePresenter<MainHomeContract.View> {
        void startLoginUi(boolean sta);
    }
}
