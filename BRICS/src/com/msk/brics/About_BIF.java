package com.msk.brics;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class About_BIF extends ActionBarActivity {

	public TextView abtBIF;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about__bif);
		abtBIF = (TextView) findViewById(R.id.abt_bif_text);
		abtBIF.setText("BRICS International Forum (BIF) is a first independent international public organisation, group of governmental and non governmental organizations "
				+ "which aims to encourage and strengthen the multilateral relations within BRICS.");	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about__bi, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent intent5 = new Intent(About_BIF.this, MainActivity.class);
		startActivity(intent5);
		super.onBackPressed();
	}

	/*@Override
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
*/}
