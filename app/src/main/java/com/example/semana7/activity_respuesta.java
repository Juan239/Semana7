package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_respuesta extends AppCompatActivity {
    TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        respuesta = findViewById(R.id.txtRespuesta);
        respuesta.setText(getIntent().getStringExtra("Nombre Foto"));
    }
}