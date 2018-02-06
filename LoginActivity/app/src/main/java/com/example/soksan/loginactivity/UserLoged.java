package com.example.soksan.loginactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserLoged extends AppCompatActivity {

    TextView user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_loged);
        Bundle bundle=getIntent().getExtras();

        user=(TextView)findViewById(R.id.userN);
        pass=(TextView)findViewById(R.id.password);

        String name= bundle.getString("Name");
        String password=bundle.getString("Pass");

        user.setText("Welcome "+name);
        pass.setText("Your password is "+password);
    }
}
