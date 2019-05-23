package com.example.pr5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PerfilViajesProgramados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_viajes_programados);
    }
    public void Historial (View v){
        Intent intent15 = new Intent(v.getContext(), Historial.class);
        startActivityForResult(intent15, 0);
    }
    public void Valoraciones (View v){
        Intent intent21 = new Intent(v.getContext(), Valoraciones.class);
        startActivityForResult(intent21, 0);
    }
    public void Materialdesign (View v) {
        Intent intent15 = new Intent(v.getContext(), MaterialDesignPerfil.class);
        startActivityForResult(intent15, 0);
    }
}
