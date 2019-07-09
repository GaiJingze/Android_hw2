package com.example.myapplication;

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
        recyclerView = (RecyclerView) findViewById(R.id.myRecycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);
    }
    class MyAdapter extends RecyclerView.Adapter {

        class Myholder extends RecyclerView.ViewHolder {
            TextView t;
            public Myholder(View view) {
                super(view);
                t = (TextView) view;
            }
        }
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Myholder myholder = new Myholder(new TextView(parent.getContext()));
            return myholder;
        }
        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            Myholder mm = (Myholder) holder;
            if(position==0)
            {
                mm.t.setText((position+1) +".3170105798 盖竞泽");
            }
            else
            {
                mm.t.setText((position+1) +".热搜条目" + (position+1));
            }
            mm.t.setHeight(150);
            mm.t.setWidth(1080);
            mm.t.setTextSize(25);
            if(position%2==0)
            {
                mm.t.setTextColor(Color.parseColor("#8470FF"));
                mm.t.setBackgroundColor(Color.parseColor("#BFEFFF"));
            }
            else
            {
                mm.t.setTextColor(Color.parseColor("#698B22"));
                mm.t.setBackgroundColor(Color.parseColor("#C1FFC1"));
            }
        }
        @Override
        public int getItemCount() {
            return 20;
        }
    }
}
