package com.example.parcial2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txnb;
    private EditText txap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txnb = findViewById(R.id.txnb);
        txap = findViewById(R.id.txap);
    }

    public void enviar(View view) {
        String nombre = txnb.getText().toString();
        String apellido = txap.getText().toString();

        Intent intent = new Intent(this, Menu.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);
        startActivity(intent);
    }
}