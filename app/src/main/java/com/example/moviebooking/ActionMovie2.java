package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ActionMovie2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_movie2);

        ImageView back = findViewById(R.id.btnBack);

        back.setClickable(true);

        //back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActionMovie2.this, genre1.class);
                Toast.makeText(ActionMovie2.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });
    }
}