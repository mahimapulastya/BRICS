package com.msk.bricsindia.fragment;

import com.msk.brics.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
public class CoSponsor extends Fragment
{
	public TextView heading;
	public ListView Co_Sponsors_List;
	  @Override
	      public View onCreateView(LayoutInflater inflater, ViewGroup container,
	              Bundle savedInstanceState) 
	  	{
		  View rootView = inflater.inflate(R.layout.main_frag, container, false);
	         /* View android = inflater.inflate(R.layout.main_frag, container, false);
	          ((TextView)android.findViewById(R.id.textView)).setText("Main fragment");
	          return android;*/
	          
		  heading = (TextView) rootView.findViewById(R.id.textView1);
	         Co_Sponsors_List = (ListView)rootView.findViewById(R.id.main_list);
	         heading.setText("Co-Sponsor");
	         
	  		String co_sponsor[] = {"Becomes the corporate member of BRICS International Forum.",
	  				"Title space will be provided on all printing collaterals. \n (posters, banners, backdrops, pamphlets etc.)",
	  				"Opportunity to give a presentation/speech about your organisation/products/services during the meet.",
	  				"Opportunity to participate in B2B Meetings.",
	  				"Invitation to Guests in  the event."};
	  		
	  		Co_Sponsors_List.setAdapter(new MyListAdapter(getActivity(), co_sponsor));
	  	
	  		 return rootView;


	  	}

	  	private class MyListAdapter extends BaseAdapter
	  	{
	  		private String co_sponsor[];
	  		
	  		private Context context;
	  		private LayoutInflater inflater;

	  		public MyListAdapter(Context context, String co_sponsor[]){
	  			this.context = context;
	  			this.co_sponsor = co_sponsor;
	  			
	  			inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	  		}
	  		//@Override
	  		public int getCount() {
	  			return co_sponsor.length;
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
	  			holder.nameV.setText(this.co_sponsor[position]);	

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
}