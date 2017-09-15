package com.example.utkarshgoel.animatntrnsitn;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ViewGroup rl;
    Button up;
    Button down;
    Button left;
    Button right;

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

Button up=(Button)findViewById(R.id.up);
        up.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                View butt=(View)findViewById(R.id.butt);
                //TransitionManager.beginDelayedTransition(rl);
                RelativeLayout.LayoutParams pos;
                pos=(RelativeLayout.LayoutParams)butt.getLayoutParams();
                pos.topMargin=pos.topMargin-5;
                butt.setLayoutParams(pos);
            }});
            Button down=(Button)findViewById(R.id.down);
            down.setOnClickListener(new Button.OnClickListener(){
                public void onClick(View v)
                {
                    // moveButton();
                    View butt=(View)findViewById(R.id.butt);
                   // TransitionManager.beginDelayedTransition(rl);
                    RelativeLayout.LayoutParams pos;
                    pos=(RelativeLayout.LayoutParams)butt.getLayoutParams();
                    pos.topMargin=pos.topMargin+5;
                    butt.setLayoutParams(pos);
                }});
                Button left=(Button)findViewById(R.id.left);
                left.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        // moveButton();
                        View butt=(View)findViewById(R.id.butt);
                       // TransitionManager.beginDelayedTransition(rl);
                        RelativeLayout.LayoutParams pos;
                        pos=(RelativeLayout.LayoutParams)butt.getLayoutParams();
                        pos.rightMargin=pos.rightMargin+5;
                        butt.setLayoutParams(pos);
                    }});
                    Button right=(Button)findViewById(R.id.right);
                    right.setOnClickListener(new Button.OnClickListener(){
                        public void onClick(View v)
                        {
                            // moveButton();
                            View butt=(View)findViewById(R.id.butt);
                            RelativeLayout.LayoutParams pos;
                            pos=(RelativeLayout.LayoutParams)butt.getLayoutParams();
                            pos.rightMargin= pos.rightMargin-5;
                            butt.setLayoutParams(pos);
                        }
                    });
     /*   rl=(ViewGroup)findViewById(R.id.rl);
        rl.setOnTouchListener(
                new RelativeLayout.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        moveButton();
                        return true;
                    }
                }
        );*/
    }
   /* public void moveButton()
    {
        View butt=(View)findViewById(R.id.butt);
        TransitionManager.beginDelayedTransition(rl);
        RelativeLayout.LayoutParams position_rules=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
    position_rules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        position_rules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        butt.setLayoutParams(position_rules);
        ViewGroup.LayoutParams size=butt.getLayoutParams();
        size.width=(250);
        size.height=(100);
        butt.setLayoutParams(size);
        Button but=(Button)findViewById(R.id.butt);
        but.setText("Whoopah");
    }*/

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
