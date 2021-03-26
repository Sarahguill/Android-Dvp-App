package com.example.myagenda2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView TextViewMyAgenda;
    Button buttonAddMember;
    ListView List;
    TextView textViewResultName;
    ArrayList<String> itemList;
    ArrayAdapter<String> adapter;
    EditText editTextAttribute;
    EditText editTextChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List = findViewById(R.id.ListView);
        setTitle("Main activity");

        itemList = new ArrayList<>();
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_multiple_choice, itemList);
        Bundle extras = getIntent().getExtras();
        String Str = "";
        if (extras != null){
            String msgName = extras.getString("msgName");
            int index = extras.getInt("index");
            itemList.add(index++,msgName);
            adapter.notifyDataSetChanged();
        }
        //List.addView(adapter);
        List.setAdapter(adapter);
    }

    /*
    public void onClick(View view){
        String Choice = editTextChoice.getText().toString();
        int intChoice = Integer.Choice;
        editTextAttribute = adapter.getItem(intChoice).getAttributionTag();
    }
    */

    public void buttonAddMember(View view) {
        Intent intent = new Intent(this, AddingPart.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
    }
}

