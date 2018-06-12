package com.msk.bricsindia.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.msk.bricsindia.fragment.PastEvent_1_fragment;
import com.msk.bricsindia.fragment.PastEvent_2_fragment;

public class PastEventsAdapter  extends FragmentStatePagerAdapter
{
	public PastEventsAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i)
	{
		switch(i)
		{
		case 0: return new PastEvent_1_fragment();

		case 1: return new PastEvent_2_fragment() ;
		}

		return null;
	}

	@Override
	public int getCount() 
	{
		return 2;
	}
}
