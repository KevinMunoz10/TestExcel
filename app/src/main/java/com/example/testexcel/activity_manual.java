package com.example.testexcel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_manual extends AppCompatActivity {

    Button btnVolver;
    Button btnAbrirNavegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        btnVolver = findViewById(R.id.btnVolver);

        // Agrega un OnClickListener para manejar el clic del botón
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para volver a MainActivity
                Intent intent = new Intent(activity_manual.this, ingresos.class);
                startActivity(intent);
            }
        });

        Button btnAbrirNavegador = findViewById(R.id.btnAbrirNavegador);

        btnAbrirNavegador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://idu.maps.arcgis.com/apps/instant/filtergallery/index.html?appid=656bfd74c2d044b58bf10d14240f24f4&categories=%2Fcategories%2Finfraestructura%20puente";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                startActivity(intent);
            }
        });
    }
}