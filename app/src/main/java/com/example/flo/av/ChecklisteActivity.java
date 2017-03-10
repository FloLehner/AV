package com.example.flo.av;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class ChecklisteActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkliste);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public boolean onOptionsItemSelected (MenuItem item){
        Intent backtoMenu = new Intent(this, MenuActivity.class);
        startActivity(backtoMenu);
        return true;
    }

    public void newList(View view){
        Intent createListe = new Intent(this, createlistActivity.class);
        startActivity(createListe);
    }

    public void showTravelList (View view){
        Intent travelList = new Intent(this, travelLists.class);
        startActivity(travelList);
    }




}
