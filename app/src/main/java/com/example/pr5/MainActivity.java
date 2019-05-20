package com.example.pr5;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
class MeteCuenta extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meteuser);
    }

    public void Creacuenta(View v) {
        Intent intent = new Intent(v.getContext(), CreaCuenta.class);
        startActivityForResult(intent, 0);

    }

    public void Entrar(View v) {
        Intent intent = new Intent(v.getContext(), MenPri.class);
        startActivityForResult(intent, 0);
    }
}
class CreaCuenta extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacuenta);
    }
    public void MetpagoReg(View v) {
        Intent intent = new Intent (v.getContext(), MetopagoReg.class);
        startActivityForResult(intent, 0);
    }
    public void CocheReg(View v) {
        Intent intent = new Intent (v.getContext(), Carreg.class);
        startActivityForResult(intent, 0);
    }
    public void Registrarse(View v) {
        Intent intent = new Intent (v.getContext(), Registrado.class);
        startActivityForResult(intent, 0);
    }
}
class MenPri extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menuprincipal);
        }
}
class MetopagoReg extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_modmetpago);
        }
        public void NuevoPago (View v){
            Intent intent = new Intent (v.getContext(), AnadirPago.class);
            startActivityForResult(intent, 0);
        }
}
class Registrado extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
    public void OtraCuenta (View v){
        Intent intent;
        intent = new intent(v.getContext(), MeteCuenta.class);
        startActivityForResult(intent, 0);
    }
    public void MenPri (View v){
        Intent intent = new intent (v.getContext(), MenPri.class);
        startActivityForResult(intent, 0);

    }
}
class Carreg extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modcar);
    }

}

class AnadirPago extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modmetpago2);
    }
    public void Patras (View v) {
        Intent intent;
        intent = new intent (v.getContext(), MetopagoReg.class);
        startActivityForResult(intent, 0);
    }
}