package com.msk.brics;

import com.msk.bricsindia.utils.AppConstants;
import com.msk.bricsindia.utils.CircleTransform;
import com.squareup.picasso.Picasso;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Member_Description extends ActionBarActivity {

	public ImageView personImage;
	public TextView personName, personDesignation, personDescription;
	
	private String name,description,designation;
	private int id;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_member__description);
		
		personImage = (ImageView) findViewById(R.id.member_description_iv);
		personDescription = (TextView) findViewById(R.id.member_description_tv);
		personName = (TextView) findViewById(R.id.member_name_tv);
		personDesignation = (TextView) findViewById(R.id.member_designation_tv);
		
		name=getIntent().getExtras().getString(AppConstants.NAME_KEY);		
		id=getIntent().getExtras().getInt(AppConstants.IMAGE_ID);
		description=getIntent().getExtras().getString(AppConstants.DESCRIPTION_KEY);
		designation = getIntent().getExtras().getString(AppConstants.DESIGNATION_KEY);
		
		//Drawable img=this.getResources().getDrawable(id);
		//personImage.setImageDrawable(img);
		personName.setText(name);
		personDescription.setText(description);
		personDesignation.setText(designation);
		
		Picasso.with(this).load(id).transform(new CircleTransform()).into(personImage);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.member__description, menu);
		return true;
	}

/*	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// Handle action bar actions click
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}*/
}
