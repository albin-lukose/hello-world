package com.example.itravellercom.samdialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivit extends AppCompatActivity {

    static Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OTPDialog(this);

    }

    public static void OTPDialog(final Context context) {

        dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);





        dialog.setContentView(R.layout.activity_dialog_main);
        dialog.setCancelable(true);
        Button button = (Button) dialog.findViewById(R.id.ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "button Pressed", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        //now that the dialog is set up, it's time to show it
        dialog.show();


    }
}
