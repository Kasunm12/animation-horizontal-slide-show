package com.hasthiya.horizontalslideapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView background_image = findViewById(R.id.background_image);
        AnimationDrawable animationDrawable = (AnimationDrawable) background_image.getDrawable();
        animationDrawable.start();
    }
}