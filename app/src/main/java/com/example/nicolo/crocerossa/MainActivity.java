package com.example.nicolo.crocerossa;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(getResources().getColor(R.color.redDark));
        setContentView(R.layout.activity_main);

    }

    public void switchViews(View view) {
        startActivity(new Intent(MainActivity.this,
                Activity_registrazione.class));
    }
}
