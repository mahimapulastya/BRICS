package com.msk.bricsindia.adapter;

import com.msk.bricsindia.fragment.Associate;
import com.msk.bricsindia.fragment.CoSponsor;
import com.msk.bricsindia.fragment.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
public class SponsorsAdapter extends FragmentStatePagerAdapter {
    public SponsorsAdapter(FragmentManager fm) {
    super(fm);
    // TODO Auto-generated constructor stub
  }
  @Override
  public Fragment getItem(int i) {
    switch (i) {
        case 0:
           
            return new Main();
        case 1:
           
            return new Associate();
        case 2:
            
            return new CoSponsor();
        }
    return null;
  }
  @Override
  public int getCount() {
    // TODO Auto-generated method stub
    return 3; //No of Tabs
  }
    }


