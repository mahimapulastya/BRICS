package com.msk.brics;

import com.msk.bricsindia.fragment.PastEvent_1_fragment;

import android.os.Bundle;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class EventDescription extends ActionBarActivity
{

	private TextView eventDescription;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_description);

		//	getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		ActionBar bar = getSupportActionBar();
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		bar.setDisplayShowTitleEnabled(true);
		bar.setDisplayShowHomeEnabled(true);

		eventDescription = (TextView) findViewById(R.id.text1);

		String text[] = getIntent().getStringArrayExtra("description");
		int position = getIntent().getIntExtra("pos",0);
		Intent intent = new Intent();
		if(intent!=null)
		{
			eventDescription.setText(text[position]);
		}
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub

		Intent intent5 = new Intent(EventDescription.this, PastEvents.class );
		startActivity(intent5);
		super.onBackPressed();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_event_description, menu);
		return true;
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
}
