package com.example.practical2a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("start", "Activity Started!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume", "Activity Resumed!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy", "Activity Destroyed!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restart", "Activity Restarted!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pause", "Activity Paused!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop", "Activity Stopped!");
    }
}