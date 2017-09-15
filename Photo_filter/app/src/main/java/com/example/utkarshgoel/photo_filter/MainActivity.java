package com.example.utkarshgoel.photo_filter;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    Drawable pic1;
    Bitmap bitmapImage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1=(ImageView)findViewById(R.id.imageView1);

      /*  Drawable[] layers=new Drawable[2];
        layers[0]=getResources().getDrawable(R.drawable.squareinsta,null);
        layers[1]=getResources().getDrawable(R.drawable.superthumb,null);
        LayerDrawable layerDrawable=new LayerDrawable(layers);
        imageView1.setImageDrawable(layerDrawable);*/


        pic1=getResources().getDrawable(R.drawable.squareinsta,null);
        bitmapImage1=((BitmapDrawable)pic1).getBitmap();
        Bitmap newphoto=invertImage(bitmapImage1);
        imageView1.setImageBitmap(newphoto);

        MediaStore.Images.Media.insertImage(getContentResolver(), newphoto, "title", "desciption"); //for saving image to gallery, NOT working but
    }

    public  static  Bitmap invertImage(Bitmap original){

        Bitmap finalImage=Bitmap.createBitmap(original.getWidth(),original.getHeight(),original.getConfig());

        int A,R,G,B; //a is alpha value. for transparency;
        int pixelColor;
        int height=original.getHeight();
        int width=original.getWidth();

        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                pixelColor=original.getPixel(j,i);
                A= Color.alpha(pixelColor);
                R= 255-Color.red(pixelColor);
                G= 255-Color.green(pixelColor);
                B= 255-Color.blue(pixelColor);
                finalImage.setPixel(j,i,Color.argb(A,R,G,B));
            }
        }
        return  finalImage;
    }
}
