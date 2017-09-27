package com.example.yiaoping.galleryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tagsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tags);
    }

    public void filterImage(View view){
        Intent intent = new Intent(this, showPictures.class);
        startActivity(intent);
    }
}
