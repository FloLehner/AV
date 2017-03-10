package com.example.flo.av;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class chooseClothMan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_cloth_man);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCreateList = new Intent(this, createlistActivity.class);
        startActivity(backToCreateList);
        return true;
    }

    public void chooseHemdHerren (View view){
        Intent connect = new Intent(this, ManActivity.class);
        startActivity(connect);

    }

    public void chooseHoseHerren (View view){
        Intent connect = new Intent(this, calcHosenHerren.class);
        startActivity(connect);

    }

    public void chooseJeansHerren (View view){
        Intent connect = new Intent(this, calcJeansHerren.class);
        startActivity(connect);

    }

    public void chooseAnzugJackenHerren (View view){
        Intent connect = new Intent(this, chooseAnzugJackenHerren.class);
        startActivity(connect);

    }

    public void chooseUnterwäscheHerren (View view){
        Intent connect = new Intent(this, calcUnterwaesche.class);
        startActivity(connect);

    }

    public void chooseSchuheHerren (View view){
        Intent connect = new Intent(this, chooseSchuheHerren.class);
        startActivity(connect);

    }


}
