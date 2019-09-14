package com.example.androidanimations;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView anm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anm = (ImageView)findViewById(R.id.anm);

        anm.setBackgroundResource(R.drawable.animation);
    }
    public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable frameAnimation =
                (AnimationDrawable) anm.getBackground();
        if(hasFocus) {
            frameAnimation.start();
        } else {
            frameAnimation.stop();
        }
    }
}
