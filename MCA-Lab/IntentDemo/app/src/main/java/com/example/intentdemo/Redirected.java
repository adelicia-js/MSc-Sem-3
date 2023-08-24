package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Redirected extends AppCompatActivity {

    Button home_btn;
    TextView hello_text;

    private int[] colors = {Color.BLACK, Color.RED, Color.BLUE, Color.GREEN};

    private int init_color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirected);

        Toast.makeText(getApplicationContext(),"Explicit Intent Demo", Toast.LENGTH_LONG).show();

    home_btn = findViewById(R.id.home_intent);

    home_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
        }
    });
    }

    public void changeColor(View view) {
        hello_text = findViewById(R.id.meow);
        hello_text.setTextColor(colors[init_color]);
        init_color = (init_color+1)%colors.length;
    }

    public void changeSize(View view) {
        hello_text = findViewById(R.id.meow);
        hello_text.setTextSize(120);
    }
}