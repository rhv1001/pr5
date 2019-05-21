package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BuscarViaje extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscarviaje);
    }
    public void ResultadoViaje (View v){
        Intent intent6 = new Intent(v.getContext(), ResultadoViaje.class);
        startActivityForResult(intent6, 0);

    }
}