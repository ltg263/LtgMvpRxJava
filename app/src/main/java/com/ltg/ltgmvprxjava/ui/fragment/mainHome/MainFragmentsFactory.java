package com.ltg.ltgmvprxjava.ui.fragment.mainHome;

import android.support.v4.app.Fragment;
import android.util.SparseArray;

import com.ltg.ltgmvprxjava.ui.fragment.home.HomeFragment;

public class MainFragmentsFactory {
    private static SparseArray<Fragment> fragments = new SparseArray<>();
    public static Fragment getFragment(int position) {
        Fragment currentFragment = fragments.get(position);
        if (currentFragment == null) {
            switch (position) {
                case 0:
                    fragments.put(position,new MainHomeFragment());
                    break;
                case 1:
                    fragments.put(position,new MainHomeFragment());
                    break;
                case 2:
                    fragments.put(position,new MainHomeFragment());
                    break;
                case 3:
                    fragments.put(position,new HomeFragment());
                    break;
                case 4:
                    fragments.put(position,new HomeFragment());
                    break;
                default:
                    break;
            }
            currentFragment=  fragments.get(position);
        }
        return currentFragment;
    }
}
