package com.msk.brics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import com.msk.bricsindia.adapter.CustomExpandAdapter;
import com.msk.bricsindia.fragment.ChildFragment;
import com.msk.brics.SampleTO;
import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.app.FragmentManager;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements SurfaceHolder.Callback
{
	private DrawerLayout mDrawerLayout;
	// private ListView mDrawerList;
	private ExpandableListView mDrawerList;
	private LinearLayout navDrawerView;
	CustomExpandAdapter customAdapter;
	private ActionBarDrawerToggle mDrawerToggle;
	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	private String[] mAboutUsTitles,mCountriesTitles,mEventsTitles;
	private int selectedPosition;
	List<SampleTO> listParent;
	HashMap<String, List<String>> listDataChild;

	private int IMAGE_ARRAY[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3, R.drawable.slide4};
	private int currentImageIndex = 0;
	private ImageView imageSlider;
	private TextView aim1 , aim2, aim3;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imageSlider = (ImageView)findViewById(R.id.backgroundSlider);
		aim1= (TextView)findViewById(R.id.text_aim1);
		aim2= (TextView)findViewById(R.id.text_aim2);

		aim3= (TextView)findViewById(R.id.text_aim3);
		aim1.setText("Creation of a worldwide youth dialogue in civilizational, cultural and humanitarian "
				+ "spheres as a basis for political and economic "
				+ "cooperation among the BRICS countries");
		aim2.setText("Establish Coordination Council of programs in BRICS in business, innovation, leadership, humanitarian, "
				+ "political and scientific fields.");
		aim3.setText("Creation of platform for interaction between youth associations of BRICS" +
				" countries through the work of youth organizations of BRICS countries.");
		animateAndSlideShow();


		mTitle = mDrawerTitle = getTitle();
		/* mTitle = "Home";
       mDrawerTitle = "BRICS";*/
		navDrawerView = (LinearLayout) findViewById(R.id.navDrawerView);

		mEventsTitles= getResources().getStringArray(R.array.events_array);
		mAboutUsTitles= getResources().getStringArray(R.array.aboutUs_array);
		//mCountriesTitles = getResources().getStringArray(R.array.countries_array);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		// mDrawerList = (ListView) findViewById(R.id.left_drawer);
		mDrawerList = (ExpandableListView) findViewById(R.id.nav_left_drawer);
		// set a custom shadow that overlays the main content when the drawer
		// opens
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		listParent = new ArrayList<SampleTO>();
		listDataChild = new HashMap<String, List<String>>();
		// Navigation Drawer of Flight starts
		listParent.add(new SampleTO(getString(R.string.about), R.drawable.brics_about));
		listParent.add(new SampleTO(getString(R.string.events), R.drawable.brics_event));
		listParent.add(new SampleTO(getString(R.string.countries), R.drawable.brics_countries));
		listParent.add(new SampleTO(getString(R.string.sponsors), R.drawable.brics_sponsors));
		listParent.add(new SampleTO(getString(R.string.aim), R.drawable.brics_aim));
		listParent.add(new SampleTO(getString(R.string.contact), R.drawable.brics_contact));
		listParent.add(new SampleTO(getString(R.string.share), R.drawable.brics_share));
		listParent.add(new SampleTO(getString(R.string.rate), R.drawable.brics_rate));
		listParent.add(new SampleTO(getString(R.string.map), R.drawable.brics_map));

		listDataChild.put(getString(R.string.about), Arrays.asList(mAboutUsTitles));
		listDataChild.put(getString(R.string.events),  Arrays.asList(mEventsTitles));
		listDataChild.put(getString(R.string.countries), new ArrayList<String>());
		listDataChild.put(getString(R.string.sponsors), new ArrayList<String>());
		listDataChild.put(getString(R.string.aim), new ArrayList<String>());
		listDataChild.put(getString(R.string.contact), new ArrayList<String>());
		listDataChild.put(getString(R.string.share), new ArrayList<String>());
		listDataChild.put(getString(R.string.rate), new ArrayList<String>());
		listDataChild.put(getString(R.string.map), new ArrayList<String>());

		customAdapter = new CustomExpandAdapter(this, listParent, listDataChild);
		// setting list adapter
		mDrawerList.setAdapter(customAdapter);
		mDrawerList.setChoiceMode(ExpandableListView.CHOICE_MODE_SINGLE);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close)
		{
			public void onDrawerClosed(View view) 
			{
				getSupportActionBar().setTitle(mTitle);
				supportInvalidateOptionsMenu(); 
			}

			public void onDrawerOpened(View drawerView)
			{
				getSupportActionBar().setTitle(mDrawerTitle);
				supportInvalidateOptionsMenu(); 
			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

	@Override
	protected void onResume()
	{
 		super.onResume();
		mDrawerList.setOnGroupClickListener(new OnGroupClickListener() 
		{
			public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
				int index = parent.getFlatListPosition(ExpandableListView.getPackedPositionForGroup(groupPosition));
				parent.setItemChecked(index, true);
				String parentTitle = ((SampleTO) customAdapter.getGroup(groupPosition)).getTitle();
				if(groupPosition != 0 && groupPosition != 1)
				{
					switch(groupPosition)
					{        		
					
					case 2: Intent intent2 = new Intent(MainActivity.this, Countries.class);
					startActivity(intent2);
					break;
						
					case 3: Intent intent3 = new Intent(MainActivity.this, Sponsors.class);
					startActivity(intent3);
					break;

					case 4: Intent intent4 = new Intent(MainActivity.this, Aim.class);
					startActivity(intent4);
					break;

					case 5: Intent intent5 = new Intent(MainActivity.this, ContactMessage.class);
					startActivity(intent5);
					break;
					
					case 6: 
						try
						{ Intent i = new Intent(Intent.ACTION_SEND);  
						i.setType("text/plain");
						Context context = MainActivity.this;
						i.putExtra(Intent.EXTRA_SUBJECT, "BRICS International Youth Forum India");
						String sAux = "https://play.google.com/store/apps/details?id="+ context.getPackageName()+"\n\n";
						i.putExtra(Intent.EXTRA_TEXT, sAux);  
						// startActivity(Intent.createChooser(i, "Complete Action Using"));
						startActivity(i);

						}
						catch(Exception e)
						{ 
						}   
						break;
					
					case 7: 
						Context context= MainActivity.this;
						Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
						Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
						try {
							startActivity(goToMarket);

						} catch (ActivityNotFoundException e) {
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));

						}
						break;
					
					case 8:	final Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/place/24,+Firoz+Shah+Rd,+Vakil+Lane,+Copernicus+Marg,+New+Delhi,+Delhi+110001/@28.6238042,77.2275477,17z/data=!3m1!4b1!4m2!3m1!1s0x390ce2cd49114173:0xfdfbdeb5df67d36a"));
					startActivity(intent9);
					
					break;
					}
				}

				return false;
			}
		});

		mDrawerList.setOnChildClickListener(new OnChildClickListener() {

			public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

				Log.d("CHECK", "child click");

				int index = parent.getFlatListPosition(ExpandableListView.getPackedPositionForChild(groupPosition, childPosition));
				parent.setItemChecked(index, true);

				selectItem(groupPosition,childPosition);

				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu)
	{
		boolean drawerOpen = mDrawerLayout.isDrawerOpen(navDrawerView);
		
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{

		if (mDrawerToggle.onOptionsItemSelected(item)) 
		{
			return true;
		}
		switch (item.getItemId()) {
		
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void selectItem(int groupPosition,int childPosition) 
	{
		int selectedGroupPosition = groupPosition;
		int selectedChildPosition = childPosition;

		mDrawerLayout.closeDrawer(navDrawerView);

		ChildFragment fragment = new ChildFragment(groupPosition,childPosition);
		/* Bundle args = new Bundle();
        args.putInt(AboutUsFragment.SELECTED_POSITION, selectedGroupPosition);
        args.putInt(AboutUsFragment.SELECTED_POSITION, selectedChildPosition);
        fragment.setArguments(args);*/

		//  FragmentManager fragmentManager = getFragmentManager();
		getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).commit();
		// setTitle(mCountriesTitles[selectedPosition]);

	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getSupportActionBar().setTitle(mTitle);
	}

	/**
	 * When using the ActionBarDrawerToggle, you must call it during onPostCreate() and onConfigurationChanged()...
	 */


	//@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	//@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}

	//@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub

	}

	//@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		// TODO Auto-generated method stub

	}

	//@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub

	}

	final Animation.AnimationListener animationListener = new Animation.AnimationListener() {
		//@Override
		public void onAnimationStart(final Animation animation) {
			// nothing to do here
		}

		//@Override
		public void onAnimationEnd(final Animation animation) {
			// launch showing of next image on the end of the animation
			animateAndSlideShow();
		}

		//@Override
		public void onAnimationRepeat(final Animation animation) {
			// nothing to do here
		}
	};

	private void animateAndSlideShow() {

		imageSlider.setBackgroundResource(IMAGE_ARRAY[currentImageIndex % IMAGE_ARRAY.length]);
		currentImageIndex++;
		final AnimationSet animationSet = new AnimationSet(true);
		final Animation fadeOutAnimation = new AlphaAnimation(1.0f, 0.0f);
		final Animation fadeInAnimation = new AlphaAnimation(0.0f, 1.0f);

		animationSet.addAnimation(fadeInAnimation);
		animationSet.addAnimation(fadeOutAnimation);
		fadeInAnimation.setDuration(400);
		fadeInAnimation.setStartOffset(0);
		fadeOutAnimation.setDuration(400);
		fadeOutAnimation.setStartOffset(4000);

		animationSet.setAnimationListener(animationListener);
		imageSlider.startAnimation(animationSet);
	}

}
