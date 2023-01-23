package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TransactionPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_page);
        Intent i = getIntent();
        TextView title,time,amount;
        title = findViewById(R.id.title);
        time =findViewById(R.id.time);
        amount = findViewById(R.id.amount);

        String a,b,c;
        a = i.getStringExtra("Title");
        b = i.getStringExtra("Time");
        c = i.getStringExtra("Amount");

        title.setText(a);
        time.setText(b);
        amount.setText(c);


    }
}