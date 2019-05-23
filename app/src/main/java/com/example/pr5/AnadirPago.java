package com.example.pr5;

//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
//import android.view.View;

public class AnadirPago extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modmetpago2);
    }
    public void Anadido (View v){
        Intent intent15 = new Intent(v.getContext(), MetopagoReg.class);
        startActivityForResult(intent15, 0);
    }
}
