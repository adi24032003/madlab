package com.example.myapplication6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, password;
    RadioGroup gender;
    CheckBox terms;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextTextPassword);
        gender = findViewById(R.id.radioo);
        terms = findViewById(R.id.checkBox);
        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validate name
                if (name.getText().toString().isEmpty()) {
                    name.setError("Enter your name");
                    return;
                }

                // Validate password
                if (password.getText().toString().isEmpty()) {
                    password.setError("Enter password");
                    return;
                }

                // Validate password length
                if (password.length() < 8) {
                    password.setError("Password must contain 8 characters");
                    return;
                }

                // Validate gender
                if (gender.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(
                            MainActivity.this,
                            "Select gender",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }

                // Validate checkbox
                if (!terms.isChecked()) {
                    Toast.makeText(
                            MainActivity.this,
                            "Accept terms and conditions",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }

                // All validations passed
                Toast.makeText(
                        MainActivity.this,
                        "Registration Successful",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}