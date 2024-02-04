package com.example.ecommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class SignUp extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        TextView txt = findViewById(R.id.txtLogin);
        Button btn = findViewById(R.id.btnSignUp);

        btn.setOnClickListener(v -> openlogin());
        txt.setOnClickListener(v -> openlogin());


        getWindow().setStatusBarColor(ContextCompat.getColor(SignUp.this,R.color.black));
    }

    private void openlogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}

