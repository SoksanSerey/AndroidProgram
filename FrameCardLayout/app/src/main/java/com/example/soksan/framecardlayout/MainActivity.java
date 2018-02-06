package com.example.soksan.framecardlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    Button next,prev;
    int pageNum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout=(FrameLayout)findViewById(R.id.frameLayout);

        next=(Button) findViewById(R.id.next);
        prev=(Button) findViewById(R.id.prev);

        final int count = frameLayout.getChildCount();
        for(int i=1;i<count;i++){
            frameLayout.getChildAt(i).setVisibility(View.GONE);
        }

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameLayout.getChildAt(pageNum).setVisibility(View.GONE);
                if(pageNum>0){
                    pageNum=pageNum-1;
                    frameLayout.getChildAt(pageNum).setVisibility(View.VISIBLE);
                }
                else{
                    frameLayout.getChildAt(0).setVisibility(View.VISIBLE);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameLayout.getChildAt(pageNum).setVisibility(View.GONE);
                if (pageNum<9){
                    pageNum=pageNum+1;
                    frameLayout.getChildAt(pageNum).setVisibility(View.VISIBLE);
                }else{
                    frameLayout.getChildAt(9).setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
