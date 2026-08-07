package com.example.myapplication5;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numInput1, numInput2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        numInput1 = findViewById(R.id.numInput1);
        numInput2 = findViewById(R.id.numInput2);
        textView = findViewById(R.id.textView);

        // Initialize buttons
        Button add = findViewById(R.id.button7);
        Button sub = findViewById(R.id.button8);
        Button mul = findViewById(R.id.button9);
        Button div = findViewById(R.id.button10);

        // Addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('+');
            }
        });

        // Subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('-');
            }
        });

        // Multiplication
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('*');
            }
        });

        // Division
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('/');
            }
        });
    }

    private void performCalculation(char operation) {

        String input1 = numInput1.getText().toString().trim();
        String input2 = numInput2.getText().toString().trim();

        // Check for empty inputs
        if (input1.isEmpty() || input2.isEmpty()) {
            textView.setText("Please enter both numbers.");
            return;
        }

        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        textView.setText("Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;

                default:
                    textView.setText("Invalid operation.");
                    return;
            }

            textView.setText("Result: " + result);

        } catch (NumberFormatException e) {
            textView.setText("Please enter valid numbers.");
        }
    }
}