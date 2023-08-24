package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button explicit_btn, implicit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    explicit_btn = findViewById(R.id.explicit_intent);
    implicit_btn = findViewById(R.id.implicit_intent);

    explicit_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent intent = new Intent(getBaseContext(), Redirected.class);
        startActivity(intent);
        }
    });

    implicit_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=XAXwmMu8otM&pp=ygUIY3V0ZSBjYXQ%3D"));
            startActivity(intent);
        }
    });

    Toast.makeText(getApplicationContext(), "At home", Toast.LENGTH_LONG).show();

    }
}