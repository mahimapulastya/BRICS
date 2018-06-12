package com.msk.bricsindia.fragment;

import com.msk.brics.EventDescription;
import com.msk.brics.R;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class PastEvent_2_fragment extends Fragment 
{
	private ListView listview;
	public TextView heading;
	private String[] description;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

		View pastEvent1 = inflater.inflate(R.layout.activity_past_event_1_fragment, container, false);

		heading = (TextView) pastEvent1.findViewById(R.id.textView1);
		listview =(ListView) pastEvent1.findViewById(R.id.mylistView);
		heading.setText("International Forum Meet,2015");
		description= new String[]{" A deep emphasis on the imperative of strong tie-ups between the youth of BRICS nations emerged at a momentous function heralding the three-day BRICS Youth Forum in India 2015, jointly organised by the Russian Centre of Science and Culture (RCSC), Russian Union of Youth and the International Federation of Indo-Russian Youth Clubs with the knowledgeable support of the BRICS Chamber of Commerce & Industry, at 24, Firozshah Road, New Delhi, on January 28, 2014. Ms. Purnima Anand, President, International Federation of Indo-Russian Youth Clubs, was the moderator.",
				" Addressing an elite gathering, primarily the participants of representatives from BRICS countries, the Chief Guest Mr. Sarbananda Sonowal, Honourable Minister of State (Independent Charge), Ministry of Youth Affairs & Sports, Government of India, underlined the need for youth involvement and participation in the socio-economic, cultural and political environment of a country, in its development programmes as well as activities based on the youth specific needs, desires and aspirations. He made a clarion call on utilising the resource of youth and to channelize it gainfully in affirmative action.'I am hopeful that this initiative will help in making an effective roadmap for the upcoming visit of our Honourable Prime Minister Narendra Modi ji to the Russian Federation in July 2015 for the 7th International BRICS Summit', the Minister said. He assured the Forum that his Ministry would provide all necessary support for many more such initiatives in the future to strengthen our ties with BRICS nations through youth festivals, youth exchange programmes, workshops, etc.",
				" Making an interesting observation on the present international political scenario on the occasion, Guest of Honour Mr. Sergey Karmalito, Senior Counsellor, Embassy of the Russian Federation in India, pointed out that the BRICS nations were gaining influence in the global political system and the grouping of emerging economies was set to become more powerful in the shifting international order.'The prospects of enhanced intra-BRICS cooperation and the increasing global profile of the grouping opens new opportunities for stronger interaction between  various nations.......We, the five BRICS nations, must work in all forums towards a rapprochement among all members of the international community and to strengthen the UN's leading role', Mr. Sergey Karmalito said.",
				" Earlier, welcoming the gathering comprising diplomats, media persons, youth leaders and other dignitaries at the inaugural ceremony, Mr. Fedor Rozovskiy, Director, Russian Centre of Science and Culture, noted that such a first-ever youth-meet assumed significant dimension and would gain a new momentum in the wake of the creative and lively deliberations in the Forum. He hoped that the Forum would provide valuable inputs and immense contributions to the prospects of BRICS youth development.",
				" Guest of Honour Ms. Meenakshi Lekhi, Member of Parliament, hailed the commendable gesture of the organisers of the Delhi BRICS Youth Forum, described it as an important milestone in the history of international relations and identifying and promoting the wonderful potential of youth in the noble cause of development and growth.",
				"In his thought-provoking observation, Guest of Honour Major Dalbir Singh, Secretary, All-India Congress Committee, the salient features and composition of the BRICS widely using demographic figures and laid deep stress on utilizing the immense potential of member states aimed at development and growth, as also the growing necessity on collaboration in the spheres of trade and investment, promotion of food security, health care, energy, education, etc., restructuring of World Bank, IMF, New Development Bank combating the menace of terrorism, drug trafficking, Major Dalbir Singh also essentially underscored the signal contribution of Russia in World War II.",
				" Dr. B.B. L. Madhukar, Secretary-General, BRICS chamber of Commerce & Industry, the tracing the genesis of BRICS dwelled at length upon the immense potential of youth and called upon exploring the possibilities of new avenues and new innovations and opportunities for global development and growth.' Youth holds the key and they are the future promise of nation. They can contribute immensely and transform everything in the world', Dr. Madhukar added. He also threw light on the outcome of the historic meeting between Prime Minister Narendra Modi and President Vladimir Putin in December 2014. He made an overall review of the results of the last BRICS Summit in Brazil.",
				"In her key-note address, Ms. Tatiana Seliverstova, Head of the International Department, Russian Union of Youth, hailed the sincere efforts of co-organisers and promised to convey the results of the Forum to Russia. She pinned much hope on the prospect of joint entrepreneurship using the present summit as a viable platform for intensive interaction and exchange of views.'Russia will provide all support and help in the investment and trade among BRICS nations', she said.",
				"Guest of Honour Mr. Yaroslav V. Tarasyuk, Trade Commissioner of the Russian Federation in India, in his address, lauded the spirit of youth of BRICS and promised all Russian support and cooperation in their consistent efforts.",
				"Mr. Du Dong, Director of International Department, All-China Youth Federation, described the special care and protection given to the youth of his country by his government, and called for intensive cooperation and inter-action between youths of BRICS nations",
				"Mr. In the Plenary Session on the Overview of BRICS Summit, Mr. Andrey Andreev, Deputy Director, Institute of History and Law, Syktyvkar State University, focussed on President Vladimir Putin's state at the BRICS summit in Brazil.",
				"Ms. Sharifullina Miliausha, Student of Kazan Federal University, made a broad narration on youth diplomacy in the Russian Federation and in continuation made a account on the prospects for the development of youth diplomacy in the BRICS on a broad spectrum and proper perspective.",
				" Mr. Dushyant Thakor, General Manager, Invest India, Mr. Rajesh Batra, Head, Micro Small and Medium Enterprise at the Indian Institute of Corporate Affairs, Ministry of Corporate Affairs, and Mr. Navin Kumar, Advisor, BRICS Chamber of Commerce & Industry, dwelt upon the Russian-Indian cooperation within BRICS in continuation of the visit to India of Vladimir Putin in December, 2014.",
				"The Forum has been spread over three days. The inaugural day, January 28, covered Plenary Sessions 1 & 2 with a thrust on overview of BRICS Summit and future of Russian-Indian cooperation within BRICS in continuation of Vladimir Putin's visit to India in December, 2014. On January 29, the Plenary Sessions 3 & 4, focussed on industrial park, investments, trade and commerce, agriculture, scientific cooperation, finance and taxation, tourism, health tourism and culture. On January 30, certificates were presented to BRICS delegates, and following that they proceed to the Gandhi Smriti and Darshan Samiti, venue of Mahatma Gandhi's Last Prayer."};

		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub

				//((EventDescription)getActivity()).
				Intent intent= new Intent(getActivity(), EventDescription.class);
				intent.putExtra("description",description);
				intent.putExtra("pos", position);
				startActivity(intent);

			}
		});
		
		listview.setAdapter(new MyListAdapter(getActivity(), description));
		return pastEvent1;
	}

	class MyListAdapter extends BaseAdapter{

		private String textValueArray[];
		private Context context;
		private LayoutInflater inflater;
		public MyListAdapter(Context context , String[] values) {
			this.context= context;
			this.textValueArray=values;
			inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		}
		//returns no of items
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return textValueArray.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public View getView(final int position, View convertview, ViewGroup parent) {

			final Holder holder;
			if(convertview == null)
			{ 
				holder = new Holder();
				convertview = inflater.inflate(R.layout.activity_past_event_list_layout, null);
				holder.textV=(TextView) convertview.findViewById(R.id.itemDescription);
				convertview.setTag(holder); 
			}
			else{
				holder = (Holder) convertview.getTag();// to get access to the available slot
			}
			holder.textV.setText(this.textValueArray[position]);
			return convertview;
		}
	}

	class Holder{
		TextView textV;
	}

}
