package com.sru.itcm1_20.ViewPager;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.sru.itcm1_20.R;

public class clsSlideModel extends PagerAdapter {

    private Context con ;
    private LayoutInflater infl;

    private int []n ={1,2,3,4,5,6};
    public clsSlideModel(Context con ){this.con = con;}

    @Override
    public int getCount() {
        return n.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //infl = (LayoutInflater) con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
        infl = LayoutInflater.from(con);
        View v = infl.inflate(R.layout.slideview,container,false);

        return v;
        //return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
