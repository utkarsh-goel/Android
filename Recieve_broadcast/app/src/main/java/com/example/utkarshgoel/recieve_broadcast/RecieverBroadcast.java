package com.example.utkarshgoel.recieve_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class RecieverBroadcast extends BroadcastReceiver {
    public RecieverBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
      //  Bundle data=getIntent().getExtras();
       String msg= intent.getExtras().getString("broadcast");
       // String msg = data.getString("broadcast");
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
