package com.example.hassanshahid.estate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Hassan Shahid on 5/18/2017.
 */

public class Signup extends Activity {
    Button t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_main);

        t1 = (Button) findViewById(R.id.button4);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Signup.this,PropertySubmit.class);
                startActivity(it);
            }
        });
    }
}
