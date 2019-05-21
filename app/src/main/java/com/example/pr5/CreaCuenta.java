package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CreaCuenta extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacuenta);
    }
    public void MetpagoReg(View v) {
        Intent intent2 = new Intent (v.getContext(), MetopagoReg.class);
        startActivityForResult(intent2, 0);
    }
    public void CocheReg(View v) {
        Intent intent3 = new Intent (v.getContext(), Registracoche.class);
        startActivityForResult(intent3, 0);
    }
    public void Registrarse(View v) {
        Intent intent4 = new Intent (v.getContext(), Registrado.class);
        startActivityForResult(intent4, 0);
    }
}
