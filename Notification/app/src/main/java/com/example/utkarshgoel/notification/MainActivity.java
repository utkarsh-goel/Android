package com.example.utkarshgoel.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    NotificationCompat.Builder notification;
    private static final int uniqueID=43443;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification=new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
    }

    public void getNotification(View view){
        //ICON, TEXT, TIME
        notification.setSmallIcon(R.drawable.squareinsta);
        notification.setTicker("This is the ticker.");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("This is the notification title.");
        notification.setContentText("This is notification's text.");

        Intent intent=new Intent(this,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID,notification.build());
    }
}
