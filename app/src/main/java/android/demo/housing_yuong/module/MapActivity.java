package android.demo.housing_yuong.module;

import android.demo.housing_yuong.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaFragment;
import com.google.android.gms.maps.model.LatLng;

public class MapActivity extends AppCompatActivity implements OnStreetViewPanoramaReadyCallback {

    StreetViewPanoramaFragment streetViewPanoramaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        streetViewPanoramaFragment =
                (StreetViewPanoramaFragment) getFragmentManager()
                        .findFragmentById(R.id.streetviewpanorama);

        streetViewPanoramaFragment.getStreetViewPanoramaAsync(this);
    }

    public void onStreetViewPanoramaReady(StreetViewPanorama panorama) {
        panorama.setPosition(new LatLng(60.988538, -45.425749));
    }
}
