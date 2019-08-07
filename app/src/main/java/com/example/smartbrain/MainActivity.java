package com.example.smartbrain;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button playbtn;
    Button exitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playbtn = (Button) findViewById(R.id.playbtn);
        playbtn.setOnClickListener(this);

        exitbtn = findViewById(R.id.exitbtn);
        exitbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.playbtn:
                Intent intent = new Intent(MainActivity.this, LogIn.class);
                startActivity(intent);
                break;

            case R.id.exitbtn:
                finish();
                break;
        }
    }
}
