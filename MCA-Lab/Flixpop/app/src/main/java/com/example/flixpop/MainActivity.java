package com.example.flixpop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signup_intent = findViewById(R.id.signup);

        signup_intent.setOnClickListener(view -> {
            Intent intent = new Intent(getBaseContext(), BarbieReview.class);
            startActivity(intent);
        });

    }

}