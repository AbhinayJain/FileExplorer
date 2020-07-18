package com.abhi.fileexplorer.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

import com.abhi.fileexplorer.R;


public class VideoActivity extends AppCompatActivity {

    VideoView videoView;
    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);

        videoView = findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
           path = bundle.getString("videoPath");


            Uri uri= Uri.parse(path);

            //Setting MediaController and URI, then starting the videoView
            videoView.setMediaController(mediaController);
            videoView.setVideoURI(uri);
            videoView.requestFocus();
            videoView.start();

        }else{
            finish();
        }


    }
}
