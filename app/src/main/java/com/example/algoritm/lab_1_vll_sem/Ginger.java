package com.example.algoritm.lab_1_vll_sem;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class Ginger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ginger);

    }

    public void OpenStartMenu(View view) {

//Получить ссылку на TextView
        TextView lab = (TextView) findViewById(R.id.textView99);
        lab.setText("Sorry, cafe 'Ginger' will open in 4 days.\nWe will be glad to see you in our institution.");

    }

}