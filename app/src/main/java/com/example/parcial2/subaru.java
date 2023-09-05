package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class subaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subaru2);
    }

    public void onClickBtnhome3(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
        public void onClickBtnprevious2(View view) {
            Intent intent = new Intent(this, catalogo.class);
            startActivity(intent);

       }
}
