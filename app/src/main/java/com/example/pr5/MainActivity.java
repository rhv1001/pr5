package com.example.pr5;

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
        Intent intent1 = new Intent(v.getContext(), MenPri.class);
        startActivityForResult(intent1, 0);
    }
}
class CreaCuenta extends AppCompatActivity{
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
        Intent intent3 = new Intent (v.getContext(), Carreg.class);
        startActivityForResult(intent3, 0);
    }
    public void Registrarse(View v) {
        Intent intent4 = new Intent (v.getContext(), Registrado.class);
        startActivityForResult(intent4, 0);
    }
}
class MenPri extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menuprincipal);
        }
        public void AnadirViaje (View v){
            Intent intent5 = new Intent (v.getContext(), AnadirPago.class);
            startActivityForResult(intent5, 0);
    }
        public void BuscarViaje (View v){

        }
        public void MaterialDesign (View v){
            Intent intent10 = new Intent (v.getContext(), MatDesign.class);
            startActivityForResult(intent10, 0);
        }
}
class MetopagoReg extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_modmetpago);
        }
        public void NuevoPago (View v){
            Intent intent5 = new Intent (v.getContext(), AnadirPago.class);
            startActivityForResult(intent5, 0);
        }
}
class Registrado extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
    public void OtraCuenta (View v){
        Intent intent5 = new Intent(v.getContext(), MeteCuenta.class);
        startActivityForResult(intent5, 0);
    }
    public void MenPri (View v){
        Intent intent6 = new Intent(v.getContext(), MenPri.class);
        startActivityForResult(intent6, 0);

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
        Intent intent7 = new Intent(v.getContext(), MetopagoReg.class);
        startActivityForResult(intent7, 0);
    }
}
class AnadirViaje extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
    public void MenPri (View v){
        Intent intent6 = new Intent(v.getContext(), MenPri.class);
        startActivityForResult(intent6, 0);

    }
}
class BuscarViaje extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
    public void ResultadoViaje (View v){
        Intent intent6 = new Intent(v.getContext(), MenPri.class);
        startActivityForResult(intent6, 0);

    }
}
class ResultadoViaje extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
}
class Ayuda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
}
class Feedback extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regcomp);
    }
}
class MatDesign extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materialdesign);
    }
}