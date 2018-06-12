package com.msk.bricsindia.fragment;

import com.msk.brics.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MessageFragment extends Fragment
{
	private EditText name_et, subject_et,query_et, contact_info_et;
	private Button submit_bt;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View feedback = inflater.inflate(R.layout.activity_message, container, false);

		name_et = (EditText) feedback.findViewById(R.id.name_et);
		subject_et = (EditText) feedback.findViewById(R.id.subject_et);
		query_et =(EditText) feedback.findViewById(R.id.query_et);
		contact_info_et = (EditText) feedback.findViewById(R.id.contact_info_et);
		submit_bt = (Button) feedback.findViewById(R.id.submit_bt);

		submit_bt.setOnClickListener(new View.OnClickListener() {

			//@Override
			public void onClick(View arg0) 
			{	
				if(name_et.getText().toString().equals(null)|| name_et.getText().toString().equals("")|| subject_et.getText().toString().equals(null)|| subject_et.getText().toString().equals("")|| query_et.getText().toString().equals("")|| query_et.getText().toString().equals(null)){
					Toast.makeText(getActivity().getBaseContext(),"Please fill the required fields", Toast.LENGTH_SHORT).show();
				}
				else{
					Intent intent = new Intent(Intent.ACTION_SEND);
					intent.putExtra(Intent.EXTRA_TEXT,("Name: " +name_et.getText().toString()+ 
							"\nContact details : " +contact_info_et.getText().toString()+  
							"\nFeedback/query : " +query_et.getText().toString()));
					intent.putExtra(Intent.EXTRA_SUBJECT,subject_et.getText().toString());
					intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@bricsforum.com"});
					
					intent.setType("message/rfc822");
					startActivity(Intent.createChooser(intent, "Choose an email client"));	
				}
			}
		});
		return feedback;
	}
}
