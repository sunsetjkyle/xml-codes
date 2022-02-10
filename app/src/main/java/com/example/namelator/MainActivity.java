package com.example.namelator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText first = findViewById(R.id.first);
                EditText middle = findViewById(R.id.second);
                EditText last = findViewById(R.id.last);

                String firstname = first.getText().toString();
                String middlename = middle.getText().toString();
                String lastname = last.getText().toString();

                TextView fullname = findViewById(R.id.allnames);
                fullname.setText(firstname + " "+middlename+" "+lastname);

            }
        });
    }
}