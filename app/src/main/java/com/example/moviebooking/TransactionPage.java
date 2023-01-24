package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        EditText name,phone,email;
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        
        Button book = findViewById(R.id.book);

        String a,b,c;
        a = i.getStringExtra("Title");
        b = i.getStringExtra("Time");
        c = i.getStringExtra("Amount");

        title.setText(a);
        time.setText(b);
        amount.setText(c);

        DataManager dm = new DataManager(this);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TransactionPage.this,BillingPage.class);
                dm.insert(name.getText().toString(),title.getText().toString(),email.getText().toString(),phone.getText().toString(),time.getText().toString(),amount.getText().toString());
                i.putExtra("showBill", name.getText().toString());
                startActivity(i);
            }
        });
    }
}