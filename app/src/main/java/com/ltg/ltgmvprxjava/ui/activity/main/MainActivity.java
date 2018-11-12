package com.ltg.ltgmvprxjava.ui.activity.main;


import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ltg.ltgmvprxjava.R;
import com.ltg.ltgmvprxjava.adapter.MainActivityPagerAdapter;
import com.ltg.ltgmvprxjava.mvp.MVPBaseActivity;
import com.ltg.ltgmvprxjava.view.TabViewpager;

import butterknife.BindView;


/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MainActivity extends MVPBaseActivity<MainContract.View, MainPresenter> implements MainContract.View {

    @BindView(R.id.vp_main)
    TabViewpager vp_main;
    @BindView(R.id.rg_main_parent)
    RadioGroup rg_main_parent;
    @BindView(R.id.rb_main)
    RadioButton rbMain;
    @BindView(R.id.rb_project)
    RadioButton rbProject;
    @BindView(R.id.rb_topic)
    RadioButton rbTopic;
    @BindView(R.id.rb_message)
    RadioButton rbMessage;
    @BindView(R.id.rb_mine)
    RadioButton rbMine;
    MainActivityPagerAdapter adapter;

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        adapter = new MainActivityPagerAdapter(getSupportFragmentManager());
        vp_main.setAdapter(adapter);
        vp_main.setOffscreenPageLimit(5);
        rg_main_parent.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_main:
                        vp_main.setCurrentItem(0);
                        break;
                    case R.id.rb_project:
                        vp_main.setCurrentItem(1);
                        break;
                    case R.id.rb_topic:
                        vp_main.setCurrentItem(2);
                        break;
                    case R.id.rb_message:
                        vp_main.setCurrentItem(3);
                        break;
                    case R.id.rb_mine:
                        vp_main.setCurrentItem(4);
                        break;
                }
            }
        });
    }

    private long exitTime = 0;
    private int index = 0;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if (index != vp_main.getCurrentItem()) {
                rbMain.setChecked(true);
            } else {
                if ((System.currentTimeMillis() - exitTime) > 2000) {
                    Toast.makeText(MainActivity.this,"再按一次退出",Toast.LENGTH_SHORT).show();
                    exitTime = System.currentTimeMillis();
                } else {
                    finish();
                    System.exit(0);
                }
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
