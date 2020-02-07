package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        EditText myTextField = findViewById(R.id.editText);
        String str = myTextField.getText().toString();
        double dollars = (double) Integer.parseInt(str);
        double pounds = dollars * .77;

        goToActivity2(pounds);
    }

    public void goToActivity2(Double pounds){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", pounds);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
    }
}
