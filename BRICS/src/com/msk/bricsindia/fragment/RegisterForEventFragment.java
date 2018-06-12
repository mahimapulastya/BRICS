package com.msk.bricsindia.fragment;

import com.msk.brics.PastEvents;
import com.msk.brics.R;
import com.msk.brics.R.layout;
import com.msk.brics.R.menu;
import com.msk.brics.RegisterForEvent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterForEventFragment extends Fragment
{
	private EditText name,email,phone,company,address,state,country;
	private RadioGroup radioSexGroup;
	private RadioButton radioSexButton;
	private Button submit_bt;
	private static String gender="male", audience_type;
	private Spinner spinner1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Context context = getActivity().getApplicationContext();
		final View register = inflater.inflate(R.layout.activity_register_event, container, false);
		final Spinner spinner1 = (Spinner)register.findViewById(R.id.spinner1);
		String[] items = new String[]{"VOLUNTEER", "MEDIA", "SPONSORS"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, items);
		spinner1.setAdapter(adapter);
		spinner1.setSelection(1);
		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				audience_type = parent.getItemAtPosition(position).toString();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
		audience_type = spinner1.getSelectedItem().toString();

		name = (EditText) register.findViewById(R.id.name_et);
		email = (EditText) register.findViewById(R.id.email_et);
		phone =(EditText) register.findViewById(R.id.phone_et);
		company = (EditText) register.findViewById(R.id.company_name_et);
		address = (EditText) register.findViewById(R.id.address_et);
		state = (EditText) register.findViewById(R.id.state_et);
		country =(EditText) register.findViewById(R.id.country_et);
		submit_bt = (Button) register.findViewById(R.id.submit_bt);
		radioSexGroup = (RadioGroup) register.findViewById(R.id.radioSex);
		radioSexGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				int selectedId = radioSexGroup.getCheckedRadioButtonId();
				radioSexButton = (RadioButton) register.findViewById(selectedId);
				gender = radioSexButton.getText().toString();
			}
		});
		

		submit_bt.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{	
				if(name.getText().toString().equals(null)|| name.getText().toString().equals("")|| phone.getText().toString().equals(null)|| phone.getText().toString().equals("")||
						email.getText().toString().equals("")|| email.getText().toString().equals(null)|| company.getText().toString().equals(null)||company.getText().toString().equals(""))
				{
					Toast.makeText(getActivity().getBaseContext(),"Please fill the essential fields", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Intent intent = new Intent(Intent.ACTION_SEND);
					intent.putExtra(Intent.EXTRA_TEXT,("Name: "+name.getText().toString()+ 
							"\nContact details : "+phone.getText().toString()+  
							"\nEmail Address : "+email.getText().toString()+  
							"\nCompany Name : "+company.getText().toString()+
							"\nAddress : "+address.getText().toString()+  
							"\nState : "+state.getText().toString()+  
							"\nCountry : "+country.getText().toString()+
							"\n Gender : " +gender+
							"\n Audience Type : " +audience_type));

					intent.putExtra(Intent.EXTRA_SUBJECT,"Register for BRICS Event");
					intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@bricsforum.com"});

					intent.setType("message/rfc822");
					startActivity(Intent.createChooser(intent, "Choose an email client"));	
				}
			}
		});
		return register;
	}

}
