package com.msk.brics;


import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Splash extends Activity {

	private ImageView logoImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

	}


	@Override
	public void onResume() 
	{
		super.onResume();
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() 
		{
			public void run() 
			{
				Intent intent = new Intent(Splash.this,MainActivity.class);
				startActivity(intent);
				finish();
			}}, 3000);  
	}
}