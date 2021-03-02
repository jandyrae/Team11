package com.example.team11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Chronometer simpleTimer;
    private boolean running;
    private long pauseOffset; // use to calculate time paused

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate views
        simpleTimer = (Chronometer) findViewById(R.id.simpleTimer);
        simpleTimer.setFormat("Time: %s");
        simpleTimer.setBase(SystemClock.elapsedRealtime());
        simpleTimer.setOnChronometerTickListener(chronometer -> {
            if ((SystemClock.elapsedRealtime() - chronometer.getBase()) >= 60000){
//                line below would stop the clock at the above set time (maybe after set amount of hours)
//                chronometer.setBase(SystemClock.elapsedRealtime());
//                could give a message a certain time (maybe a time to take a quick break)
                Toast.makeText(MainActivity.this, "Great Start, 1 minute down!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void startTimer(View v) {
        // if not running this will start the timer (and subtract the time from stopped/paused)
        if (!running){
            simpleTimer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            simpleTimer.start();
            running = true;
        }
    }
    public void pauseTimer(View v) {
        // no way to stop only pause, this will take the time and subtract the time stopped
        if (running) {
            simpleTimer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - simpleTimer.getBase();
            running = false;
        }}
    public void resetTimer(View v) {
//     stops the timer and clears the paused hold so it will truly reset
        simpleTimer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }
}