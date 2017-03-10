package com.example.flo.av;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView Titel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Titel = (TextView) findViewById(R.id.TITEL);
        Titel.setText("AUBORA VACATION");






    }

    public void showQuicklinks (View view){
        Intent qlintent = new Intent(this, QuicklinksActivity.class);
        startActivity(qlintent);
    }

    public void showWebcheckins (View view){
    Intent wcintent = new Intent(this, WebcheckinsActivity.class);
        startActivity(wcintent);
    }

    public void showHandgepäck (View view){
    Intent hgintent = new Intent(this, HandgepaeckActivity.class);
        startActivity(hgintent);
    }

    public void showCheckliste (View view){
    Intent clintent = new Intent (this, ChecklisteActivity.class);
        startActivity(clintent);
    }

    public void showNotfallnummern (View view){
    Intent nnintent = new Intent (this, NotfallnummernActivity.class);
        startActivity(nnintent);
    }

    public void showZollundartenschutz (View view){
    Intent zaintent = new Intent (this, ZollunArtenschutzActivity.class);
        startActivity(zaintent);
    }

    public void showKontakt (View view){
    Intent kintent = new Intent (this, KontaktActivity.class);
        startActivity(kintent);
    }

    public void showWebsite (View view){
        String adress="http://www.aubora.at";
        Intent wintent = new Intent(Intent.ACTION_VIEW, Uri.parse(adress));
        startActivity(wintent);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
