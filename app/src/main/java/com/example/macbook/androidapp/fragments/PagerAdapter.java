package com.example.macbook.androidapp.fragments;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class PagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();


    public PagerAdapter(FragmentManager fm) {
        super(fm);
        addFragment();
    }



    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }


    @Override
    public int getCount() {
        return fragmentList.isEmpty()?0:fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    public void addFragment(){
        fragmentList.add(new FragmentDetails());
        fragmentList.add(new FragmentActivity());
        fragmentTitleList.add("DETAILS");
        fragmentTitleList.add("ACTIVITY");

    }
}