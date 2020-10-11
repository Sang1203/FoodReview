package com.t3h.foodreview.fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.t3h.foodreview.Adapter.PageTheoDoiAdapter;
import com.t3h.foodreview.Models.Post;
import com.t3h.foodreview.R;

import java.util.List;


public class TheodoiFragment extends Fragment {
    private RecyclerView rcTheodoi;
    private List<Post> posts;
    private PageTheoDoiAdapter adapter;
    private Activity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_theodoi, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
        rcTheodoi =activity.findViewById(R.id.rc_theodoi);
        adapter = new PageTheoDoiAdapter(activity.getLayoutInflater());
        rcTheodoi.setAdapter(adapter);
    }

}