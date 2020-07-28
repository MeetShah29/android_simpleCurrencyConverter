package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onConvertClick(View view) {
        EditText editText = findViewById(R.id.currency);
        Double dollars = Double.parseDouble(editText.getText().toString());
        Double pound = dollars * 0.75;
        // Using String.format("%.2f", pound) to get the value with two decimals for eg:- 10.23
        Toast.makeText(this, "Pound: " + String.format("%.2f", pound), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}