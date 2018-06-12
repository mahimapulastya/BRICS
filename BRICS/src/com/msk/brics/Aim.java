package com.msk.brics;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Aim extends ActionBarActivity {
	
	public ListView Aim_list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aim);
		
		Aim_list = (ListView)findViewById(R.id.aim_list);
		String aims[] = {"Establish a working group for creating BRICS Council, which will serve as a communicative platform for youth organisation of BRICS", 
				"Representatives of the working group will hold joint meetings and conferences atleast once in three months", 
				"Mark youth policy as a priority for the interaction between the BRICS countries.",
				"Establish Coordination Council of programs in BRICS in business, innovation, leadership, humanitarian, political and scientific fields", 
				"Form a specialized unified communication centerfor interaction betweenyouth BRICS leaders in internet", 
				"Develop intercultural and interethnic dialogue, promoting public harmony and tolerance among youth of BRICS countries", 
				"Develop a plan of cooperation within BRICS for Social Development and support of social programs",
				"Organize a system of youth internships, exchanges in the educational and humanitarian spheres",
				"Create a division of the Development of BRICS, aimed at supporting youth initiative in entrepreneurship and innovations"};	

		
		MyListAdapter adapterObject = new MyListAdapter(Aim.this, aims);
		Aim_list.setAdapter(adapterObject);


	}

	private class MyListAdapter extends BaseAdapter
	{
		private String aims[];
		
		private Context context;
		private LayoutInflater inflater;

		public MyListAdapter(Context context, String aim_content[]){
			this.context = context;
			this.aims = aim_content;
			
			inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		//@Override
		public int getCount() {
			return aims.length;
		}

		//@Override
		public Object getItem(int arg0) {
			return null;
		}

		//@Override
		public View getView(final int position, View convertView, ViewGroup parent) 
		{
			final Holder holder;
			if(convertView==null)
			{
				holder = new Holder();
				convertView = inflater.inflate(R.layout.aim_item_list_layout, null);
				holder.nameV = (TextView) convertView.findViewById(R.id.aim_text);
				convertView.setTag(holder);
			}
			else
			{
				holder = (Holder) convertView.getTag();
			}
			holder.nameV.setText(this.aims[position]);	

			return convertView;
		}
		//@Override
		public long getItemId(int position) {
			return 0;
		}
	}
	static class Holder
	{
		TextView nameV;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aim, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent intent5 = new Intent(Aim.this, MainActivity.class);
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
