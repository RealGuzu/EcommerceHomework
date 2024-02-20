package com.example.ecommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.ecommereceredo.R;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends Activity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        initializeViews();

        auth = FirebaseAuth.getInstance();

        TextView orSignupTextView = findViewById(R.id.orSignup);
        Button loginButton = findViewById(R.id.btnLogin);
        EditText emailEditText = findViewById(R.id.txtEmail);
        EditText passwordEditText = findViewById(R.id.etxtPassword);

        orSignupTextView.setOnClickListener(v -> openSignUp());
        loginButton.setOnClickListener(v -> {
            if (areFieldsEmpty(emailEditText, passwordEditText)) {
                showToast("Some fields are still empty");
            } else {
                loginWithEmailAndPassword(emailEditText.getText().toString(), passwordEditText.getText().toString());
            }
        });
    }

    private void initializeViews() {
        getWindow().setStatusBarColor(ContextCompat.getColor(Login.this, R.color.black));
    }

    private boolean areFieldsEmpty(EditText... editTexts) {
        for (EditText editText : editTexts) {
            if (editText.getText().toString().trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void loginWithEmailAndPassword(String email, String password) {
        auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        showToast("Login successful");
                        openMain();
                    } else {
                        showToast("Login failed: " + task.getException().getMessage());
                    }
                });
    }

    private void openSignUp() {
        startActivity(new Intent(this, SignUp.class));
    }

    private void openMain() {
        startActivity(new Intent(this, MainActivity.class));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
