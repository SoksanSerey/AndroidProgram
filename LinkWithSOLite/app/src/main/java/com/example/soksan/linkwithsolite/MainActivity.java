package com.example.soksan.linkwithsolite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.xml.sax.DTDHandler;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper dh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dh=new DatabaseHelper(this);
    }
}
