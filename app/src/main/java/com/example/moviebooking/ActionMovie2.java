package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActionMovie2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_movie2);
        TextView title,time1,time2,time3;
        ImageView timebtn1,timebtn2,timebtn3;
        title = findViewById(R.id.title);
        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);
        timebtn1 = findViewById(R.id.timeBtn1);
        timebtn2 = findViewById(R.id.timeBtn2);
        timebtn3 = findViewById(R.id.timeBtn3);

        timebtn1.setClickable(true);
        timebtn2.setClickable(true);
        timebtn3.setClickable(true);

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