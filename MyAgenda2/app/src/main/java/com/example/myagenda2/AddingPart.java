package com.example.myagenda2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddingPart extends AppCompatActivity {
    EditText editTextName;
    EditText editTextAddress;
    EditText editTextNumber;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_part);
        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextNumber = findViewById(R.id.editTextNumber);
        setTitle("Adding Member");
    }

    public void buttonAddClicked(View view){
        String Name = editTextName.getText().toString();
        String Address = editTextAddress.getText().toString();
        String Number = editTextNumber.getText().toString();

        Intent intentName = new Intent(this, MainActivity.class);
        intentName.putExtra("msgName", Name);
        intentName.putExtra("index", index);
        startActivity(intentName);

        finish();
    }

    public void onBackPressed() {
        /*Intent intent = new Intent(SecondActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);*/

        AlertDialog.Builder builder = new AlertDialog.Builder(AddingPart.this);
        builder.setTitle(android.R.string.dialog_alert_title);
        builder.setMessage("Do you want to go back?");
        builder.setNegativeButton(android.R.string.no,null);
        builder.setPositiveButton(android.R.string.yes,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}