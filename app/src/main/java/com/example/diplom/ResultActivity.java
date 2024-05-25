package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends SecondActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resualt);

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        ArrayList<Indicator> arr = (ArrayList<Indicator>) args.getSerializable("ArrayList");

    }
}