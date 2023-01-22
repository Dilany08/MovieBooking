package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class genre2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre2);

        //declaring variables
        ImageView back = findViewById(R.id.btnBack);
        Button book1 = findViewById(R.id.book1);
        Button book2 = findViewById(R.id.book2);
        Button book3 = findViewById(R.id.book3);
        Button book4 = findViewById(R.id.book4);
        Button book5 = findViewById(R.id.book5);

        back.setClickable(true);

        //back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genre2.this, GenrePage.class);
                Toast.makeText(genre2.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genre2.this, activity_romanticmovie1.class);
                startActivity(i);
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genre2.this, activity_romanticmovie2.class);
                startActivity(i);
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genre2.this, activity_romanticmovie3.class);
                startActivity(i);
            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genre2.this, activity_romanticmovie4.class);
                startActivity(i);
            }
        });

        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genre2.this, activity_romanticmovie5.class);
                startActivity(i);
            }
        });
    }
}