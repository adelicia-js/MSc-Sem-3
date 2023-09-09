package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.Button;
import android.content.Intent;

public class PuppyVideo extends AppCompatActivity {
    Button home_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puppy_video);
        VideoView videoView = (VideoView) findViewById(R.id.puppy_video);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.puppy1); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play

        MediaController mediaController = new MediaController(this); //link mediaController to videoView
        mediaController.setAnchorView(videoView); //allow mediaController to control our videoView
        videoView.setMediaController(mediaController);

        home_btn = findViewById(R.id.home);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(home_intent);
            }
        });
    }
}