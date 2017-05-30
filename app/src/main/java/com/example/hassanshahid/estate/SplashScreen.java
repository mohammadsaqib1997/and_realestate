package com.example.hassanshahid.estate;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class SplashScreen extends Activity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_act);

        Thread timer = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(2000);
                } catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                } finally {
                    finish();
                    startActivity(new Intent(SplashScreen.this, SecondScreen.class));
                }
            }
        };
        timer.start();
    }
}

