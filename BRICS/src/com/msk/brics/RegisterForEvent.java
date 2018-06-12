package com.msk.brics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.msk.bricsindia.adapter.ContactMessageAdapter;
import com.msk.bricsindia.adapter.EventsAdapter;

public class RegisterForEvent extends ActionBarActivity implements ActionBar.TabListener 
{
	ViewPager Tab;
	EventsAdapter TabAdapter;
	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar bar = getSupportActionBar();
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		bar.setDisplayShowTitleEnabled(true);
		bar.setDisplayShowHomeEnabled(true);
		setContentView(R.layout.activity_register_for_event);
		
		TabAdapter = new EventsAdapter(getSupportFragmentManager());
		Tab = (ViewPager) findViewById(R.id.pager);
		Tab.setOnPageChangeListener(
				new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar = getSupportActionBar();
						actionBar.setSelectedNavigationItem(position);                    }
				});
		Tab.setAdapter(TabAdapter);
		actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.addTab(actionBar.newTab().setText("Event").setTabListener(this));
		actionBar.addTab(actionBar.newTab().setText("Register").setTabListener(this));

	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// Handle action bar actions click
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// if nav drawer is opened, hide the action items
		return super.onPrepareOptionsMenu(menu);
	}

	public void onTabReselected(android.support.v7.app.ActionBar.Tab arg0,
			FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	public void onTabSelected(android.support.v7.app.ActionBar.Tab arg0,
			FragmentTransaction arg1) {
		Tab.setCurrentItem(arg0.getPosition());	
		
	}

	public void onTabUnselected(android.support.v7.app.ActionBar.Tab arg0,
			FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent intent5 = new Intent(RegisterForEvent.this, MainActivity.class);
		startActivity(intent5);
		super.onBackPressed();
	}


}