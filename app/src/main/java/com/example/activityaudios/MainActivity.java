package com.example.activityaudios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView label;

    MediaPlayer reproductor;
    Button Bpausa, Bdetener, Bcancion1, Bcancion2, Bcancion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label = findViewById(R.id.Ncancion);
        Bpausa = findViewById(R.id.BTNpausa);
        Bdetener = findViewById(R.id.BTNdetener);
        Bcancion1 =findViewById(R.id.can1);
        Bcancion2 = findViewById(R.id.can2);
        Bcancion3 = findViewById(R.id.can3);


        Bpausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }
            }
        });

        Bdetener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor.seekTo(000);
                reproductor.pause();
            }
        });

        Bcancion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("Dinamyte");
                if(reproductor != null){
                    if(reproductor.isPlaying()){
                        reproductor.release();
                        reproductor = null;
                    }
                }
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.can1);
                reproductor.start();
            }
        });

        Bcancion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("Butter");
                if(reproductor != null){
                    if(reproductor.isPlaying()){
                        reproductor.release();
                        reproductor = null;
                    }
                }
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.can2);
                reproductor.start();
            }
        });
        Bcancion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("DNA");
                if(reproductor != null){
                    if(reproductor.isPlaying()){
                        reproductor.release();
                        reproductor = null;
                    }
                }
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.can3);
                reproductor.start();
            }
        });
    }
}