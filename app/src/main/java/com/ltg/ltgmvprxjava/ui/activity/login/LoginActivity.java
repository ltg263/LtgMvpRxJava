package com.ltg.ltgmvprxjava.ui.activity.login;


import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ltg.ltgmvprxjava.R;
import com.ltg.ltgmvprxjava.mvp.MVPBaseActivity;

import butterknife.BindView;


/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class LoginActivity extends MVPBaseActivity<LoginContract.View, LoginPresenter> implements LoginContract.View {

    @BindView(R.id.btn)
    Button btn;

    @Override
    public int getContentView() {
        return R.layout.activity_guide;
    }

    @Override
    public void initView() {
        btn.setText("登陆");
    }

    public void onClick(View view) {
        mPresenter.login("123", "abc");
    }


    @Override
    public void loginSucceed(Object obj) {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
        //登陆成功以后
    }

    @Override
    public void loginFailed(String message) {
        Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT).show();
        //登陆失败后
    }
}
