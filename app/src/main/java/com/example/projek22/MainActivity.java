package com.example.projek22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin;

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Info.class);
            startActivity(intent);
        });
    }
}