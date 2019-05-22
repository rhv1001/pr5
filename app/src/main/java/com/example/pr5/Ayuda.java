package com.example.pr5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ayuda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda);
    }
    public void Feedback (View v){
        Intent intent21 = new Intent (v.getContext(), Feedback.class);
        startActivityForResult(intent21, 0);
    }
}