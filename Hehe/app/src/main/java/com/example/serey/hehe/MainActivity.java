package com.example.serey.hehe;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener
{
    TextView tv=null;
    GestureDetectorCompat compat=null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        compat=new GestureDetectorCompat(this,this);
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e)
    {
        tv.setText("Single Tap");
        return false;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        this.compat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onDoubleTap(MotionEvent e)
    {
        tv.setText("Double Tap");
        return false;
    }
    @Override
    public boolean onDoubleTapEvent(MotionEvent e)
    {
        tv.setText("On Double Tap Event");
        return false;
    }
    @Override
    public boolean onDown(MotionEvent e)
    {
        tv.setText("Down");
        return false;
    }
    @Override
    public void onShowPress(MotionEvent e)
    {
        tv.setText("Show press");
    }
    @Override
    public boolean onSingleTapUp(MotionEvent e)
    {
        tv.setText("SingleTapUp");
        return false;
    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)
    {
        tv.setText("Scrolling");
        return false;
    }
    @Override
    public void onLongPress(MotionEvent e)
    {
        tv.setText("Long press");
    }
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        tv.setText("Fling");
        return false;
    }
}
