package com.example.ecommerce;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class home_page  extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        Button btn = findViewById(R.id.btnEnter);
        TextView txt = findViewById(R.id.txtSignUp);
        TextView log = findViewById(R.id.txtLog);

        txt.setOnClickListener(v -> opensignup());
        btn.setOnClickListener(v -> openactivitymain());
        log.setOnClickListener(v -> openlogin());

    }

    public void opensignup() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void openactivitymain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


    }
    public void openlogin(){
        Intent intent= new Intent(this, Login.class);
        startActivity(intent);
    }


}
