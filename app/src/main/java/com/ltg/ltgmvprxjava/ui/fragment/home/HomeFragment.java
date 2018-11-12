package com.ltg.ltgmvprxjava.ui.fragment.home;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ltg.ltgmvprxjava.R;
import com.ltg.ltgmvprxjava.mvp.MVPBaseFragment;
import com.ltg.ltgmvprxjava.ui.activity.login.LoginActivity;

import butterknife.BindView;

/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class HomeFragment extends MVPBaseFragment<HomeContract.View, HomePresenter> implements HomeContract.View {

    boolean is = true;
    @BindView(R.id.btn)
    Button btn;

    @Override
    public int setFragmentView() {
        return R.layout.activity_guide;
    }

    @Override
    public void initViews() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.startLoginUi(is);
            }
        });
    }

    @Override
    public void startLoginC(String ok) {
        is = false;
        Toast.makeText(getActivity(), ok, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getActivity(), LoginActivity.class));
    }

    @Override
    public void startLoginS(String on) {
        is = true;
        Toast.makeText(getActivity(), on, Toast.LENGTH_SHORT).show();
//        startActivity(new Intent(getActivity(), LoginActivity.class));
    }
}
