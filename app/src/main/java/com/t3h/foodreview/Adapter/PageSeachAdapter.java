package com.t3h.foodreview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.t3h.foodreview.fragment.SeachAllFragment;
import com.t3h.foodreview.fragment.SeachDiadiemFragment;
import com.t3h.foodreview.fragment.SeachTaikhoanFragment;
import com.t3h.foodreview.fragment.SeachbvFragment;

public class PageSeachAdapter extends FragmentStatePagerAdapter {
    private SeachAllFragment seachAllFragment = new SeachAllFragment();
    private SeachbvFragment seachbvFragment = new SeachbvFragment();
    private SeachDiadiemFragment seachDiadiemFragment = new SeachDiadiemFragment();
    private SeachTaikhoanFragment seachTaikhoanFragment = new SeachTaikhoanFragment();

    public SeachAllFragment getSeachAllFragment() {
        return seachAllFragment;
    }

    public SeachbvFragment getSeachbvFragment() {
        return seachbvFragment;
    }

    public SeachDiadiemFragment getSeachDiadiemFragment() {
        return seachDiadiemFragment;
    }

    public SeachTaikhoanFragment getSeachTaikhoanFragment() {
        return seachTaikhoanFragment;
    }

    public PageSeachAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            default:
                return seachAllFragment;
            case 1:
                return seachbvFragment;
            case 2:
                return seachDiadiemFragment;
            case 3:
                return seachTaikhoanFragment;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
            default:
                return "Tất cả";
            case 1:
                return "Bài viết";
            case 2:
                return "Địa điểm";
            case 3:
                return "Tài Khoản";
        }
    }
}
