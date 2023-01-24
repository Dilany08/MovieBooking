package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BillingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_page);
        TextView title1,title2,title3,title4,title5,time1,time2,time3,time4,time5,tvName,tvNumber,tvEmail,price;
        TextView id = findViewById(R.id.id);

        tvName = findViewById(R.id.tvName);
        Intent i = getIntent();
        DataManager dm = new DataManager(this);
        id.setText(i.getStringExtra("showBill"));
        tvName.setText(dm.showData(dm.search(id.getText().toString())));



    }
}