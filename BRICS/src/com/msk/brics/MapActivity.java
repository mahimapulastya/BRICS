package com.msk.brics;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.os.Bundle;

public class MapActivity extends Activity{
	static final LatLng BricsPoint = new LatLng(28.62382, 77.22754);
	GoogleMap googleMap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		try { 
            if (googleMap == null) {
               googleMap = ((MapFragment) getFragmentManager().
               findFragmentById(R.id.map)).getMap();
            }
         googleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
         Marker TP = googleMap.addMarker(new MarkerOptions().
         position(BricsPoint).title("BRICS Office"));

      } catch (Exception e) {
         e.printStackTrace();
      }

	}
}
