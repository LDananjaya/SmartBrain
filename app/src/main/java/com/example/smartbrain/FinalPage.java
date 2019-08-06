package com.example.smartbrain;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class FinalPage extends AppCompatActivity {


    private TextView score,scoreNo,EnterName,Name;
    private Button save,clear,Home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        score=(TextView)findViewById(R.id.score);
        score.setText("Enter your Score");

        /*scoreNo=(TextView)findViewById(R.id.scoreNo);
        scoreNo.setText("10");*/

        EnterName=(TextView)findViewById(R.id.EnterNAme);
        EnterName.setText("Enter your Name");

        Name=(TextView)findViewById(R.id.Name);
        Name.setText("kushan");

        save=(Button)findViewById(R.id.save);
        save.setText("Save");

        clear=(Button)findViewById(R.id.clear);
        clear.setText("Clear");

        Home=(Button)findViewById(R.id.home);
        Home.setText("Home");


    }
}
