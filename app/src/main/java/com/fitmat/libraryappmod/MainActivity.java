package com.fitmat.libraryappmod;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog alertDialog = new AlertDialog.Builder(
                this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Alert Dialog");

        // Setting Dialog Message
        alertDialog.setMessage("Welcome to AndroidHive.info");

        // Setting Icon to Dialog
//        alertDialog.setIcon(R.drawable.tick);

//        // Setting OK Button
//        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int which) {
//                // Write your code here to execute after dialog closed
//                Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
//            }
//        });

        // Showing Alert Message
        alertDialog.show();
    }

}
