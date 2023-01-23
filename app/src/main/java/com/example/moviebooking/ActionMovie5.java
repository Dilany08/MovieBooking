package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActionMovie5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_movie5);

        TextView title = findViewById(R.id.title);
        TextView time1 = findViewById(R.id.time1);
        TextView time2 = findViewById(R.id.time2);
        TextView time3 = findViewById(R.id.time3);
        ImageView back = findViewById(R.id.btnBack);
        ImageView timebtn1 = findViewById(R.id.timeBtn1);
        ImageView timebtn2 = findViewById(R.id.timeBtn2);
        ImageView timebtn3 = findViewById(R.id.timeBtn3);

        timebtn1.setClickable(true);
        timebtn2.setClickable(true);
        timebtn3.setClickable(true);
        back.setClickable(true);
        timebtn1.bringToFront();

        //back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActionMovie5.this, genre1.class);
                Toast.makeText(ActionMovie5.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });

        timebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActionMovie5.this,TransactionPage.class);
                i.putExtra("Title", "Title:" + title.getText().toString() );
                i.putExtra("Time", "Time: " + time1.getText().toString());
                i.putExtra("Amount", "Amount: " + "650.00");
                startActivity(i);
            }
        });

        timebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActionMovie5.this,TransactionPage.class);
                i.putExtra("Title", "Title:" + title.getText().toString() );
                i.putExtra("Time", "Time: " + time1.getText().toString());
                i.putExtra("Amount", "Amount: " + "650.00");
                startActivity(i);


            }
        });

        timebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActionMovie5.this,TransactionPage.class);
                i.putExtra("Title", "Title:" + title.getText().toString() );
                i.putExtra("Time", "Time: " + time1.getText().toString());
                i.putExtra("Amount", "Amount: " + "650.00");
                startActivity(i);
            }
        });

    }
}