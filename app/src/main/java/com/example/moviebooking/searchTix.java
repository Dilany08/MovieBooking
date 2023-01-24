package com.example.moviebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class searchTix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_tix);
        EditText searchET = findViewById(R.id.searchET);
        Button btn = findViewById(R.id.searchbtn);
        TextView output = findViewById(R.id.result);
        DataManager dm = new DataManager(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(searchET.getText().toString() == null){
                    searchET.setError("This field must not be empty!");
                }
                else {
                    output.setText(dm.showData(dm.search2(searchET.getText().toString())));
                }
            }
        });

    }
}