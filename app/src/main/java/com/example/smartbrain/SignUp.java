package com.example.smartbrain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {


    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signIn = findViewById(R.id.button4);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dash = new Intent(SignUp.this, dashBoard.class);
                startActivity(dash);
            }
        });

    }
}
