package com.msk.brics;

import java.util.LinkedList;
import java.util.List;

import com.msk.bricsindia.utils.AppConstants;
import com.msk.bricsindia.vo.MemberDetailsVO;

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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Member_Organisations extends ActionBarActivity {

	public ListView members_list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_member__organisations);
		members_list = (ListView)findViewById(R.id.member_list);

		final List<MemberDetailsVO> detailsList =new LinkedList<MemberDetailsVO>();
		MemberDetailsVO d1 = new MemberDetailsVO();

		d1.setName("Mr. Rozovskey");
		d1.setDesignation("President of International Federation of Indo Russian Youth Clubs");
		d1.setDescription("The All-Russian public organization Russian Union of Youth» is a non-political, non-governmental, non-profit public youth organization founded in 1990 and has its regional offices in 72 regions of Russia with more than 2,00,000 individual members and more than 10,00,000 program participants."+
				"The Russian Centre of Science and Culture (RCSC) in New Delhi is a Representative office of the Federal Agency for Commonwealth of Independent States, Compatriots Living Abroad and International Humanitarian Cooperation (ROSSOTRUDNICHESTVO) in India. The RCSC organizes different programmes for the citizens of Delhi and guests of the Indian capital. Programmes of the RCSC are dedicated to the achievements of Russian culture and science. Among them there are literary and poetic evenings, meetings with artists, painting exhibitions, book-exhibitions, photo-exhibitions, concerts, performances and gala-functions, presentations, conferences, seminars, discussions. The Library of the RCSC has about 26 000 printed items - books, newspapers, magazines, which provide all kinds of up-to-date information about Russia. The visitors can easily use our cozy reading hall. Our Video-library includes fiction and documentary movies on DVD. The Russian Language Institute of RCSC named after A. Pushkin introduces several modern different level programmes of studying Russian language for Indians and foreigners.");
		d1.setImageID(R.drawable.rozovskey);


		MemberDetailsVO d2 = new MemberDetailsVO();

		d2.setName("Ms. Tatiana Seliverstova");
		d2.setDesignation("Russian Union of Youth \n General Director of Eurasian Trade and Investment Alliance");
		d2.setImageID(R.drawable.tatiana);
		d2.setDescription("The All-Russian public organization Russian Union of Youth is a non-political, non-governmental, non-profit public youth organization founded in 1990 and has its regional offices in 72 regions of Russia with more than 2,00,000 individual members and more than 10,00,000 program participants." +   

				"The All-Russian public organization Russian Union of Youth is a non-political, non-governmental, non-profit public youth organization founded in 1990 and has its regional offices in 72 regions of Russia with more than 2,00,000 individual members and more than 10,00,000 program participants. Russian Union of Youth main goal is to develop personality of a young individual by implementing the programs that let young people expand their range of vision and interests, help them to define their life choice: every year we organize numerous forums, conferences, festivals, workshops and other events. It is an organization for the youth and run by the youth. The RUY works with all categories of youngsters: university and school students, workers and entrepreneurs, artists and sportsmen, scientists and scholars. Every young person can find something interesting here. Throughout the year the RUY organizes educational and scientific, cultural and art, leisure and sports projects and programs on local, regional, federal and international levels. The RUY closely works with Russian governmental structures and the biggest NGOs. RUY always ready to cooperate with youth organizations, public authorities, business community and media, which contribute to comprehensive development of our country and strive to help young people on their life path!");

		MemberDetailsVO d3 = new MemberDetailsVO();

		d3.setName("Mrs. Purnima Anand");
		d3.setDesignation("President of International Federation of Indo Russian Youth Clubs");
		d3.setImageID(R.drawable.purnimaaanand);
		d3.setDescription("The All-Russian public organization Russian Union of Youth» is a non-political, non-governmental, non-profit public youth organization founded in 1990 and has its regional offices in 72 regions of Russia with more than 2,00,000 individual members and more than 10,00,000 program participants."+   

				"IFIRYC originated in 1989 as the International Federation of Indo-Soviet Youth Clubs, during the active moment of GLASNOST and PERESTROIKA under the leadership of Mikhial Garbachov, president of the then Soviet Union and Economic Liberlisation and reformation in India headed by prime minister Rajeev Gandhi under reconciliation exchange programme between Russia and India. In 1991, with the world still recovering from the formation of CIS and official end of USSR, club formally turned into new name International Federation of Indo Russian Youth Clubs (IFIRYC) under the flagship of Russian Federation. Many courageous Russian teenagers ventured across the Asia and were welcomed as IFIRYC “exchangees” into host families in India. Soon a reciprocal programme was established, with youths from India invited to spend time with Russian families. More and more CIS countries have joined the programme since then and the lives of thousands of people have been forever transformed by the IFIRYC exchange programme. Building bridges of peace, justice, and understanding through personal encounters has been our goal over the past 25 years. IFIRYC is open to all persons who subscribe to its stated aims and purposes regardless of their religious affiliation, their nationality, their ethnic background or their socio-economic position. Our programmes have been constantly revised and modified to reflect changes in society at a local, national and global level. IFIRYC is a pioneer organisation for Indo-Russian youth exchange programmes with more than 25 years of experience. It has long and short - term exchange programmes for number of participants annually. It is an international Federation of National Committees in different countries and having an international voluntary service programme promoting young people’s active and global citizenship. It has an international network co-ordinated by national offices and dedicated co-workers, who provide volunteers with the necessary orientation, training and support. IFIRYC IS an experience based programme to enhance young people’s intercultural understanding and commitment to peace and justice The International Federation of Indo-Russian Youth Clubs (IFIRYC) is an international non-profit youth exchange organisation promoting youth mobility, intercultural learning and international voluntary service. IFIRYC organises long and short-term exchanges combining home stays with voluntary service in a variety of community service projects in different countries around the world.");

		MemberDetailsVO d4 = new MemberDetailsVO();

		d4.setName("Mr Du Dong");
		d4.setDesignation("Director of International Department of All China Youth Federation");
		d4.setImageID(R.drawable.dudong);
		d4.setDescription("The All-Russian public organization Russian Union of Youth» is a non-political, non-governmental, non-profit public youth organization founded in 1990 and has its regional offices in 72 regions of Russia with more than 2,00,000 individual members and more than 10,00,000 program participants."+   

				"Established on May 4, 1949, the All-China Youth Federation (ACYF) is a federative body of Chinese youth organizations and excellent youth network nationwide with the Communist Youth League of China as the core. It is a broad patriotic united front organization of youth of all ethnic groups and all walks of life in China. Through its 52 member organizations and over 77,000 individual members at all levels, the ACYF reaches over 300 million young people across China. The highest decision-making body of the ACYF is the National Committee that works for a term of five years. The National Committee has a President, a number of Vice Presidents. When it is not in session, the Standing Committee presides over the Federation's work. The Standing Committee has a Secretary-general and a number of Deputy Secretaries-generals. ACYF Hold aloft the banners of patriotism and socialism, extensively represent and safeguard the legitimate rights and interests of young people of all ethnic groups and all walks of life, guide young people to actively participate in social activities and work hard to help them develop healthily and become well-trained, consolidate and develop the situation of social stability and unity in China, promote its socialist modernization drive, push the development of the socialist market economy, improve the socialist democracy and legal system and promote the reunification of the motherland and defend the peace and development of the whole world. The ACYF is active in regional and international youth affairs, and engages in extensive exchanges and cooperation with young people and youth organizations of other countries. At present, the ACYF has relations with 143 governmental agencies for youth affairs, political parties youth organizations and social organizations related to youth affairs in 77 foreign countries, and 24 international and regional organizations; and engages in practical cooperation with foreign organizations or agencies in the vital fields of environmental protection, voluntary services, human resources training, and other fields.");



		detailsList.add(d1);
		detailsList.add(d2);
		detailsList.add(d3);
		detailsList.add(d4);
		String memberNames[] = {"Russian Centre of Science and Culture ,Federal Agency of ROSSOTRUDNICHESTVO", 
				"Russian Union of Youth, Russia", "International Federation of Indo Russian Youth Clubs, India", 
		"All China Youth Federation, China"};

		Integer  memberImages[] = { R.drawable.rcsc, R.drawable.ruy, R.drawable.iryc, R.drawable.acyf_logo_rz_rgb};

		MyListAdapter adapterObject = new MyListAdapter(memberNames, memberImages, Member_Organisations.this);
		members_list.setAdapter(adapterObject);

		members_list.setOnItemClickListener(new OnItemClickListener() {

			//@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int pos, long id) {
				Intent intent = new Intent(Member_Organisations.this, Member_Description.class);
				intent.putExtra(AppConstants.NAME_KEY,detailsList.get(pos).getName() );
				intent.putExtra(AppConstants.DESCRIPTION_KEY, detailsList.get(pos).getDescription());
				intent.putExtra(AppConstants.DESIGNATION_KEY, detailsList.get(pos).getDesignation());
				intent.putExtra(AppConstants.IMAGE_ID,detailsList.get(pos).getImageID());
				startActivity(intent);

			}
		});
	}

	private class MyListAdapter extends BaseAdapter
	{
		private String orgNames[];
		private Integer orgImages[];

		private Context context;
		private LayoutInflater inflater;




		public MyListAdapter(String[] orgNames, Integer[] orgImages,
				Context context) {
			super();
			this.orgNames = orgNames;
			this.orgImages = orgImages;
			this.context = context;

			inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

		//@Override
		public int getCount() {
			return orgNames.length;
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
				convertView = inflater.inflate(R.layout.member_organisation_list_item_layout, null);
				holder.nameV = (TextView) convertView.findViewById(R.id.member_item_text);
				holder.imageV = (ImageView)convertView.findViewById(R.id.member_item_iv);
				convertView.setTag(holder);
			}
			else
			{
				holder = (Holder) convertView.getTag();
			}
			holder.nameV.setText(this.orgNames[position]);	
			holder.imageV.setImageResource(this.orgImages[position]);
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
		ImageView imageV;
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent intent5 = new Intent(Member_Organisations.this, MainActivity.class);
		startActivity(intent5);
		super.onBackPressed();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.member__organisation, menu);
		return true;
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
	}*/
}
