package com.example.soksan.logginactivity001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);

        Bundle b=getIntent().getExtras();
        String username=b.getString("name");
        String password=b.getString("password");

        textView.setText("Welcome user "+username);
        textView2.setText("Your password is "+password);

    }
}
