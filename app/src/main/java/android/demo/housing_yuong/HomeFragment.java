package android.demo.housing_yuong;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static android.content.Context.LOCATION_SERVICE;

public class HomeFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap myMap;

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//        setContentView(R.layout.fragment_home);
//
//        SupportMapFragment mapFragment
//                = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentHome);
//
//
//        // Sét đặt sự kiện thời điểm GoogleMap đã sẵn sàng.
//        mapFragment.getMapAsync(new OnMapReadyCallback() {
//
//            @Override
//            public void onMapReady(GoogleMap googleMap) {
//                onMyMapReady(googleMap);
//            }
//        });
//    }
//
//    private void onMyMapReady(GoogleMap googleMap) {
//        myMap = googleMap;
//
//        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//        myMap.getUiSettings().setZoomControlsEnabled(true);
//
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            return;
//        }
//        myMap.setMyLocationEnabled(true);
//    }
//
//    @Override
//    public void onLocationChanged(Location location) {
//
//    }
//
//    @Override
//    public void onStatusChanged(String s, int i, Bundle bundle) {
//
//    }
//
//    @Override
//    public void onProviderEnabled(String s) {
//
//    }
//
//    @Override
//    public void onProviderDisabled(String s) {
//
//    }

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        LatLng latLng;
        super.onViewCreated(view, savedInstanceState);

        //FragmentManager fragment = getActivity().getSupportFragmentManager();
        // Fragment fragment=(Fragment) getChildFragmentManager().findFragmentById(R.id.mapView);
        final SupportMapFragment myMAPF = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.fragmentHome);
        myMAPF.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        myMap = googleMap;

        myMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {

            @Override
            public void onMapClick(LatLng latLng) {

                // Creating a marker
                MarkerOptions markerOptions = new MarkerOptions();

                // Setting the position for the marker
                markerOptions.position(latLng);

                // Setting the title for the marker.
                // This will be displayed on taping the marker
                markerOptions.title(latLng.latitude + " : " + latLng.longitude);


                // Clears the previously touched position
                myMap.clear();

                // Animating to the touched position
                myMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));

                // Placing a marker on the touched position
                myMap.addMarker(markerOptions);
            }
        });

//        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(10.7896705, 106.6988654);
//        myMap.addMarker(new MarkerOptions().position(sydney).title("Marker in PTITHCM"));
//        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        myMap.getUiSettings().setZoomControlsEnabled(true);

        if (ActivityCompat.checkSelfPermission(getActivity() ,Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(),
                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        myMap.setMyLocationEnabled(true);
    }
}

