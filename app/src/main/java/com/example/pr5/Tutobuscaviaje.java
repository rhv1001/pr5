package com.example.pr5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tutobuscaviaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutobuscaviaje);
    }
    public void Tutoperfil (View v){
        Intent intent23 = new Intent (v.getContext(), Tutoperfil.class);
        startActivityForResult(intent23, 0);
    }
}
