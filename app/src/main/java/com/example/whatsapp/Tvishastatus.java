package com.example.whatsapp;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AppCompatActivity;
public class Tvishastatus extends AppCompatActivity {
    int[] resources = new int[]{
            R.drawable.t1,
            R.drawable.bridge,
    };
    ImageView image;
    ViewFlipper flipperid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvishastatus);
        flipperid=(ViewFlipper) findViewById(R.id.flipperid);
        for (int i = 0; i < resources.length; i++) {
            ImageView image = new ImageView(this);
            image.setImageResource(resources[i]);
            flipperid.addView(image);
        }
            Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
            Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
            flipperid.setInAnimation(in);
            flipperid.setOutAnimation(out);
            flipperid.setFlipInterval(4000);
            flipperid.setAutoStart(true);
    }
}


