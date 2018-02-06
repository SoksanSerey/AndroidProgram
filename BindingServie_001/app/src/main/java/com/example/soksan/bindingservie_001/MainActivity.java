package com.example.soksan.bindingservie_001;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import com.example.soksan.bindingservie_001.MyService;

import static com.example.soksan.bindingservie_001.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    public static int flag=1;
    EditText editText,editText1;
    MyService myService;
    boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText=(EditText)findViewById(R.id.editText2);
    }
    public void bindMethod(View view){
        Intent i=new Intent(this, MyService.class);

    }
    public void addMethod
    ServiceConnection sc=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService.MyBinder binder=(MyService.MyBinder)myService;
            myService = binder.getServive();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    }
}
