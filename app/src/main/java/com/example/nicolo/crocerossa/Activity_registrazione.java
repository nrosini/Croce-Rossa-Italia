package com.example.nicolo.crocerossa;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Activity_registrazione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(Color.WHITE);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        setContentView(R.layout.layout_registrazione);
        setTitle("Registrazione");
    }

    public void switchViews(View view) {
        startActivity(new Intent(Activity_registrazione.this , Quest_activity.class));
    }
}
