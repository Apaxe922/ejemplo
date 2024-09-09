package com.apaxe.actividad12;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Toast;
//Valentina Campo Giraldo
public class Destino extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destino);

        textViewName = findViewById(R.id.textViewName);

        Intent intent = getIntent();
        String name = intent.getStringExtra("EXTRA_NAME");
        String password = intent.getStringExtra("EXTRA_PASSWORD");

        textViewName.setText(name);
        Toast.makeText(Destino.this,
                "Contraseña: " + password, Toast.LENGTH_SHORT).show();
    }
}

