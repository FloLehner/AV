package com.example.flo.av;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.net.URI;

public class QuicklinksActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quicklinks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent backToMenu = new Intent(this, MenuActivity.class);
        startActivity(backToMenu);
        return true;

    }

    public void openFlughafen(View view){
        Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.viennaairport.com"));
        startActivity(connect);
    }

    public void openTerminal(View view){
        Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.viennaairport.com/passagiere/flughafen/flughafenplan"));
        startActivity(connect);
    }

    public void openReiseversicherung(View view){
        Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.europaeische.at/privatreisen/reisen-ins-ausland/komplett-schutz.html?gclid=CJXUx9ev-s0CFY9uGwod-PQNYw"));
        startActivity(connect);
    }

    public void openAußenministerium (View view){
        Intent connect = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bmeia.gv.at/reise-aufenthalt/reiseinformation/laender/"));
        startActivity(connect);

    }

}
