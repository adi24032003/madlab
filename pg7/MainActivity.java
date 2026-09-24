
package com.example.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Button btn;

    int images[] = {
            R.drawable.day,
            R.drawable.nyt
    };

    int currentindex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.img2);
        btn = findViewById(R.id.btn);
    }

    public void Click(View view) {

        if (currentindex == 0) {
            iv.setImageResource(images[1]);
            currentindex = 1;

        } else {
            iv.setImageResource(images[0]);
            currentindex = 0;
        }
    }
}

