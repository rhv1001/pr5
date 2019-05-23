package com.example.pr5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Anadecoche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadecoche);
    }
    public void AnadidoCoche (View v) {
        Intent intent2 = new Intent (v.getContext(), Registracoche.class);
        startActivityForResult(intent2, 0);
    }
}
