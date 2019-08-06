package com.example.smartbrain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Easy4 extends AppCompatActivity {

    private Button b1,b2;
    private TextView score,scoreNO,mainName,questiontag,question;
    private CheckBox anwser1,anwser2,anwser3,anwser4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy4);

        b1=(Button) findViewById(R.id.button1);
        b1.setText("Next");

        scoreNO=(TextView) findViewById(R.id.scoreNo);
        scoreNO.setText("10");



        questiontag=(TextView)findViewById(R.id.questionTag);
        questiontag.setText("Question 04");

        question=(TextView)findViewById(R.id.question) ;
        question.setText("this is the first question");

        anwser1=(CheckBox)findViewById(R.id.anwser1) ;
        anwser1.setText("first anwser");

        anwser2=(CheckBox)findViewById(R.id.anwser2) ;
        anwser2.setText("seconed anwser");

        anwser3=(CheckBox)findViewById(R.id.anwser3) ;
        anwser3.setText("third anwser");

        anwser4=(CheckBox)findViewById(R.id.anwser4) ;
        anwser4.setText("forth anwser");

        score=(TextView)findViewById(R.id.Score) ;
        score.setText("Your Score ");



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });


    }

    private void openActivity2() {
        Intent intent;
        intent = new Intent(this,FinalPage.class);
        startActivity(intent);
    }
}
