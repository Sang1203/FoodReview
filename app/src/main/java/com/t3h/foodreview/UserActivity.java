package com.t3h.foodreview;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class UserActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_detail);
        Intent  intent =getIntent();
        viewPager = findViewById(R.id.vp_main);

    }
}
