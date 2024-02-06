package com.example.ecommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.google.firebase.auth.FirebaseAuth;

<<<<<<< HEAD
public class SignUp extends Activity {
=======
public class SignUp extends Activity  {
>>>>>>> 8a18fb7 (Ui Changes)

    private FirebaseAuth auth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        auth = FirebaseAuth.getInstance();

        TextView txtLogin = findViewById(R.id.txtLogin);
        Button btnSignUp = findViewById(R.id.btnSignUp);
        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);

        btnSignUp.setOnClickListener(v -> {
            if (areFieldsEmpty(txtUser, txtUsername, txtPassword)) {
                showToast("Some fields are still empty");
            } else {
                signUpWithEmailAndPassword(txtUsername.getText().toString(), txtPassword.getText().toString());
            }
        });

        txtLogin.setOnClickListener(v -> openLogin());

        setStatusBarColor();
    }

    private boolean areFieldsEmpty(EditText... editTexts) {
        for (EditText editText : editTexts) {
            if (TextUtils.isEmpty(editText.getText().toString())) {
                return true;
            }
        }
        return false;
    }

<<<<<<< HEAD
    private void signUpWithEmailAndPassword(String email, String password) {
        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        showToast("Registration successful");
                        openLogin();
                    } else {
                        showToast("Registration failed: " + task.getException().getMessage());
=======
    private void signUpWithEmailAndPassword(String email, String password){
        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task ->{
                    if(task.isSuccessful()) {
                        showToast("Registration successful");
                        openLogin();
                    } else {
                        showToast("Registration");
>>>>>>> 8a18fb7 (Ui Changes)
                    }
                });
    }

<<<<<<< HEAD
=======

>>>>>>> 8a18fb7 (Ui Changes)
    private void openLogin() {
        startActivity(new Intent(this, Login.class));
    }

    private void setStatusBarColor() {
        getWindow().setStatusBarColor(ContextCompat.getColor(SignUp.this, R.color.black));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
