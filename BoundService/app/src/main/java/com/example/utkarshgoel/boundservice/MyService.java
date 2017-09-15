package com.example.utkarshgoel.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyService extends Service {
    private final IBinder binderObject=new MyBinderClass();
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
      return binderObject;
    }
public String currentTime(){
    SimpleDateFormat sdf=new SimpleDateFormat("HH:MM:SS", Locale.US);
    return sdf.format(new Date());
}
    public  class MyBinderClass extends Binder
    {
        MyService getServiceMethod(){
        return MyService.this;
    }
    }
}
