package com.example.hassanshahid.estate;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by Hassan Shahid on 4/16/2017.
 */

public class SplashScreen extends Activity{

    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_act);
//        music = MediaPlayer.create(splashs.this,R.raw.music);
//        music.start();


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
                    Intent Act = new Intent(SplashScreen.this,SecondScreen.class);

                    startActivity(Act);

                }

            }


        };
        timer.start();
    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        music.release();
//        finish();
//    }

}

