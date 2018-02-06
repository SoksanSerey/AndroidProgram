package com.example.soksan.mixcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private SeekBar seekBar;
    int count=0;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=(SeekBar)findViewById(R.id.seekBar1);
        layout=(RelativeLayout)findViewById(R.id.layout);

        r=new Random();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                count= Color.argb(255,r.nextInt(256),r.nextInt(256),r.nextInt(256));
                layout.setBackgroundColor(count);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Start Tracking",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
