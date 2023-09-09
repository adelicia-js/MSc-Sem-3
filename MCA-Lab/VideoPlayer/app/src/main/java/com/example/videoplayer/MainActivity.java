package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button kitty_btn, duck_btn, puppy_btn, cockatiel_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kitty_btn = findViewById(R.id.kitty);
        puppy_btn = findViewById(R.id.puppy);
        duck_btn = findViewById(R.id.chick);
        cockatiel_btn = findViewById(R.id.parrot);
        kitty_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kitty_intent = new Intent(getBaseContext(), KittyVideo.class);
                startActivity(kitty_intent);
            }
        });
        puppy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent puppy_intent = new Intent(getBaseContext(), PuppyVideo.class);
                startActivity(puppy_intent);
            }
        });
        duck_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent duck_intent = new Intent(getBaseContext(), ChickVideo.class);
                startActivity(duck_intent);
            }
        });
        cockatiel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parrot_intent = new Intent(getBaseContext(), CockatielVideo.class);
                startActivity(parrot_intent);
            }
        });
    }
}