package com.sru.itcm1_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sru.itcm1_20.SongBook_Viewpager.SongBook;
import com.sru.itcm1_20.ViewPager.frmViewger;
import com.sru.itcm1_20.fragment_.fragmentTest;
import com.sru.itcm1_20.frament_1.frag;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void VieGer(View view) {
        startActivity(new Intent(MainActivity.this,frmViewger.class));
    }

    public void toFragment(View view) { startActivity(new Intent(this, fragmentTest.class));
    }

    public void toSong(View view) {
        startActivity(new Intent(this, SongBook.class));
    }

    public void tofragAction(View view) {
        startActivity(new Intent(this, frag.class));
    }
}
