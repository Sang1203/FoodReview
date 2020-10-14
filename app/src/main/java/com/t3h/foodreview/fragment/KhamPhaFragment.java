package com.t3h.foodreview.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.t3h.foodreview.Adapter.PageKpAdapter;
import com.t3h.foodreview.R;

import java.util.ArrayList;

public class KhamPhaFragment extends Fragment {
    private ViewPager vpKPmain;
    private PageKpAdapter adapterkp;
    private KPAllFragment kpAllFragment;
    private KPDulichFragment kpDulichFragment;
    private KPGanbanFragment kpGanbanFragment;
    private KPMonAnFragment kpmonAnFragment;
    private ArrayList<Fragment> data = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_kham_pha, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        vpKPmain = getActivity().findViewById(R.id.vp_listKp);
        kpAllFragment = new KPAllFragment();
        kpDulichFragment = new KPDulichFragment();
        kpGanbanFragment =new KPGanbanFragment();
        kpmonAnFragment = new KPMonAnFragment();
        data.add(kpAllFragment);
        data.add(kpDulichFragment);
        data.add(kpGanbanFragment);
        data.add(kpmonAnFragment);
    }
}