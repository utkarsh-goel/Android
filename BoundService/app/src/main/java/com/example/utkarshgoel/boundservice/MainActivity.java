package com.example.utkarshgoel.boundservice;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.system.Os;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.ServiceConnection;
import android.widget.TextView;

import com.example.utkarshgoel.boundservice.MyService.MyBinderClass;

public class MainActivity extends AppCompatActivity {
    public void showTime(View v){
        String currentTime=objectMyService.currentTime();
        TextView text1=(TextView)findViewById(R.id.text1);
        text1.setText("The Current time is "+currentTime);
    }

    MyService objectMyService;
    boolean checkBoundStatus=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent i=new Intent(this,MyService.class);
        bindService(i,connectionBinder,BIND_AUTO_CREATE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

 private ServiceConnection connectionBinder=new ServiceConnection() {
     @Override
     public void onServiceConnected(ComponentName name, IBinder service) {
MyBinderClass binderReference=(MyBinderClass)service;
         objectMyService=binderReference.getServiceMethod();
         checkBoundStatus=true;
     }

     @Override
     public void onServiceDisconnected(ComponentName name) {
checkBoundStatus=false;
     }
 };
}
