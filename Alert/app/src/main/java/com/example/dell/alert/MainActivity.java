package com.example.dell.alert;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("my dialog box");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setMessage("do you want to continue");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() { // gives the yes option
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent in=new Intent(MainActivity.this,Continue.class);
                        startActivity(in);
                    }
                });
                builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent in= new Intent(MainActivity.this,Exit.class);
                        startActivity(in);
                    }
                });
                builder.create(); //it will make the object of the class
                builder.show();
                
            }
        });




    }
}
