package com.example.utkarshgoel.overflowmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout rl=(RelativeLayout)findViewById(R.id.rl);
        switch(item.getItemId())
        {
            case R.id.red:
                if(item.isChecked())
                    item.setChecked(true);
                else
                    item.setChecked(false);
                rl.setBackgroundColor(Color.RED);
                return true;
            case R.id.green:
                if(item.isChecked())
                    item.setChecked(true);
                else
                    item.setChecked(false);
                rl.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.yellow:
                if(item.isChecked())
                    item.setChecked(true);
                else
                    item.setChecked(false);
                rl.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.blue:
                if(item.isChecked())
                    item.setChecked(true);
                else
                    item.setChecked(false);
                rl.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }
}
