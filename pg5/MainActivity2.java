package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView a1, a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        a1 = findViewById(R.id.n1);
        a2 = findViewById(R.id.n2);

        String name = getIntent().getStringExtra("name");
        String name1 = getIntent().getStringExtra("name1");

        a1.setText("Name: " + name);
        a2.setText("Last Name: " + name1);
    }
}