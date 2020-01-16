package com.sru.itcm1_20.ViewPager;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.sru.itcm1_20.R;

public class clsPageView extends PagerAdapter {

    private int n[] ={1,2,3,4,5,6};
    private Context cont;
    private LayoutInflater inf;
    //--------
    public clsPageView(Context con){this.cont = con;}


    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (ConstraintLayout)object);
    }

    //--------display data


    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        inf = (LayoutInflater) cont.getSystemService(cont.LAYOUT_INFLATER_SERVICE);
        //View v = inf.inflate(R.layout.v_showpager,container,false);
        //TextView t = v.findViewById(R.id.tnumber);
        //t.setText(n[position]+"  ");

      return false;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}