package com.example.nicolo.crocerossa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Quest_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_quest);

    }
}
