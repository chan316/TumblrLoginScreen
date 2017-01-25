package com.codepath.tumblrloginscreen;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements LoginDialogFragment.LoginDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLoginMain = (Button) findViewById(R.id.btnLoginMain);

        btnLoginMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LoginDialogFragment dialog = new LoginDialogFragment();
                dialog.show(getFragmentManager(), "dialog");
            }
        });
    }

    public void onLoginClick(DialogFragment dialog) {
        dialog.dismiss();
    }
}