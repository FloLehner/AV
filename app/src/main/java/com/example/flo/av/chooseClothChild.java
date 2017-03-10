package com.example.flo.av;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class chooseClothChild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_cloth_child);
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

    public void chooseBabygrößen (View view){
        Intent connect = new Intent(this, calcBabygroessen.class);
        startActivity(connect);

    }

    public void chooseKindergrößen (View view){
        Intent connect = new Intent(this, calcKindergroessen.class);
        startActivity(connect);

    }

    public void chooseJungengrößen (View view){
        Intent connect = new Intent(this, calcJungengroessen.class);
        startActivity(connect);

    }

    public void chooseMädchengrößen (View view){
        Intent connect = new Intent(this, calcMaedchengroessen.class);
        startActivity(connect);

    }

    public void chooseKinderUndBabySchuhe (View view){
        Intent connect = new Intent(this, calcKinderUndBabyschuhe.class);
        startActivity(connect);

    }
}
