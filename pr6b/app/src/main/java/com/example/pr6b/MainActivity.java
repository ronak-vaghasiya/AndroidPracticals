package com.example.pr6b;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    static final int VIDEO_CAPTURE_REQUEST = 1;
    VideoView videoView;
    Button captureVideoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize VideoView
        videoView = findViewById(R.id.videoView);

        // Initialize Button
        captureVideoButton = findViewById(R.id.captureVideoButton);

        // Set click listener for the button
        captureVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start video capture intent
                Intent videoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(videoIntent, VIDEO_CAPTURE_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == VIDEO_CAPTURE_REQUEST && resultCode == RESULT_OK && data != null) {
            // Set the captured video to the VideoView
            videoView.setVideoURI(data.getData());
            videoView.start();
        }
    }
}
