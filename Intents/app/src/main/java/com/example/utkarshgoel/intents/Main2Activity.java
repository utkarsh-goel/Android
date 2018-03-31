package com.example.utkarshgoel.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Bundle activity1_data=getIntent().getExtras();
                //final EditText editText_2=(EditText)findViewById(R.id.editText_2);

                if(activity1_data==null)
                  return;
                final TextView text_2=(TextView)findViewById(R.id.text_2);
                    String Activity1_msg = activity1_data.getString("Activity1_msg");
                    text_2.setText(Activity1_msg);
                }
     //   });
  //  }
    public void onClick(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }


}
