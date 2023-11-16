package com.example.testexcel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_presentacion extends AppCompatActivity {

    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        btnVolver = findViewById(R.id.btnVolver);

        // Agrega un OnClickListener para manejar el clic del botón
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para volver a MainActivity
                Intent intent = new Intent(activity_presentacion.this, ingresos.class);
                startActivity(intent);
            }
        });
    }
}