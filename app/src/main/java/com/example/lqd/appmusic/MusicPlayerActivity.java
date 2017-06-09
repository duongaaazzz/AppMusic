package com.example.lqd.appmusic;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


public class MusicPlayerActivity extends AppCompatActivity {

    ImageView imgLayoutBackground;

    TextView txtSongName,txtSingerName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_music_player);

        init();



    }

    private void init() {



        imgLayoutBackground = (ImageView)findViewById(R.id.img_layout_background);

        //Blur Img




        setTypeFont();

    }

    private void setTypeFont() {

        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/icielBrandonText-Bold.ttf");

        txtSongName.setTypeface(typeface);
        txtSingerName.setTypeface(typeface);



    }



}
