package com.example.flo.av;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.net.URI;

public class WebcheckinsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webcheckins);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
        public boolean onOptionsItemSelected (MenuItem item){
            Intent backToMenu = new Intent(this, MenuActivity.class);
            startActivity(backToMenu);
            return true;
        }

        public void openAerLingus (View view){
            Uri url = Uri.parse("https://webcheckin.aerlingus.com/html/checkIn/checkin.html?_ga=1.33891686.692302767.1468514760");
            Intent connect = new Intent(Intent.ACTION_VIEW, url);
            startActivity(connect);
        }
        public void openAlitalia(View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alitalia.com/de_de/fly-alitalia/check-in/online-check-in.html"));
            startActivity(connect);
        }

        public void openAirBerlin (View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.airberlin.com/de/webcheckin/index/abtix/selected/abtix"));
            startActivity(connect);

        }

        public void openAirFrance(View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mobile.airfrance.at/AT/de/local/ici/iciFrame.do"));
            startActivity(connect);
        }

        public void openAustrianAirlines(View view){
           Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.austrian.com/?sc_lang=en#checkin/start"));
            startActivity(connect);
        }

        public void openBritishAirways(View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.britishairways.com/travel/olcilandingpageauthreq/public/de_at?clickpage=information-en--checking-in--index&kmtag=c&ban=||HC|3x1|CTA1|||||||||L2|||||||"));
            startActivity(connect);
        }

        public void openEmirates (View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mobile.emirates.com/at/german/CKIN/OLCI/flightInfo.xhtml"));
            startActivity(connect);
        }

        public void openEurowings (View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mobile.eurowings.com/booking/BookingList.aspx?context=checkin&input=checkin"));
            startActivity(connect);
        }

        public void openEvaAir(View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.evaair.com/A4/CheckinBookingReference.aspx"));
            startActivity(connect);
        }

        public void openIberia (View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.iberia.com/mobi/obsmenu.do?menuId=MOBILEIBCOSE"));
            startActivity(connect);
        }


        public void openKLM(View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.klm.com/ams/checkin/web/kl/at/de"));
            startActivity(connect);
        }

        public void openNiki (View view){
            Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.airberlin.com/de/webcheckin/index/abtix/selected/abtix"));
            startActivity(connect);
        }
}
