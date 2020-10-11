package com.t3h.foodreview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.t3h.foodreview.Adapter.MainVpagerAdapter;
import com.t3h.foodreview.fragment.ChudeFragment;
import com.t3h.foodreview.fragment.KhamPhaFragment;
import com.t3h.foodreview.fragment.TheodoiFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MainVpagerAdapter adapter;
    private ViewPager vpMain;
    private EditText edtSeach;
    private TextView tvVitri;
    private TabLayout tabLayoutMain;
    private Button btNHome,btnVideo,btnThongbao,btnNguoidung,btnRiview;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ChudeFragment cdFragment;
    private KhamPhaFragment khamPhaFragment;
    private TheodoiFragment theodoiFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
        initViews();
    }

    private void initFragment() {
        cdFragment = new ChudeFragment();
        khamPhaFragment = new KhamPhaFragment();
        theodoiFragment = new TheodoiFragment();
        fragments.add(cdFragment);
        fragments.add(khamPhaFragment);
        fragments.add(theodoiFragment);
    }

    private void initViews() {
        vpMain = findViewById(R.id.vp_main);
        edtSeach = findViewById(R.id.edt_timkiem);
        tvVitri = findViewById(R.id.tv_diadiem);
        tabLayoutMain =findViewById(R.id.tl_main);
        btNHome = findViewById(R.id.btn_home);
        btnVideo = findViewById(R.id.btn_video);
        btnThongbao = findViewById(R.id.btn_thongbao);
        btnNguoidung = findViewById(R.id.btn_nguoidung);
        btnRiview = findViewById(R.id.btn_riview);
        adapter = new MainVpagerAdapter(getSupportFragmentManager(),fragments);
        vpMain.setAdapter(adapter);
        tabLayoutMain.setupWithViewPager(vpMain);
    }
}