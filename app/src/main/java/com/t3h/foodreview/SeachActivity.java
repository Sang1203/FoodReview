package com.t3h.foodreview;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.t3h.foodreview.Adapter.PageSeachAdapter;

public class SeachActivity extends AppCompatActivity {
    private EditText edtSeach;
    private TextView tvHuy;
    private PageSeachAdapter pageSeachAdapter;
    private TabLayout tlSeach;
    private ViewPager vpSeach;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vitri);
        initViews();
    }

    private void initViews() {
        edtSeach = findViewById(R.id.edt_timkiem);
        tvHuy = findViewById(R.id.tv_huy);
        tlSeach = findViewById(R.id.tl_seachmain);
        vpSeach = findViewById(R.id.vp_seachmain);
    }
}
