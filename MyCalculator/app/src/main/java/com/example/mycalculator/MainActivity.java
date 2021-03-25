package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView TextViewMyCalculator;
    EditText editTextNum1;
    EditText editTextNum2;
    Button buttonAdd;
    Button buttonSous;
    Button buttonMul;
    Button buttonDiv;
    TextView TextViewResult;
    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextViewMyCalculator = findViewById(R.id.TextViewMyCalculator);
        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        //TextViewResult = findViewById(R.id.TextViewResult);
        editTextResult = findViewById(R.id.editTextResult);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSous = findViewById(R.id.buttonSous);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v("MainActivity", "buttonAdd");
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                double result = num1 + num2;
                editTextResult.setText(Double.toString(result));
            }
        });

        buttonSous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v("MainActivity", "buttonSous");
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                double result = num1 - num2;
                editTextResult.setText(Double.toString(result));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v("MainActivity", "buttonMul");
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                double result = num1 * num2;
                editTextResult.setText(Double.toString(result));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v("MainActivity", "buttonDiv");
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                if (num2 == 0){
                    Toast.makeText(getApplicationContext(), "Not allow to make a division by 0", Toast.LENGTH_LONG).show();
                }
                double result = num1 / num2;
                editTextResult.setText(Double.toString(result));
            }
        });
    }
}

