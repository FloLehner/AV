package com.example.flo.av;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class travelLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_lists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToListMenu = new Intent(this, ChecklisteActivity.class);
        startActivity(backToListMenu);
        return true;
    }

    public void showCityList(View view){
       Intent connect = new Intent(this, City.class);
        startActivity(connect);
    }
    public void showRoundtripList(View view){
        Intent connect = new Intent(this, Roundtrip.class);
        startActivity(connect);

    }
    public void showFamilyvacationList(View view){
        Intent connect = new Intent(this, Familyvacation.class);
        startActivity(connect);

    }
    public void showShipList(View view){
        Intent connect = new Intent(this, Ship.class);
        startActivity(connect);
    }
    public void showStandardList(View view){
        Intent connect = new Intent (this, Standardvacation.class);
        startActivity(connect);
    }

}
