package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtTittle;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTittle = findViewById(R.id.txt_title);
        button = findViewById(R.id.btn_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });
        txtTittle = findViewById(R.id.txt_title);
        if (getIntent().hasExtra("text")) {
            txtTittle.setText(getIntent().getStringExtra("text"));
        }
    }
}




