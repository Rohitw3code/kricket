package com.api.kricket;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private TextView startBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        startBtn = findViewById(R.id.start_btn);

        startBtn.setOnClickListener(v -> {
            Intent login = new Intent(StartActivity.this, LoginAndSignUpActivity.class);
            startActivity(login);
            finish();
        });
    }
}