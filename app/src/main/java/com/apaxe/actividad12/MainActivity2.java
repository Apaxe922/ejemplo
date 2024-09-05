package com.apaxe.actividad12;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewName = findViewById(R.id.textViewName);

        Intent intent = getIntent();
        String name = intent.getStringExtra("EXTRA_NAME");
        String password = intent.getStringExtra("EXTRA_PASSWORD");

        textViewName.setText(name);
        Toast.makeText(MainActivity2.this, "Contraseña: " + password, Toast.LENGTH_SHORT).show();
    }
}