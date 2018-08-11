package com.example.nicolo.crocerossa;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class Quest_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(Color.WHITE);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        setContentView(R.layout.activity_quest);
        setTitle("Questionario anamnestico");
    }

    public void illSelect (View v) {
        DialogFragment malattie = new Dialog();
        malattie.show(getSupportFragmentManager(),"malattie");
    }

    public void intSelect(View v) {
        Dialoginterventi interventiSubiti = new Dialoginterventi();
        interventiSubiti.show(getSupportFragmentManager(), "Interventi_subiti");
    }

    public void allSelect(View v) {
        Dialogallergie allergie = new Dialogallergie();
        allergie.show(getSupportFragmentManager(),"Allergie");
    }

    public void switchViewa(View view) {
        startActivity(new Intent(Quest_activity.this, Cure_activity.class));
    }
}
