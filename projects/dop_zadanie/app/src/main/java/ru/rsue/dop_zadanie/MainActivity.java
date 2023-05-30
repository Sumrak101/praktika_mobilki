package ru.rsue.dop_zadanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sunlmageView = (ImageView) findViewById(R.id.sun);
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sunrise);
        sunlmageView.startAnimation(sunRiseAnimation);
    }
}