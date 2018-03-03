package com.example.dell.alert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Exit extends AppCompatActivity {
RelativeLayout r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
        r=(RelativeLayout)findViewById(R.id.r1);
        r.setBackgroundResource(R.drawable.yurip);
    }
}
