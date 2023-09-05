package com.example.parcial2;

import static com.example.parcial2.R.id.btndirec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class Menu extends AppCompatActivity {
    private TextView tvrecibe;
    private String datosRecibidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvrecibe = findViewById(R.id.tvrecibe);

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");

        if (nombre == null || apellido == null) {
            nombre = "Jeremi";
            apellido = "Chacon";
        }

        datosRecibidos = "Bienvenido " + nombre + " " + apellido;
        tvrecibe.setText(datosRecibidos);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("datosRecibidos", datosRecibidos);
    }

    public void onClickBtnCar(View view) {
        Intent intent = new Intent(this, catalogo.class);
        startActivity(intent);
    }

    public void onClickBtnHora(View view) {
        Intent intent = new Intent(this, horario.class);
        startActivity(intent);
    }

    public void onClickBtnDirec(View view) {
        Intent intent = new Intent(this, direccion.class);
        startActivity(intent);
    }
}