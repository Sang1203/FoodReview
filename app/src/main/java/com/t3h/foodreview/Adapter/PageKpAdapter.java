package com.t3h.foodreview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageKpAdapter extends FragmentStatePagerAdapter {
    private Fragment[] fragments;
    public PageKpAdapter(@NonNull FragmentManager fm, Fragment...fragments) {
        super(fm, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
            default:
                return "Tất cả";
            case 1:
                return "Món ăn";
            case 2:
                return "Du lịch";
            case 3:
                return "Gần bạn";
        }
    }
}
