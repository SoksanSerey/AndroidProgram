package com.example.soksan.bindingservie_001;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    IBinder binder=new MyBinder();
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return binder;
    }
    public class MyBinder extends Binder {
        public MyService getServive(){
            return MyService.this;
        }
    }
    public int add(int x, int y){
        int res=x+y;
        return res;
    }
}
