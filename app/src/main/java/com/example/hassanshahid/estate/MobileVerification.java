package com.example.hassanshahid.estate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MobileVerification extends AppCompatActivity {
    Button t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_verification);

        t1 = (Button) findViewById(R.id.button8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MobileVerification.this, Signup.class);
                startActivity(it);
            }
        });
    }
}
