package com.example.nicolo.crocerossa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_registrazione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_registrazione);
    }

    public void switchViews(View view) {
        startActivity(new Intent(Activity_registrazione.this , Quest_activity.class));
    }
}