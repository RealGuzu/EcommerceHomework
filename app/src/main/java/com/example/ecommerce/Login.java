package com.example.ecommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

public class Login extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        getWindow().setStatusBarColor(ContextCompat.getColor(Login.this,R.color.black));

        TextView txt = findViewById(R.id.btnLogin);
        TextView txt2 = findViewById(R.id.orSignup);


        txt2.setOnClickListener(v -> openlogin());
        txt.setOnClickListener(v -> openmain());
    }

    public void openlogin() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void openmain (){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}