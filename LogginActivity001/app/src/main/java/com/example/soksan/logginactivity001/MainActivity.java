package com.example.soksan.logginactivity001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,pass;
    Button loggin;
    String user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);

        loggin=(Button)findViewById(R.id.log);

        loggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,UserActivity.class);
                Bundle b=new Bundle();
                user=name.getText().toString();
                password=pass.getText().toString();

                if (user.equals("abc")&&password.equals("123")){
                    b.putString("name",user);
                    b.putString("password",password);
                    i.putExtras(b);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this,"Username or password is incorrect",Toast.LENGTH_LONG).show();;
                }
            }
        });

    }
}
