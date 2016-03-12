package com.example.android.csgomaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void activityDust2 (View view){
        Intent d2 = new Intent(this, dust2.class);
        startActivity(d2);
    }
    public void activityinferno (View view){
        Intent inferno = new Intent(this, inferno.class);
        startActivity(inferno);
    }
    public void activitycobb (View view){
        Intent cobb = new Intent(this, cobb.class);
        startActivity(cobb);
    }
    public void activitytrain (View view){
        Intent train = new Intent(this, Train.class);
        startActivity(train);
    }
    public void activitymirage (View view){
        Intent mirage = new Intent(this, mirage.class);
        startActivity(mirage);
    }
    public void activitycache (View view){
        Intent cache = new Intent(this, cache.class);
        startActivity(cache);
    }







}
