package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GenrePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_page);

        ImageView btn1 = findViewById(R.id.btn1);
        ImageView btn2 = findViewById(R.id.btn2);
        ImageView btn3 = findViewById(R.id.btn3);
        ImageView back = findViewById(R.id.btnBack);

        back.setClickable(true);

        //back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GenrePage.this, MainActivity.class);
                Toast.makeText(GenrePage.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });

        //btn that will proceed to Action Movie list
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GenrePage.this, genre1.class);
                startActivity(i);
            }
        });

        //btn that will proceed to Romantic Movie List
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GenrePage.this, genre2.class);
                startActivity(i);
            }
        });

        //btn that will proceed to Horror Movie List
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GenrePage.this, genre3.class);
                startActivity(i);
            }
        });
    }
}