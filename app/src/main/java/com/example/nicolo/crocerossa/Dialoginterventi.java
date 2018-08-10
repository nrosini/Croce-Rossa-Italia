package com.example.nicolo.crocerossa;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import java.util.ArrayList;

public class Dialoginterventi extends DialogFragment {
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        final ArrayList interventiSelezionati = new ArrayList();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Scegli gli interventi..").setMultiChoiceItems(R.array.Interventi, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if (b) {
                    interventiSelezionati.add(i);
                } else if(interventiSelezionati.contains(i)) {
                    interventiSelezionati.remove(Integer.valueOf(i));
                }
            }
        })
                .setPositiveButton("Conferma", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Annulla", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        return builder.create();
    }
}
