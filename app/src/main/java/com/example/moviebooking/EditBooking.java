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

import org.w3c.dom.Text;

public class EditBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_booking);

        Button btnEdit = findViewById(R.id.btnEdit);
        EditText editId = findViewById(R.id.etId);
        Button btnSearch = findViewById(R.id.btnSearch);
        TextView etName = findViewById(R.id.etName);
        EditText etNum = findViewById(R.id.etNum);
        EditText etEmail = findViewById(R.id.etEmail);
        TextView title = findViewById(R.id.etTitle);
        TextView time = findViewById(R.id.etTime);
        TextView amount = findViewById(R.id.etAmount);
        TextView id = findViewById(R.id.id);
        ImageView back = findViewById(R.id.btnBack);
        back.setClickable(true);

        final DataManager dm = new DataManager(this);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editId.getText().toString().isEmpty()){
                    editId.setError("This is a required field!");
                }else {
                    Appdata editData;
                    editData = dm.editData(dm.search2(editId.getText().toString()));
                    id.setText(editData.getId().toString());
                    etName.setText(editData.getName().toString());
                    etNum.setText(editData.getPhone().toString());
                    etEmail.setText(editData.getEmail().toString());
                    title.setText(editData.getTitle().toString());
                    time.setText(editData.getTime().toString());
                    amount.setText(editData.getAmount().toString());


                }
            }
        });
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dm.update(id.getText().toString(),
                        etName.getText().toString(),
                        etNum.getText().toString(),
                        etEmail.getText().toString(),
                        title.getText().toString(),
                        time.getText().toString(),
                        amount.getText().toString());
                Toast.makeText(EditBooking.this,  editId.getText().toString() + "has been updated!", Toast.LENGTH_SHORT).show();
            }
        });

        //back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EditBooking.this, MainActivity.class);
                Toast.makeText(EditBooking.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });


    }
}