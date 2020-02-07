package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String pounds = intent.getStringExtra("message");
        textView2.setText("£ " + pounds);
    }
}
