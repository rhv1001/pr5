package com.example.pr5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Valoraciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoraciones);
    }

    public void Historial(View v) {
        Intent intent15 = new Intent(v.getContext(), Historial.class);
        startActivityForResult(intent15, 0);
    }

    public void Viajesprogramados(View v) {
        Intent intent15 = new Intent(v.getContext(), PerfilViajesProgramados.class);
        startActivityForResult(intent15, 0);
    }
    public void Materialdesign (View v) {
        Intent intent15 = new Intent(v.getContext(), MaterialDesignPerfil.class);
        startActivityForResult(intent15, 0);
    }
}