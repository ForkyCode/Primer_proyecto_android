package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class catalogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
    }

    public void onClickBtnnis(View view) {
        Intent intent = new Intent(this, nissan.class);
        startActivity(intent);
    }
    public void onClickBtnbmw(View view) {
        Intent intent = new Intent(this, bmw.class);
        startActivity(intent);
    }
    public void onClickBtnsub(View view) {
        Intent intent = new Intent(this, subaru.class);
        startActivity(intent);
    }

    public void onClickBtnhome1(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}