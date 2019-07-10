package com.example.myapplication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
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
        AnimatorSet set = new AnimatorSet();
        set.playTogether(animator1, animator2, animator3);
        set.setDuration(1000);
        set.start();
    }
}
