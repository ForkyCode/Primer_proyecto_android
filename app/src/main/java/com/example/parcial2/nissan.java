package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nissan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissan);
    }

    public void onClickBtnhome4(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void onClickBtnprevious3(View view) {
        Intent intent = new Intent(this, catalogo.class);
        startActivity(intent);
    }

}