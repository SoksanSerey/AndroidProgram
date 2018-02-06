package com.example.soksan.webviewof3button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LeftFragment.LeftFragmentListener {

    @Override
    public void setURL(String url){
        RightFragment rightFragment=(RightFragment)getSupportFragmentManager().findFragmentById(R.id.rightFrag);
        rightFragment.getURL();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
