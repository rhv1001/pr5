package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Registracoche extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modcar);
    }
    public void Anadecoche(View v) {
        Intent intent2 = new Intent (v.getContext(), Anadecoche.class);
        startActivityForResult(intent2, 0);
    }
}