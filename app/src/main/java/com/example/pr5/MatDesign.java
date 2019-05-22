package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MatDesign extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materialdesign);
    }
    public void Notificaciones (View v){
        Intent intent11 = new Intent(v.getContext(), Notificaciones.class);
        startActivityForResult(intent11, 0);
    }
    public void MetPago (View v){
        Intent intent12 = new Intent(v.getContext(), MetodoPago.class);
        startActivityForResult(intent12, 0);
    }
    public void Ayuda (View v){
        Intent intent13 = new Intent(v.getContext(), Ayuda.class);
        startActivityForResult(intent13, 0);
    }
    public void Sobre (View v){
        Intent intent14 = new Intent(v.getContext(), Sobre.class);
        startActivityForResult(intent14, 0);
    }
    public void Ajustes (View v){
        Intent intent15 = new Intent(v.getContext(), Ajustes.class);
        startActivityForResult(intent15, 0);
    }
    public void Tutorial (View v){
        Intent intent15 = new Intent(v.getContext(), Tutorial.class);
        startActivityForResult(intent15, 0);
    }
    public void Perfil (View v){
        Intent intent15 = new Intent(v.getContext(), PerfilViajesProgramados.class);
        startActivityForResult(intent15, 0);
    }
    public void VuelveMenu (View v){
        Intent intent21 = new Intent(v.getContext(), MenPri.class);
        startActivityForResult(intent21, 0);
    }
}
