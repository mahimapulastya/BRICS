package com.msk.brics;

import com.msk.bricsindia.adapter.SponsorsAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Sponsors extends ActionBarActivity implements ActionBar.TabListener{

	ViewPager Tab;
    SponsorsAdapter TabAdapter;
    ActionBar actionBar;
	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sponsors);
		
		ActionBar bar = getSupportActionBar();
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		bar.setDisplayShowTitleEnabled(true);
		bar.setDisplayShowHomeEnabled(true);
		
		TabAdapter = new SponsorsAdapter(getSupportFragmentManager());
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
		actionBar.addTab(actionBar.newTab().setText("\tMain \nSponsor").setTabListener(this));
		actionBar.addTab(actionBar.newTab().setText("Associate \n Sponsor").setTabListener(this));
		actionBar.addTab(actionBar.newTab().setText("\t  Co \nSponsor").setTabListener(this));
	}
	
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// if nav drawer is opened, hide the action items
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sponsors, menu);
		return true;
	}

	//@Override
	public void onTabReselected(android.support.v7.app.ActionBar.Tab arg0,
			FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onTabSelected(android.support.v7.app.ActionBar.Tab arg0,
			FragmentTransaction arg1) {
		Tab.setCurrentItem(arg0.getPosition());		
	}

	//@Override
	public void onTabUnselected(android.support.v7.app.ActionBar.Tab arg0,
			FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
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
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent intent5 = new Intent(Sponsors.this, MainActivity.class);
		startActivity(intent5);
		super.onBackPressed();
	}

}  