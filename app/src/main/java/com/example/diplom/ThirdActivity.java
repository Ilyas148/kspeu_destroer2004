package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TooltipCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.View.OnLongClickListener;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    Button buttonDialog;
    int selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        buttonDialog = (Button)findViewById(R.id.buttonData);

        Spinner spinner = findViewById(R.id.spinnerData);
        selected = spinner.getSelectedItemPosition();

    }

    public void onClickData(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.layout_custom_dialog, null);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Введите данные");
        alert.setView(alertLayout);
        AlertDialog dialog = alert.create();
        dialog.show();
        // Optional: Add a long click listener to show the tooltip (if you want it to show programmatically)
        alertLayout.findViewById(R.id.textAlert1).setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TooltipCompat.setTooltipText(v, "This is a tooltip message!");
                // Fallback using Toast
                Toast.makeText(ThirdActivity.this, "This is a tooltip message!", Toast.LENGTH_SHORT).show();
                Log.d("ThirdActivity", "Button long clicked");
                return true;
            }
        });

    }

}

