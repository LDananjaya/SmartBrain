package com.example.smartbrain;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class LogIn extends AppCompatActivity implements View.OnClickListener {

    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        login = findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogIn.this, dashBoard.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Login:
                Intent intent = new Intent(LogIn.this, dashBoard.class);
                startActivity(intent);
                break;
        }
    }
}
