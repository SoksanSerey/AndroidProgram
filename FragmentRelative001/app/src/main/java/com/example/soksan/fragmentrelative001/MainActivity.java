 package com.example.soksan.fragmentrelative001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

 public class MainActivity extends AppCompatActivity implements seekBarFragment.TopFragListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
