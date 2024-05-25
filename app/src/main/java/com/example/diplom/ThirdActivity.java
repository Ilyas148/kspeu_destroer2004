package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TooltipCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

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

        alertLayout.findViewById(R.id.textAlert1).setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                TooltipCompat.setTooltipText(v, "This is a tooltip message!");
                return true;
            }
        });

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Введите данные");
        alert.setView(alertLayout);
        AlertDialog dialog = alert.create();
        dialog.show();
    }

}

