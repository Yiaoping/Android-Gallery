package com.example.yiaoping.galleryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void startDate(View view){
        Intent intent = new Intent(this, startDateActivity.class);
        startActivity(intent);
    }

    public void startTags(View view){
        Intent intent = new Intent(this, tagsActivity.class);
        startActivity(intent);
    }

    public void startLocation(View view){
        Intent intent = new Intent(this, locationActivity.class);
        startActivity(intent);
    }
}
