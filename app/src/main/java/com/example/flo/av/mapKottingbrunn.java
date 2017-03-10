package com.example.flo.av;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapKottingbrunn extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    TextView textKTB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_kottingbrunn);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        textKTB = (TextView) findViewById(R.id.textKTB);

        String text = "<b>Adresse:</b>" + "<br><br>" +
                "Renngasse 2, 2542 Kottingbrunn" + "<br><br>" +
                "<b>Öffnungszeiten</b>" + "<br><br>" +
                "Mo-Fr 09:00 - 18:00 Uhr" + "<br>" +
                "Pendlertag - jeden Mi 09:00 - 21:00 Uhr" + "<br>" +
                "Sa 09:00 - 12:00 Uhr";

        textKTB.setText(Html.fromHtml(text));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToContact = new Intent(this, KontaktActivity.class);
        startActivity(backToContact);
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoomLevel = 17;
        // Add a marker in Sydney and move the camera
        LatLng Kottingbrunn = new LatLng(47.950785, 16.228121);
        mMap.addMarker(new MarkerOptions().position(Kottingbrunn).title("Filiale Kottingbrunn").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_menu_logo_circle)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Kottingbrunn, zoomLevel));
    }

    public void callingKTB(View view) {
        Intent call = new Intent(Intent.ACTION_CALL);
        call.setData(Uri.parse("tel: +432252251231"));
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
