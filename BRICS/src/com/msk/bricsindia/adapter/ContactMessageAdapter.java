package com.msk.bricsindia.adapter;

import com.msk.bricsindia.fragment.ContactFragment;
import com.msk.bricsindia.fragment.MessageFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ContactMessageAdapter extends FragmentStatePagerAdapter
{
	public ContactMessageAdapter(FragmentManager fm) {
		super(fm);
	}
	@Override
	public Fragment getItem(int i)
	{
		switch(i)
		{
		case 0: return new ContactFragment();

		case 1: return new MessageFragment() ;
		}

		return null;
	}

	@Override
	public int getCount() 
	{
		return 2;
	}
}
