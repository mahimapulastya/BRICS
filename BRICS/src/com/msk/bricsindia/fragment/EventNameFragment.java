package com.msk.bricsindia.fragment;

import com.msk.brics.R;
import com.msk.brics.R.layout;
import com.msk.brics.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EventNameFragment extends Fragment
{
	private ImageView event_iv;
	private TextView event_name_tv,event_date_tv;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View event_name = inflater.inflate(R.layout.activity_event_name, container, false);
		
		event_iv = (ImageView) event_name.findViewById(R.id.event_iv);
		event_name_tv = (TextView) event_name.findViewById(R.id.event_name_tv);
		event_date_tv = (TextView) event_name.findViewById(R.id.event_date_tv);
		
		event_name_tv.setText("Internet Festival \n Organized by \n International Federation Of Indo Russian Youth Clubs \n jointly with " +
				"\n Russian Centre of Science And Culture");
		event_date_tv.setText("8Th June 2015 From 5:30pm \n Venue: RCSC, 24 Feroz Shah Road, New Delhi");
	
	
	return event_name;
	}
}
