package com.codepath.tumblrloginscreen;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by chanis on 1/25/17.
 */

public class LoginDialogFragment extends DialogFragment  {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View loginView = layoutInflater.inflate(R.layout.login_dialog, null);

        final AlertDialog.Builder alertD = new AlertDialog.Builder(getActivity());


        Button btnLogin = (Button) loginView.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Logged in!",
                    Toast.LENGTH_LONG).show();

            }
        });


        alertD.setView(loginView);

//        alertD.show();
        return alertD.create();
    }
}
