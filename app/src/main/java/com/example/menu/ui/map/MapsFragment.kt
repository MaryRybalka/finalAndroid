package com.example.menu.ui.map

import android.content.Context
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.menu.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import android.location.LocationManager
import android.location.Location;
import android.location.LocationListener;




class MapsFragment : Fragment() {
    private var locationManager: LocationManager? = null

//    private val callback = OnMapReadyCallback { googleMap ->
//        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
//        val sydney = LatLng(43.3, 131.5)
//        googleMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
//        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val MapsFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
//        MapsFragment?.getMapAsync(callback)
//    }
}