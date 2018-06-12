package com.msk.brics;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class About_brics extends ActionBarActivity {

	public TextView abtBrics;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_brics);
		
		abtBrics = (TextView) findViewById(R.id.text1);
		abtBrics.setText("The term BRIC was coined in 2001 by the chairman "
				+ "of Goldman Sachs Asset Management , Jim O’Neil’s . BRICS is an acronym for an association of five major emerging national economies: "
				+ "Brazil, Russia, India, China which became BRICS with the inclusion of South Africa. "
				+ "All of them are G20 members. They vary with respect to the political systems, demographic trends, economic size, "
				+ "growth and trade. The idea behind their teaming up is to foster rapid development through "
				+ "cooperation and share the prosperity among themselves as well as the other nations. BRICS is a platform for dialogue and cooperation amongst countries for the promotion of peace, security and development in a multilateral, interdependent and increasingly complex, globalising world. Together, the 5  countries comprise more than "
				+ "2.8 billion people or 40 percent of the world’s population, cover more than a quarter of the world’s land area over three continents, and account for more than"
				+ " 25 percent of global GDP. Accelerating growth and sustainable development are amongst their top priorities along with addressing economic development, eradicating poverty, combating hunger and malnutrition");}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_brics, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent intent5 = new Intent(About_brics.this, MainActivity.class);
		startActivity(intent5);
		super.onBackPressed();
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
