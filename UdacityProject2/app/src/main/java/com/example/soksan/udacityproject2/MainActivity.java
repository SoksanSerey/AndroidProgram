package com.example.soksan.udacityproject2;

import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView quan,price;
    boolean a=true;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void submitOrder(View v){
            Toast.makeText(MainActivity.this,"Your order has been submit successfully!",Toast.LENGTH_LONG).show();
            recreate();
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void addQuantity(View v){
        while(true){
            num++;
            display(num);
            break;
        }
        while(true){
            displayPrice(num*2);
            break;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void minusQuantity(View v){
        while(true){
            num--;
            display(num);
            break;
        }
        while(true){
            displayPrice(num*2);
            break;
        }
    }

    private void display(int i) {
        quan=(TextView)findViewById(R.id.quantity_textview);
        quan.setText(""+i);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void displayPrice(int i){
        price=(TextView)findViewById(R.id.price_textview);
        price.setText(NumberFormat.getCurrencyInstance().format(i));
    }

}
