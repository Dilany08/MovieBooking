package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewAllPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_page);

        TextView viewAll = findViewById(R.id.viewAll);


        Intent intent = getIntent();
        viewAll.setText(intent.getStringExtra("viewAll"));

    }
}