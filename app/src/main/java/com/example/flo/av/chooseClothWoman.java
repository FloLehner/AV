package com.example.flo.av;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class chooseClothWoman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_cloth_woman);
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

    public void chooseBekleidungsgrößenFrauen (View view){
        Intent connect = new Intent(this, calcBekleidungsgroessenFrauen.class);
        startActivity(connect);

    }

    public void chooseSchuheFrauen (View view){
        Intent connect = new Intent(this, calcSchuheFrauen.class);
        startActivity(connect);

    }

    public void chooseBHsInternationalFrauen (View view){
        Intent connect = new Intent(this, calcBHsInternationalFrauen.class);
        startActivity(connect);

    }

    public void chooseUnterwäscheFrauen (View view){
        Intent connect = new Intent(this, calcUnterwaescheFrauen.class);
        startActivity(connect);
    }
}
