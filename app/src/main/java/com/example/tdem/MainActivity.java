package com.example.tdem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ImageView gif1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gif1 = (ImageView) findViewById(R.id.splash);

        Glide.with(getApplicationContext()).load(R.drawable.tab).into(gif1);

        TimerTask inicio = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),tablas.class);
                startActivity(i);
                finish();
            }
        };
        Timer segundos = new Timer();
        segundos.schedule(inicio,4000);

    }



}