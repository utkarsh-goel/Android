package com.example.utkarshgoel.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView3 = (TextView) findViewById(R.id.textView3);
    }
    public void saveButton(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username", editText1.getText().toString());
        editor.putString("password",editText2.getText().toString());
        editor.apply();
        Toast.makeText(this,"Saved!",Toast.LENGTH_LONG).show();
        editText1.setText("");
        editText2.setText("");
    }
public void displayButton(View view){
    SharedPreferences sharedPreferences=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
    String name=sharedPreferences.getString("username", "");
    String pswrd=sharedPreferences.getString("password","");
    textView3.setText(name+"  "+pswrd);
}
}
