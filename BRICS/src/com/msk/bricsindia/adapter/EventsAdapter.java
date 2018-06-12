package com.msk.bricsindia.adapter;

import com.msk.bricsindia.fragment.EventNameFragment;
import com.msk.bricsindia.fragment.RegisterForEventFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class EventsAdapter extends FragmentStatePagerAdapter
{

	public EventsAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) 
	{
		switch(i)
		{
		case 0: return new EventNameFragment();

		case 1: return new RegisterForEventFragment() ;
		}

		return null;
	}

	@Override
	public int getCount() 
	{
		return 2;
	}
	

}
