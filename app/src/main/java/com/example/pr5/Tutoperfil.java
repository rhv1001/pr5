package com.example.pr5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tutoperfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoperfil);
    }
    public void MenPri (View v){
        Intent intent23 = new Intent (v.getContext(), MenPri.class);
        startActivityForResult(intent23, 0);
    }
}
