package com.example.utkarshgoel.learningsql;

import android.os.Bundle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1;
   // EditText text2;
    TextView textView1;
    DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   text1=(EditText)findViewById(R.id.text1);
   //    text2=(EditText)findViewById(R.id.text2);
         textView1=(TextView)findViewById(R.id.textView1);
        dbHandler=new DBHandler(this,null,null,1);
        printDatabase();
    }

    //Print the database
    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        textView1.setText(dbString);
        text1.setText("");
    }


    //Add a product to the database
    public void addButtonClicked(View view){
      //  int cost=Integer.parseInt(text2.getText().toString());
     //   Products products=new Products(text1.getText().toString(),cost);
        Products products=new Products(text1.getText().toString());
        dbHandler.addProduct(products);
        printDatabase();
    }

    //Delete items
    public void deleteButtonClicked(View view){
       String product_name=text1.getText().toString();
        dbHandler.deleteProduct(product_name);
        printDatabase();
    }
}
