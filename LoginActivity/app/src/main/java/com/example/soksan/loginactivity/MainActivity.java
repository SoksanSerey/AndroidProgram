package com.example.soksan.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText user,pass;
    String username="abc",password="12345";
    Integer i;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);

        Button login=(Button)findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                username=user.getText().toString().trim();//pass value from object to variable
                password=pass.getText().toString().trim();
                Intent intent=new Intent(MainActivity.this,UserLoged.class);
//                startActivity(intent);
//                if(username=="XYZ"&&password=="12345")
//                {
//                    startActivity(intent);
//                }
                if(username.equals("abc")&&password.equals("12345"))
                {
                    Bundle b=new Bundle();
                    b.putString("Name",username);
                    b.putString("Pass",password);
                    intent.putExtras(b);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wrong user name or password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
