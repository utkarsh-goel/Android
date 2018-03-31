package com.example.utkarshgoel.listview;

import android.app.Activity;
import android.app.ListActivity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] food={"Pav Bhaji","Chowmein","Burger","Momos","Dhokla","Pizza","Sambar Dosa","Idli Sambhar","Paneer Tikka","Utpam","Sambhar Vada","Poha","Pasta","Macroni"};
        ListAdapter utkadapter=new CustomAdapter(this,food);
        ListView list1=(ListView)findViewById(R.id.list1);
        list1.setAdapter(utkadapter);

        list1.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,food,Toast.LENGTH_SHORT ).show();
                    }
                }
        );


            }


}
