package com.example.dept_elective;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.electives);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            // checkedId is the RadioButton selected
            String msg;
            if(checkedId==R.id.cc_btn){
                Intent intent = new Intent(getApplicationContext(), CloudActivity.class);
                startActivity(intent);
            } else if (checkedId==R.id.iot_btn) {
                msg = "iot";
                Intent intent = new Intent(getApplicationContext(), IOTActivity.class);
                startActivity(intent);
            }
            else
            {
                msg = "cn";
                Intent intent = new Intent(getApplicationContext(), NetworksActivity.class);
                startActivity(intent);
            }


        });
    }
    
    
}