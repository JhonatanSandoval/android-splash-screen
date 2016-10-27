package com.academiamoviles.pruebasplash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // inicializando handler
        handler = new Handler();

        // creando un runnable que se va a ejecutar en 2segs
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // abrimos otra actividad
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2 * 1000);

    }
}
