package com.example.whatsapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AppCompatActivity;
public class dhrumilstatus extends AppCompatActivity {
    int[] resources = new int[]{
            R.drawable.water,
            R.drawable.temple,
    };
    ImageView image;
    ViewFlipper flipp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhrumilstatus);
        flipp=(ViewFlipper) findViewById(R.id.flipp);
        for (int i = 0; i < resources.length; i++) {
            ImageView image = new ImageView(this);
            image.setImageResource(resources[i]);
            flipp.addView(image);
        }
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        flipp.setInAnimation(in);
        flipp.setOutAnimation(out);
        flipp.setFlipInterval(4000);
        flipp.setAutoStart(true);
    }



    }
