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

public class PastEvent_1_fragment extends Fragment 
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
		heading.setText("Indo-Russia Youth Forum");
		description= new String[]{"Taking forward their resolution to strengthen youth tie-ups and promote bilateral cooperation between BRICS nations, the Russian Union of Youth and the International Federation of Indo Russian Youth Clubs; pioneer organisations of the BRICS International Forum, entered into an agreement on March 25, 2015 to develop and support youth cooperation in the field of education, science, culture, sports, tourism, public work, employment at the two-day India-Russian Youth Forum held at the Russian Centre for Science and Culture, New Delhi.",
				"Speaking at the event, Rajiv Pratap Rudy, Minister of State, Independent Charge for Ministry of Skill Development and Entrepreneurship and Chief Guest for the event said that the India Russia Youth Forum is a partnership forum that is going to herald a long and mutually rewarding relationship of future cooperation between both countries.",
				"Delivering the welcome address, Fedor A Rozovskiy, Councellor and Head of the Cultural Department of the Embassy of the Russian Federation in India, Director of the Russian Centre of Science and Culture in New Delhi and Representative of Federal Agency of ROSSOTRUDNICHESTVO in India stressed on equipping the youth of both countries as they are the promise of the future. He also dedicated this forum to the upcoming victory anniversary celebration of World War II to be held in Moscow this year.",
				"Taking the discussion forward, Pavel Krasnorutsky, Chairman of the All-Russian public organisation ‘Russian Union of Youth’ (RUY) and adviser of the President of the Russian Federation, Vladimir Putin and the Guest of Honour for the evening talked about the Youth Forum of the BRICS in Moscow held in July 2014 which was attended by representatives from all BRICS nations. The Forum adopted a resolution which contained the basic mechanisms of cooperation between youth organisations of the BRICS countries in the areas of innovation, science and humanitarian and entrepreneurial sectors. The Forum had also decided to hold an official visit of the RUY leadership to India and to conduct the Youth Forum of the BRICS in 2015 in the city of Ufa. The main agenda of the meeting of young leaders of the BRICS countries is to discuss promising areas of cooperation and development of common solutions to coordinate efforts to create a youth movement in the space of the BRICS. Mr Krasnorutsky then went on to charter the growth of the Forum by laying out the plan for the year ahead. He said that visits to all BRICS nations are scheduled in the year and as part of these visits cooperation agreements will be signed with the major youth organisations in Brazil, India and South Africa. In order to create joint youth projects in research and innovation, RUY has scheduled International Youth Forum of Innovation and Science for the EAEC and BRICS in October 2015. ",
				"Also present at the conference was Meenakshi Lekhi, Member of Parliament, India and the Guest of Honour. Ms Lekhi has been associated with the forum right from its inception and during her speech stressed on fighting domination of the few and sharing responsibility. She talked about how Russia can be a key strategic partner in our Clean and Green India and Make in India initiatives and also in promoting Skill India, which is the creation of a skilled manpower.  ",
				"Sergei V Karmalito, Senior Counsellor, Embassy of the Russian Federation in India and a Guest of Honour said that while it was heartening to see the relationship getting stronger, we must give it a defined vision to ensure that there is multi-polarity in the world setup, a vision which Russia shares with India and we must not let countries that want to advance their unipolar world view take over. He called for cooperation especially in business projects and said that a Make in India and Make in Russia approach is bound to prove beneficial to both countries.",
				"One of the key figures of the Forum and one that can be credited with giving it shape, Tatiana Seliverstova, Head, International Department, Russian Union of Youth, General Director of Eurasian Trade and Investment Alliance expressed happiness at her dream of such a Youth Forum being realised. She said that India and Russia will enter into a new phase in their alliance with the establishment of an Indo-Russian Business Centre in cooperation with the Shanghai Corporation of Business in the next two months.",
				"Purnima Anand, President of the International Federation of Indo Russian Youth Clubs, India thanked all delegates, guests and participants and ensured that the BRICS International Forum will bring about a huge shift in the Indo-Russian dialogue paradigm. ",
				"The event concluded with representatives from various fields of science and education making presentations on topics like healthcare, gaps in the education sector between India and Russia and promotion of tourism for greater understanding of our cultures.",
				"The second and concluding day of the India Russia Youth Forum saw the discussions of the first day translate into action with Tatiana Seliverstova declaring the organisation of events in India on a regular basis and a Business Mission to be held here every two months in which delegates from both countries shall participate. Pavel Krasnorutsky added that our stress should be on building an informal relationship between India and Russia that goes beyond just business collaborations.",
				"The Forum saw attendance from various youth leaders from India. Sandeep Kumar, Minister of Women and Child Welfare, Government of Delhi talked about initiating an exchange programme with fifty percent representation of women and promised to extend support to exploring ways to work out a teacher exchange programme at the schools and university level.",
				"Manoj Chaudhary, a youth leader from the BJP outlined three broad aspects for future cooperation; education, infrastructure building and Russia’s role in the achieving our goal of creating 100 smart cities. He identified the role of education, infrastructure development, establishment of IT hubs and youth centres for a city to become a Smart City and said that India and Russia can have a mutually beneficial collaboration in this project. Also present at the forum were senior BJP leader Sanjay Joshi and youth leader Kumar Vishesh.",
		"Nirmal Bhatnagar, head of the Media Department, JIMS expressed the need to organise not just visits but short-term projects to boost communication and understanding between the two nations.",
		"The Forum also saw entrepreneurs from both the countries describe their projects from the field of medicine, herbal healthcare and water purification and they also invited collaborations for expanding their market in the partner country.Delegates from both the countries lauded the initiatives taken by the Forum and expressed hope that the association will work to strengthen the longstanding and time-tested partnership between India and Russia."};

		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub

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
