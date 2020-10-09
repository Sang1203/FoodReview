package com.t3h.foodreview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvkhampha,tvchude,tvtheodoi,tvVitri;
    private EditText edtSeachmain;
    private RecyclerView rcBaiviet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        tvtheodoi = findViewById(R.id.tv_theodoi);
        tvchude = findViewById(R.id.tv_chude);
        tvkhampha = findViewById(R.id.tv_khampha);
        edtSeachmain = findViewById(R.id.edt_timkiem);
        rcBaiviet = findViewById(R.id.rc_baiviet);
    }
}