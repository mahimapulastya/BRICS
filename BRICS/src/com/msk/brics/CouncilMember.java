package com.msk.brics;
import com.msk.bricsindia.utils.CircleTransform;
import com.squareup.picasso.Picasso;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class CouncilMember extends ActionBarActivity {
	public ListView councilMemberList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_councilmembers);

		councilMemberList = (ListView) findViewById(R.id.councilmember_list);
		String councilmember_names[] = {"Ms. Tatiana Seliverstova","Mr. Rozovskey","Mrs. Purnima Anand","Mr Du Dong","Teboho Meshack Sehloho"};
		String councilmember_position[] = {
				"Head, International Department, Russian Union of Youth, \nGeneral Director of Eurasian Trade and Investment Alliance",
				
				"Counsellor and Head of the Cultural Department of the Embassy of the Russian"
						+ " Federation in India, \nDirector of the Russian Centre of Science & Culture in New Delhi, Federal Agency of ROSSOTRUDNICHESTVO in India",
						"President of International Federation of Indo Russian Youth Clubs",

		"Director of International Department of All China Youth Federation","Assistant Director: Gauteng City Region Academy, \nGauteng Provincial Government"};


		Integer councilmember_photo[] ={R.drawable.tatiana,R.drawable.rozovskey,R.drawable.purnima_anand, R.drawable.dudong,R.drawable.teboho};
		Integer flag_photo[] ={R.drawable.russia_flag,R.drawable.russia_flag,R.drawable.flag_india, R.drawable.china_flag,R.drawable.guateng_flag};


		MyListAdapter adapterObject = new MyListAdapter(this,councilmember_names, councilmember_position,councilmember_photo, flag_photo);
		councilMemberList.setAdapter(adapterObject);		



	}
	private class MyListAdapter extends BaseAdapter
	{
		private String councilmember_name[];
		private String councilmember_position[];
		private Integer flag_image[];
		private Integer councilmember_photo[];
		private Context context;
		private LayoutInflater inflater;
		public MyListAdapter(Context context ,String councilmember_names[],String councilmember_position[], Integer councilmember_photo[],Integer flag_photo[] )
		{
			this.context = context;
			this.councilmember_name = councilmember_names;
			this.councilmember_position = councilmember_position;
			this.councilmember_photo = councilmember_photo;
			this.flag_image= flag_photo;
			inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		}
		//@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return councilmember_name.length;
		}

		//@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		//@Override
		public View getView(final int position, View convertView, ViewGroup parent) 
		{
			final Holder holder;
			if(convertView==null)
			{
				holder = new Holder();
				convertView = inflater.inflate(R.layout.bifcouncilmemberlistlayout, null);
				holder.nameV = (TextView) convertView.findViewById(R.id.name_of_councilmember_tv);
				holder.positionV = (TextView) convertView.findViewById(R.id.position_of_councilmember_tv);
				holder.photoV = (ImageView) convertView.findViewById(R.id.councilmember_photo_iv);
				holder.flagV=(ImageView) convertView.findViewById(R.id.flag_image);
				//Picasso.with(CouncilMember.this).load(councilmember_photo[position]).transform(new CircleTransform()).into(holder.photoV);
				convertView.setTag(holder);
			}
			else
			{
				holder = (Holder) convertView.getTag();
			}
			holder.nameV.setText(this.councilmember_name[position]);
			holder.positionV.setText(this.councilmember_position[position]);	
			holder.photoV.setImageResource(councilmember_photo[position]);
			holder.flagV.setImageResource(flag_image[position]);
			Picasso.with(CouncilMember.this).load(councilmember_photo[position]).transform(new CircleTransform()).into(holder.photoV);
			
			return convertView;
		}
		//@Override
		public long getItemId(int position) {
			return 0;
		}				
	}
	static class Holder
	{
		TextView nameV,positionV;
		ImageView photoV, flagV;		
	}


	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent intent5 = new Intent(CouncilMember.this, MainActivity.class);
		startActivity(intent5);
		super.onBackPressed();
	}

}
