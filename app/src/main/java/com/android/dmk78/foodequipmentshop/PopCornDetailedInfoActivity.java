package com.android.dmk78.foodequipmentshop;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PopCornDetailedInfoActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textViewTitle;
    TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_corn_detailed_info);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        imageView = findViewById(R.id.imageViewLogo);
        textViewInfo = findViewById(R.id.textViewInfo);
        textViewTitle = findViewById(R.id.textViewTitle);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("imageResourceId",0));
        textViewTitle.setText(intent.getStringExtra("title"));
        textViewInfo.setText(intent.getStringExtra("info"));



    }
}
