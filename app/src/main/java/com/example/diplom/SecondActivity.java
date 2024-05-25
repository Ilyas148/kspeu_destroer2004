package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    EditText button1;

    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = findViewById(R.id.button1);

        text1 = findViewById(R.id.text1);

        findViewById(R.id.save).setOnClickListener((view) -> onClickSave());
    }

    class Indicator implements Serializable {
        public int number;
        public String name;
        public int count;

        Indicator(int num, String n)
        {
            number = num;
            name = n;
            count = 0;
        }

        Indicator(int num, String n, int c)
        {
            number = num;
            name = n;
            count = c;
        }
    }

    public void onClickSave()
    {
        ArrayList<Indicator> arr = new ArrayList<>();
        if (button1.getText().toString().matches(""))
        {
            arr.add(new Indicator(1, text1.toString()));
        }
        Intent intent = new Intent(this, ResultActivity.class);
        Bundle args = new Bundle();
        args.putSerializable("ArrayList", arr);
        intent.putExtra("Bundle",args);
        startActivity(intent);
    }
}