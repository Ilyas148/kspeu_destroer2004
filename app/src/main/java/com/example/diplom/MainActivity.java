package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener((view) -> onClickButton1());

        findViewById(R.id.button2).setOnClickListener((view) -> onClickButton1());
    }

    public void onClickButton1() { startActivity(new Intent(MainActivity.this, ThirdActivity.class));}
}