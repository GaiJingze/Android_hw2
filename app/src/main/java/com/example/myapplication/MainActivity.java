package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animate(findViewById(R.id.button));
    }
    protected  void animate(View view)
    {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view,"scaleX",1,3,1);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view,"scaleY",3,1,3);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(view,"alpha",1,0,1);
        animator1.setRepeatCount(ValueAnimator.INFINITE);
        animator2.setRepeatCount(ValueAnimator.INFINITE);
        animator3.setRepeatCount(ValueAnimator.INFINITE);
        AnimatorSet set = new AnimatorSet();
        set.playTogether(animator1, animator2, animator3);
        set.setDuration(1000);
        set.start();
    }
}
