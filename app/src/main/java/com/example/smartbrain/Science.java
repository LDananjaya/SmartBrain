package com.example.smartbrain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Science extends AppCompatActivity {

    private TextView mainName,selectLevel;
    private Button easy,medium,hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science);



        selectLevel=(TextView)findViewById(R.id.textView2);
        selectLevel.setText("Choose your level ");

        easy =(Button)findViewById(R.id.button1);
        easy.setText("Easy Level");

        medium=(Button)findViewById(R.id.button2);
        medium.setText("Medium Level");

        hard=(Button)findViewById(R.id.button3);
        hard.setText("Hard Level");

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityHard();
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMedium();
            }
        });
    }

    private void openActivityMedium() {

        Intent intent = new Intent(this,Medium1.class);
        startActivity(intent);

    }

    private void openActivityHard() {

        Intent intent = new Intent(this,Hard1.class);
        startActivity(intent);
    }

    private void openActivity() {

        Intent intent = new Intent(this,FinalPage.class);
        startActivity(intent);
    }
}
