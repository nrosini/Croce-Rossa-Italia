package com.example.nicolo.crocerossa;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Quest_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
