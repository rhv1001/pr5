package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenPri extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);
    }
    public void AnadirViaje (View v){
        Intent intent5 = new Intent (v.getContext(), AnadirViaje.class);
        startActivityForResult(intent5, 0);
    }
    public void BuscarViaje (View v){
        Intent intent5 = new Intent (v.getContext(), BuscarViaje.class);
        startActivityForResult(intent5, 0);
    }
    public void MaterialDesign (View v){
        Intent intent10 = new Intent (v.getContext(), MatDesign.class);
        startActivityForResult(intent10, 0);
    }
    public void Chats (View v){
        Intent intent23 = new Intent (v.getContext(), Chats.class);
        startActivityForResult(intent23, 0);
    }
}
