package com.example.castropatrick;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Dialog;
import android.view.View;

import androidx.fragment.app.DialogFragment;

public class DialogFragmentCustom extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        String result = getArguments().getString("result");
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        builder.setTitle(R.string.txt_compute_result) .setMessage(result)
                .setNegativeButton(R.string.txt_demo, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialogInterface, int id) {
                        
                    }
                });

        return builder.create();
    }
}
