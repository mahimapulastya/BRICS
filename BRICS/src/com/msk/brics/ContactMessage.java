package com.msk.brics;

import com.msk.bricsindia.adapter.ContactMessageAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class ContactMessage extends ActionBarActivity implements ActionBar.TabListener 
{
	ViewPager Tab;
	ContactMessageAdapter TabAdapter;
	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar bar = getSupportActionBar();
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		bar.setDisplayShowTitleEnabled(true);
		bar.setDisplayShowHomeEnabled(true);
		setContentView(R.layout.activity_contact_message);
		
		TabAdapter = new ContactMessageAdapter(getSupportFragmentManager());
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
		actionBar.addTab(actionBar.newTab().setText("Contact Details").setTabListener(this));
		actionBar.addTab(actionBar.newTab().setText("Send Us a Message").setTabListener(this));

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
		
		Intent intent5 = new Intent(ContactMessage.this, MainActivity.class);
		startActivity(intent5);
		super.onBackPressed();
	}


}
