package com.example.nicolo.crocerossa;

        import android.app.AlertDialog;
        import android.content.DialogInterface;
        import android.os.Bundle;
        import android.support.v4.app.DialogFragment;
        import java.util.ArrayList;

public class Dialog extends DialogFragment {
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        final ArrayList malattieSelezionate = new ArrayList();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_malattie).setMultiChoiceItems(R.array.malattie, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                //L'elemento selezionato viene aggiunto all'arraylist delle malattie se già presente e riselezionato viene rimosso
                if (b) {
                    malattieSelezionate.add(i);
                } else if (malattieSelezionate.contains(i)) {
                    malattieSelezionate.remove(Integer.valueOf(i));
                }
            }
        })
                .setPositiveButton(R.string.conferma, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton(R.string.Annulla, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        return builder.create();
    }
}
