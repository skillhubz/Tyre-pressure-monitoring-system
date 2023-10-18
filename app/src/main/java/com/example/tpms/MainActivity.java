package com.example.tpms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        button = (Button) findViewById( R.id.loginbutton12);
        button.setOnClickListener(view -> openActivity3());
    }


    public void openActivity3(){
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}