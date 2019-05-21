package com.example.pr5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MeteCuenta (View v){
        Intent intent10 = new Intent (v.getContext(), MeteCuenta.class);
        startActivityForResult(intent10, 0);
    }
}