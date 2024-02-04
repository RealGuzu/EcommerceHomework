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

public class SignUp extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        TextView txt = findViewById(R.id.txtLogin);
        Button btn = findViewById(R.id.btnSignUp);
        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);

        btn.setOnClickListener(v -> {
            if (isFieldsEmpty(txtUser, txtUsername, txtPassword)) {
                Toast.makeText(this, "Some fields are still empty", Toast.LENGTH_SHORT).show();
            } else {
                openlogin();
            }
        });

        txt.setOnClickListener(v -> openlogin());

        getWindow().setStatusBarColor(ContextCompat.getColor(SignUp.this, R.color.black));
    }

    private boolean isFieldsEmpty(EditText... editTexts) {
        for (EditText editText : editTexts) {
            if (TextUtils.isEmpty(editText.getText().toString())) {
                return true;
            }
        }
        return false;
    }

    private void openlogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
