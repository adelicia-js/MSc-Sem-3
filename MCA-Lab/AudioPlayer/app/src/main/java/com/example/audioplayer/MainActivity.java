package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button pause_button, stop_button, start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pause_button = findViewById(R.id.pause_btn);
        start_button = findViewById(R.id.start_btn);
        stop_button = findViewById(R.id.stop_btn);
        final int[] flag = {1};
        final MediaPlayer mp = new MediaPlayer();
        Uri my_uri = Uri.parse("https://cdn.pixabay.com/audio/2023/01/16/audio_091569a832.mp3");
        mp.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );

        try{
            mp.setDataSource(getApplicationContext(),my_uri);
            mp.prepare();
        }

        catch(IOException e){
            e.printStackTrace();
            Log.d("Import failed","importing audio failed");
        }

        pause_button.setOnClickListener((View view )-> {
            if(flag[0] ==1){
                pause_button.setText("Resume");
            }
            else{
                pause_button.setText("Pause");
            }
            flag[0] = flag[0] *-1;
            mp.pause();
        });

        start_button.setOnClickListener((View view)->{
            mp.start();
        });

        stop_button.setOnClickListener((View view)->{
            mp.stop();
        });
    }
}