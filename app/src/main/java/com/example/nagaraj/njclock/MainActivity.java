package com.example.nagaraj.njclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
AnalogClock clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk=(AnalogClock) findViewById(R.id.analogClock);
        clk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "the time is Neeyae Parthukuda", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
