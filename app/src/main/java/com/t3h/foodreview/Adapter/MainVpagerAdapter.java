package com.t3h.foodreview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MainVpagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> data;

    public MainVpagerAdapter(@NonNull FragmentManager fm,  ArrayList<Fragment> data ) {
        super(fm,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.data = data;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
            default:
                return "Theo dõi";
            case 1:
                return "Khám phá";
            case 2:
                return "Chủ đề";
        }
    }
}
