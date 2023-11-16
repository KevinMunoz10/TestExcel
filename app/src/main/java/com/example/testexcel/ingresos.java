package com.example.testexcel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ingresos extends AppCompatActivity {

    Button btnVolver;
    Button btnPresentacion;
    Button btnManual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);

        btnVolver = findViewById(R.id.btnVolver);

        // Agrega un OnClickListener para manejar el clic del botón
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para volver a MainActivity
                Intent intent = new Intent(ingresos.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnPresentacion = findViewById(R.id.BtnPresentacion);

        btnPresentacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ingresos.this, activity_presentacion.class);
                startActivity(intent);
            }
        });

        btnManual = findViewById(R.id.BtnManualUsuario);

        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ingresos.this, activity_manual.class);
                startActivity(intent);
            }
        });
    }
}
