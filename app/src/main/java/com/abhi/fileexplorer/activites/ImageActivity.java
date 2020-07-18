package com.abhi.fileexplorer.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.abhi.fileexplorer.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageActivity extends AppCompatActivity {

    ImageView imageView;
    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imageView = findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            path = bundle.getString("imagePath");


            String pic = path;//get path of your image
            Bitmap yourSelectedImage1 = BitmapFactory.decodeFile(pic);
            imageView.setImageBitmap(yourSelectedImage1);

        }else{
            finish();
        }
    }
}
