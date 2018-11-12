package com.ltg.ltgmvprxjava.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ltg.ltgmvprxjava.ui.fragment.mainHome.MainFragmentsFactory;


public class MainActivityPagerAdapter extends FragmentStatePagerAdapter {
    public MainActivityPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return MainFragmentsFactory.getFragment(position);

    }

    @Override
    public int getCount() {
        return 5;
    }
}
