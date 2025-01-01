package com.example.snjbcoeauditorium;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    private EditText fullNameEditText, emailEditText, phoneEditText, passwordEditText;
    private Button registerButton;
    private TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Initialize views
        fullNameEditText = findViewById(R.id.fullName);
        emailEditText = findViewById(R.id.email);
        phoneEditText = findViewById(R.id.phone);
        passwordEditText = findViewById(R.id.newPassword);
        registerButton = findViewById(R.id.registerButton);
        loginTextView = findViewById(R.id.loginText);

        // Set up the register button click listener
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = fullNameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String phone = phoneEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Validate input fields
                if (fullName.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUp.this, R.string.signup_failed, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignUp.this, R.string.signup_success, Toast.LENGTH_SHORT).show();
                    // You can add logic to save the registration details here
                }
            }
        });

        // Set up the login text click listener
        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(SignUp.this, MainActivity.class);
                        Toast.makeText(SignUp.this, R.string.login_text, Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
