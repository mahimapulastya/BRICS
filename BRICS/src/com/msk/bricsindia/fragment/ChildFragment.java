package com.msk.bricsindia.fragment;

import com.msk.brics.About_BIF;
import com.msk.brics.About_brics;
import com.msk.brics.CouncilMember;
import com.msk.brics.PastEvents;
import com.msk.brics.Member_Organisations;
import com.msk.brics.R;
import com.msk.brics.RegisterForEvent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ChildFragment extends Fragment
{         
	int parentSelected,childSelected;
        // public static final String SELECTED_POSITION = "selected_element";

		public ChildFragment()
		{
			
		}
         public ChildFragment(int parent,int child)
         {
        	 parentSelected=parent;
        	 childSelected=child;
         }
         @Override
         public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
         {
             View rootView = inflater.inflate(R.layout.activity_child, container, false);
            // int i = getArguments().getInt(SELECTED_POSITION);
             switch(parentSelected)
         	{
             case 0:
                 String aboutUs = getResources().getStringArray(R.array.aboutUs_array)[childSelected]; 
                 getActivity().setTitle(aboutUs);
             switch(childSelected)
             {
             	case 0: Intent intent0 = new Intent(getActivity(), About_brics.class);
             	startActivity(intent0);
             	break;
              
             	case 1: Intent intent1 = new Intent(getActivity(), About_BIF.class);
             	startActivity(intent1);
             	break;
 			             	
             	case 2: Intent intent2 = new Intent(getActivity(), Member_Organisations.class);
             	startActivity(intent2);
             	break;
         	
             	case 3: Intent intent3 = new Intent(getActivity(), CouncilMember.class);
             	startActivity(intent3);
             	break;
             }
             break;
             
             case 1:
                 String events = getResources().getStringArray(R.array.events_array)[childSelected]; 
                 getActivity().setTitle(events);
             switch(childSelected)
             {
             	case 0: Intent intent0 = new Intent(getActivity(), RegisterForEvent.class);
             	startActivity(intent0);
             	break;
              
             	case 1: Intent intent1 = new Intent(getActivity(), PastEvents.class);
             	startActivity(intent1);
             	break;
             }
             break;
             
        /*     case 2:
                 String countries = getResources().getStringArray(R.array.countries_array)[childSelected];    
                 getActivity().setTitle(countries);
            	    switch(childSelected)
                    {
                    case 0: Intent intent0 = new Intent(getActivity(), About_brics.class);
                 	startActivity(intent0);
                 	break;
                  
                 	case 1: Intent intent1 = new Intent(getActivity(), About_BIF.class);
                 	startActivity(intent1);
                 	break;
     			                 	
                 	case 2: Intent intent2 = new Intent(getActivity(), Member_Organisations.class);
                 	startActivity(intent2);
                 	break;
             	
     			
                 	case 3: Intent intent3 = new Intent(getActivity(), Member_Organisations.class);
                 	startActivity(intent3);
                 	break;
                    }*/
            	 
 			}
             return rootView;
             }
         

}
