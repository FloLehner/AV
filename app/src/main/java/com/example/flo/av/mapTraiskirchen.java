package com.example.flo.av;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class mapTraiskirchen extends AppCompatActivity implements OnMapReadyCallback {
    TextView textTRK;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_traiskirchen);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapTraiskirchen);
        mapFragment.getMapAsync(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textTRK = (TextView) findViewById(R.id.textTRK);
        String text = "<b>Adresse:</b>" + "<br><br>" +
                "Wiener Neustädter Straße 10, 2514 Traiskirchen" + "<br><br>" +
                "<b>Öffnungszeiten</b>" + "<br><br>" +
                "Mo-Fr 09:00 - 12:00 Uhr und 14:00 - 18:00 Uhr" + "<br>" +
                "Sa 09:00 - 12:00 Uhr";

        textTRK.setText(Html.fromHtml(text));

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoomLevel = 17;
        // Add a marker in Sydney and move the camera
        LatLng Traiskirchen = new LatLng(48.013175, 16.295423);
        mMap.addMarker(new MarkerOptions().position(Traiskirchen).title("Filiale Traiskirchen").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_menu_logo_circle)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Traiskirchen, zoomLevel));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToContact = new Intent(this, KontaktActivity.class);
        startActivity(backToContact);
        return true;
    }

    public void callingTRK(View view) {
        Intent call = new Intent(Intent.ACTION_CALL);
        call.setData(Uri.parse("tel: +432252260280"));
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(call);
    }
}
