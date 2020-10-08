package com.t3h.foodreview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.t3h.foodreview.fragment.AnhVideoFragment;
import com.t3h.foodreview.fragment.BaiVietFragment;
import com.t3h.foodreview.fragment.BoSuuTapFragment;

public class PageUserAdapter extends FragmentStatePagerAdapter {
    private AnhVideoFragment imvdFragment = new AnhVideoFragment();
    private BaiVietFragment bvFragment = new BaiVietFragment();
    private BoSuuTapFragment boSuuTapFragment = new BoSuuTapFragment();

    public AnhVideoFragment getImvdFragment() {
        return imvdFragment;
    }

    public BaiVietFragment getBvFragment() {
        return bvFragment;
    }

    public BoSuuTapFragment getBoSuuTapFragment() {
        return boSuuTapFragment;
    }

    public PageUserAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
            default:
                return bvFragment;
            case 1:
                return boSuuTapFragment;
            case 2:
                return imvdFragment;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
            default:
                return "Bài viết";
            case 1:
                return "Bộ sưu tập";
            case 2:
                return "Anh/Video";
        }
    }
}
