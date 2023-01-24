package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewAllPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_page);

        TextView viewAll = findViewById(R.id.viewAll);
        ImageView back = findViewById(R.id.btnBack);
        back.setClickable(true);

        Intent intent = getIntent();
        viewAll.setText(intent.getStringExtra("viewAll"));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewAllPage.this, MainActivity.class);
                Toast.makeText(ViewAllPage.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });
    }
}