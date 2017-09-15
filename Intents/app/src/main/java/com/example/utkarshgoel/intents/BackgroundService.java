package com.example.utkarshgoel.intents;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Utkarsh Goel on 26-Feb-16.
 */
public class BackgroundService extends IntentService {
    String TAG="com.example.utkarshgoel.intents";
    public BackgroundService() {
        super("Background Service");
    }
//public Context context;
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG,"Service has now been started.");

        Toast.makeText(this,"Service has now been started.",Toast.LENGTH_LONG).show();
    }
}
