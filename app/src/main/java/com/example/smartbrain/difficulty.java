package com.example.smartbrain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class difficulty extends AppCompatActivity implements View.OnClickListener{
    Button EasyBtn;
    Button mediamBtn;
    Button hardBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficulty);

        EasyBtn = findViewById(R.id.EasyBtn);
        EasyBtn.setOnClickListener(this);

        mediamBtn = findViewById(R.id.mediamBtn);
        mediamBtn.setOnClickListener(this);

        hardBtn = findViewById(R.id.hardBtn);
        hardBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.EasyBtn:
                Intent intent = new Intent(difficulty.this, question.class);
                startActivity(intent);
                break;

            case R.id.mediamBtn:
                Intent intent1 = new Intent(difficulty.this,question.class);
                startActivity(intent1);
                break;

            case R.id.hardBtn:
                Intent intent2 = new Intent(difficulty.this,question.class);
                startActivity(intent2);
                break;
        }
    }
}
