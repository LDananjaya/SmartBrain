package com.example.smartbrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashBoard extends AppCompatActivity implements View.OnClickListener {

    Button historyBtn;
    Button EnglishBtn;
    Button mathsBtn;
    Button ScienceBtn;
    Button dashHomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        historyBtn = findViewById(R.id.historyBtn);
        historyBtn.setOnClickListener(this);

        EnglishBtn = findViewById(R.id.EnglishBtn);
        EnglishBtn.setOnClickListener(this);

        mathsBtn = findViewById(R.id.mathsBtn);
        mathsBtn.setOnClickListener(this);

        ScienceBtn = findViewById(R.id.ScienceBtn);
        ScienceBtn.setOnClickListener(this);

        dashHomeBtn = findViewById(R.id.dashHomebtn);
        dashHomeBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.historyBtn:
                Intent intent = new Intent(dashBoard.this, difficulty.class);
                startActivity(intent);
                break;

            case R.id.dashHomebtn:
                Intent home = new Intent(dashBoard.this, MainActivity.class);
                startActivity(home);
                break;



        }
    }
}
