package com.example.utkarshgoel.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Utkarsh Goel on 01-Mar-16.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater utkinflater=LayoutInflater.from(getContext());
        View customView=utkinflater.inflate(R.layout.custom_list, parent, false);
     String foodItem=getItem(position);
        TextView text1=(TextView)customView.findViewById(R.id.text1);
        ImageView imageView1=(ImageView)customView.findViewById(R.id.imageView1);
        text1.setText(foodItem);
    imageView1.setImageResource(R.drawable.pavbhaji);
        return  customView;
    }

    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_list,foods);


    }
}
