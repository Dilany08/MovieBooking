package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BillingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_page);

        TextView tvName;
        ImageView btnHome = findViewById(R.id.btnHome);
        btnHome.setClickable(true);

        TextView id = findViewById(R.id.id);
        tvName = findViewById(R.id.tvName);

        Intent i = getIntent();
        DataManager dm = new DataManager(this);
        id.setText(i.getStringExtra("showBill"));
        tvName.setText(dm.showData(dm.search(id.getText().toString())));

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BillingPage.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}