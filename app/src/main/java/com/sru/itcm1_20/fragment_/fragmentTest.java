package com.sru.itcm1_20.fragment_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.sru.itcm1_20.BasActi;
import com.sru.itcm1_20.R;

public class fragmentTest extends BasActi {

     private FragmentManager fm;
     private FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);



    }

    public void fr1(View view) {

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ft.replace(R.id.fgm,new fra2());
        ft.commit();

    }

    public void toFrag2(View view) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ft.replace(R.id.fgm,new fra3());
        ft.commit();

    }
}
