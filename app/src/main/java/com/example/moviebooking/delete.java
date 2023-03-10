package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        ImageView back = findViewById(R.id.btnBack);
        back.setClickable(true);
        TextView data = findViewById(R.id.result2);
        Button delete = findViewById(R.id.deletebtn);
        EditText delET = findViewById(R.id.delET);
        DataManager dm = new DataManager(this);
        Intent i = getIntent();
        data.setText(i.getStringExtra("viewAll"));

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (delET.getText().toString().isEmpty()) {
                    delET.setError("This is a required field!");
                } else {

                    dm.delete(delET.getText().toString());
                    Toast.makeText(delete.this, delET.getText().toString() + " has been cancelled", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(delete.this, MainActivity.class);
                Toast.makeText(delete.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });


    }
}