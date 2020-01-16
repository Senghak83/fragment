package com.sru.itcm1_20.SongBook_Viewpager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SongBookPager extends FragmentPagerAdapter {


    private Fragment[] mFragments;
    private final String [] t;

    public SongBookPager(FragmentManager fm, Fragment[] fragments,String []t) {
        super(fm);
        this.mFragments = fragments;
        this.t =t;
    }

    @Override
    public int getCount() {
        return mFragments!=null? mFragments.length : 0;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments!=null ? mFragments[position] : null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return t[position];

    }
}
