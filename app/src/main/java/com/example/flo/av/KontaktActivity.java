package com.example.flo.av;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class KontaktActivity extends AppCompatActivity {

    Button TRK;
    Button KTB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToMenu = new Intent(this, MenuActivity.class);
        startActivity(backToMenu);
        return true;
    }

    public void openKTB(View view){
    Intent open = new Intent(this, mapKottingbrunn.class);
        startActivity(open);
    }

    public void openTRK(View view){
        Intent open = new Intent(this, mapTraiskirchen.class);
        startActivity(open);
    }
}
