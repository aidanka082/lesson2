package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    private EditText etText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        etText = findViewById(R.id.et_good);
        button = findViewById(R.id.btn_bat);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this, etText.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Activity1.this, MainActivity.class);
                intent.putExtra("text", etText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
