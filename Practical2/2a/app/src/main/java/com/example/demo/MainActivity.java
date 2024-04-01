package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("create", "Activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("start", "Activity started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Pause","Activity paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restart","Activity restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume","Activity resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop","Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy","Activity Destroyed");
    }
}