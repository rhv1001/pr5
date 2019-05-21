package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AnadirViaje extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
    public void MenPri (View v){
        Intent intent5 = new Intent (v.getContext(), MenPri.class);
        startActivityForResult(intent5, 0);
    }
}