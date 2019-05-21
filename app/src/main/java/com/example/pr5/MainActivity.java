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
    public void MeteCuenta (View v){
        Intent intent10 = new Intent (v.getContext(), MatDesign.class);
        startActivityForResult(intent10, 0);
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
        setContentView(R.layout.buscarviaje);
    }
    public void ResultadoViaje (View v){
        Intent intent6 = new Intent(v.getContext(), ResultadoViaje.class);
        startActivityForResult(intent6, 0);

    }
}
class ResultadoViaje extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultadoviaje);
    }
}
class Ayuda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda);
    }
}
class Feedback extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
    }
}
class MatDesign extends AppCompatActivity {
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
}
class Notificaciones extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);
    }

}
class MetodoPago extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodospagomaterialdesign);
    }

}
class Sobre extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);
    }

}
class Ajustes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajustes);
    }

}