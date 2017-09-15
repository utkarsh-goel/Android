package com.example.utkarshgoel.threads;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Handler handler=new Handler() {
        @Override
        public void handleMessage(Message msg) {
            TextView text1 = (TextView) findViewById(R.id.text1);
            text1.setText("See threading works");
        //    super.handleMessage(msg);
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
        public void trigger_thread(View view)
            {
                Runnable obj=new Runnable() {
                    @Override
                    public void run() {
                        long future_time=System.currentTimeMillis()+5000;
                        while (System.currentTimeMillis()<future_time)
                        {
                            synchronized (this)
                            {
                                try
                                {
                                    wait(future_time - System.currentTimeMillis());
                                }
                                catch (Exception e)
                                {
                                }

                            }
                        }
                        handler.sendEmptyMessage(0);
                    }
                };
              /*  try{
                   long future_time=System.currentTimeMillis()+5000;
                    while ((future_time>System.currentTimeMillis()))
                        synchronized (this)
                        {
                           wait(future_time-System.currentTimeMillis());
                        }

                }
                catch(Exception e){

            }*/
                      /*  TextView text1=(TextView)findViewById(R.id.text1);
                text1.setText("See threading works");*/

                Thread thrd=new Thread(obj);
                thrd.start();
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
}
