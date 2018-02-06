package com.example.soksan.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    RadioButton male,female,other;
    Button button;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        textView=(TextView) findViewById(R.id.genderText);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton)findViewById(R.id.female);
        other=(RadioButton)findViewById(R.id.others);
        button=(Button)findViewById(R.id.click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(male.isChecked()){
                    name=editText.getText().toString().trim();
                    Toast.makeText(MainActivity.this,"Wellome Mr. "+name+". How are you?",Toast.LENGTH_LONG).show();
                }
                else if(female.isChecked()){
                    name=editText.getText().toString().trim();
                    Toast.makeText(MainActivity.this,"Wellome Ms. "+name+". How are you?",Toast.LENGTH_LONG).show();
                }
                else if(other.isChecked()){
                    name=editText.getText().toString().trim();
                    Toast.makeText(MainActivity.this,"Wellome Mr/Ms "+name+". How are you?",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
