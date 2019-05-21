package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MeteCuenta extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_meteuser);
        }

        public void Creacuenta(View v) {
            Intent intent = new Intent(v.getContext(), CreaCuenta.class);
            startActivityForResult(intent, 0);

        }

        public void MenPri(View v) {
            Intent intent1 = new Intent(v.getContext(), MenPri.class);
            startActivityForResult(intent1, 0);
        }
}

