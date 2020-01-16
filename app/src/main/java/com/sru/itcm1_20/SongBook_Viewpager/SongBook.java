package com.sru.itcm1_20.SongBook_Viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.sru.itcm1_20.BasActi;
import com.sru.itcm1_20.R;

public class SongBook extends BasActi {

    private ViewPager v;
    private Fragment []fg = new Fragment[3];
    private String[] t = {"Production","Singer","Song"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_book);

        v = findViewById(R.id.vpg);
        v.setPageTransformer(true, new ZoomOutPageTransformer());
        //v.setBackgroundColor(Color.RED);


        fg[0] = new Song();
        fg[1] = new product();
        fg[2] = new Singer();



        SongBookPager sb = new SongBookPager(getSupportFragmentManager(), fg, t);
        v.setAdapter(sb);


    }
}
