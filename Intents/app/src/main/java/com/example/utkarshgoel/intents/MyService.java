package com.example.utkarshgoel.intents;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }
public static String TAG="com.example.utkarshgoel.intents";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStartCommand method called");
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                long future_time = System.currentTimeMillis() + 5000;
                while (System.currentTimeMillis() < future_time) {
                    synchronized (this) {
                        try {
                            wait(future_time - System.currentTimeMillis());
                            Log.i(TAG,"service is doing something");
                        } catch (Exception e) {

                        }
                    }
                }
            }}
        };
        Thread abc=new Thread(r);
        abc.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy method called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
