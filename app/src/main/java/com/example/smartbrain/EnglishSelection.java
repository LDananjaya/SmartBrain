package com.example.smartbrain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EnglishSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_selection);
    }

    public void easyPage(View view) {
        startActivity(new Intent(EnglishSelection.this,Englisheasy.class));
    }

    public void HardPage(View view) {
        startActivity(new Intent(EnglishSelection.this,EnglishHard.class));
    }

    public void MediumPage(View view) {
        startActivity(new Intent(EnglishSelection.this,EnglishMedium.class));
    }
}
