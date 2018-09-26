package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BreweryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BreweryFragment())
                .commit();
    }
}
