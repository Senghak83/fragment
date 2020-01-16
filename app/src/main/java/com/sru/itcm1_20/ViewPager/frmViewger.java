package com.sru.itcm1_20.ViewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.sru.itcm1_20.BasActi;
import com.sru.itcm1_20.R;

public class frmViewger extends BasActi {

    private ViewPager v ;
    private clsPageView pv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_viewger);

       v = findViewById(R.id.vpg);
       clsSlideModel  model = new clsSlideModel(this);
       v.setAdapter(model);
    }

}
