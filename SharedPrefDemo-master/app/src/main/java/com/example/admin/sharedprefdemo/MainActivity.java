package com.example.admin.sharedprefdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    TextView textView;
    Button save,display;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.enterName);
        textView = (TextView) findViewById(R.id.setName);
    }
    public void saveData(View v)
    {
        SharedPreferences preferences = getSharedPreferences("myfile", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();

        edit.putString("name",name.getText().toString());
        edit.apply();
        Toast.makeText(this,"Saved successfully",Toast.LENGTH_LONG).show();
    }

    public void displayData(View v)
    {
        SharedPreferences pref = getSharedPreferences("myfile",Context.MODE_PRIVATE);
        String name = pref.getString("name","");
        textView.setText(name);
    }
}
