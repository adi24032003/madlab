package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText name, name1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        name1 = findViewById(R.id.name1);
    }

    public void Click(View view) {

        String n = name.getText().toString();
        String n1 = name1.getText().toString();

        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();

        e.putString("name", n);
        e.putString("name1", n1);
        e.apply();

        Intent i = new Intent(MainActivity.this, MainActivity2.class);

        i.putExtra("name", n);
        i.putExtra("name1", n1);

        startActivity(i);
    }


}
