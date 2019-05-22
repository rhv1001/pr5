package com.example.pr5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Historial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
    }
    public void Viajesprogramados (View v){
        Intent intent15 = new Intent(v.getContext(), PerfilViajesProgramados.class);
        startActivityForResult(intent15, 0);
    }
    public void Valoraciones (View v){
        Intent intent21 = new Intent(v.getContext(), Valoraciones.class);
        startActivityForResult(intent21, 0);
    }
}
