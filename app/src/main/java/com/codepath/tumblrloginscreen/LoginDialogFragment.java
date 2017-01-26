package com.codepath.tumblrloginscreen;

import android.app.Activity;
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
   public interface LoginDialogListener {
       public void onLoginClick(DialogFragment dialog);
   }

    LoginDialogListener mListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            mListener = (LoginDialogListener) activity;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement NoticeDialogListener");
        }


    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View loginView = layoutInflater.inflate(R.layout.login_dialog, null);

        final AlertDialog.Builder alertD = new AlertDialog.Builder(getActivity());


        Button btnLogin = (Button) loginView.findViewById(R.id.btnLogin);
        btnLogin.setFocusable(false);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Logged in!",
                    Toast.LENGTH_LONG).show();
                mListener.onLoginClick(LoginDialogFragment.this);


            }
        });


        alertD.setView(loginView);

//        alertD.show();
        return alertD.create();
    }
}
