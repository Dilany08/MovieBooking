package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        TextView data = findViewById(R.id.result2);
        Button delete = findViewById(R.id.deletebtn);
        EditText delET = findViewById(R.id.delET);
        DataManager dm = new DataManager(this);
        Intent i = getIntent();
        data.setText(i.getStringExtra("viewAll"));

    }
}