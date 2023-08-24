package com.example.miscdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText principal_input, rate_input, time_input;
    TextView result;
    Button calculate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principal_input = findViewById(R.id.principal);
        rate_input = findViewById(R.id.rate);
        time_input = findViewById(R.id.time);
        result = findViewById(R.id.result);
        calculate_btn = findViewById(R.id.calculate);

        principal_input.setOnClickListener(this);
        rate_input.setOnClickListener(this);
        time_input.setOnClickListener(this);
        result.setOnClickListener(this);
        calculate_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float principal = Float.parseFloat(principal_input.getText().toString());
        float rate = Float.parseFloat(rate_input.getText().toString());
        float time = Float.parseFloat(time_input.getText().toString());
        float result_val = 0;

        if(TextUtils.isEmpty(principal_input.getText().toString())||TextUtils.isEmpty(rate_input.getText().toString())||TextUtils.isEmpty(time_input.getText().toString()))
            return;

        int id = v.getId();
        if(id == R.id.calculate) {
            result_val = (principal*rate*time)/100;
        }

        result.setText("The Simple Interest is "+result_val);

    }
}