package com.naufalrafizi.fadein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void startFadeIn(View v){
        ImageView ivgambar = (ImageView)findViewById(R.id.fadein);

        Animation startAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);

        ivgambar.startAnimation(startAnim);

    }
}
