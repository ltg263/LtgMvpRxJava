package com.ltg.ltgmvprxjava.ui.activity.main;

import com.ltg.ltgmvprxjava.mvp.BasePresenter;
import com.ltg.ltgmvprxjava.mvp.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MainContract {
    interface View extends BaseView {
    }

    interface  Presenter extends BasePresenter<View> {
        
    }
}
