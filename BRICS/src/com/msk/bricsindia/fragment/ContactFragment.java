package com.msk.bricsindia.fragment;

import com.msk.brics.R;
import com.msk.bricsindia.utils.CircleTransform;
import com.squareup.picasso.Picasso;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactFragment extends Fragment
{
	ImageView contact_iv;
	TextView email1,email2,website,contact_office;
	ImageButton fb , twitter;
	String contact_number[] = {"9911970905"};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View contact = inflater.inflate(R.layout.activity_contact, container, false);

		contact_iv=(ImageView) contact.findViewById(R.id.contact_iv);
		email1 = (TextView) contact.findViewById(R.id.email_tv);
		email2 = (TextView) contact.findViewById(R.id.email2_tv);
		website = (TextView) contact.findViewById(R.id.website_tv);
		contact_office = (TextView) contact.findViewById(R.id.contact_tv);
		Picasso.with(getActivity()).load(R.drawable.purnimaaanand).transform(new CircleTransform()).into(contact_iv);

		email1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@bricsforum.in"});
				intent.setType("message/rfc822");
				startActivity(Intent.createChooser(intent, "Choose an email client"));	

			}
		});

		email2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"bricsindia2015@gmail.com"});
				intent.setType("message/rfc822");
				startActivity(Intent.createChooser(intent, "Choose an email client"));
			}
		});

		website.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{
			//	Uri uri = Uri.parse("www.bricsforum.in");
				final Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("www.bricsforum.in"));
				startActivity(intent10);
			}
		});
		
		contact_office.setOnClickListener(new View.OnClickListener()
		{			
			@Override
			public void onClick(View v) 
			{
				Uri number = Uri.parse("tel: " + contact_number[0]);
				Intent dial = new Intent(Intent.ACTION_DIAL,number);
				startActivity(dial);
				
			}
		});
		
		fb = (ImageButton) contact.findViewById(R.id.facebook_bt);
		fb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i= new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/BRICSforumI"));
				startActivity(i);

			}
		});
		twitter = (ImageButton) contact.findViewById(R.id.twitter_bt);
		twitter.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent twi = new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/BRICSforumI?original_referer=http%3A%2F%2Fwww.bricsforum.in%2Fcontact.html&profile_id=2972520709&tw_i=611873938415730688&tw_p=embeddedtimeline&tw_w=576660011083919360"));
				startActivity(twi);



			}
		});
		return contact;

	}
}

