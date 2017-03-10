package com.example.flo.av;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Roundtrip extends AppCompatActivity {

    TextView item;
    Integer append=1;
    Integer append2 =0;
    CheckBox[] myCheck = new CheckBox[64];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roundtrip);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myCheck[0] = (CheckBox) findViewById(R.id.roundtrip);
        System.out.println(myCheck[0]);
        for(int i=1; i < 64; i++){
            String entryname = null;
            myCheck[i] = (CheckBox) findViewById(R.id.roundtrip+i);
            entryname = getResources().getResourceEntryName(myCheck[i].getId());
            System.out.println(myCheck[i].getId()+" "+i+" "+entryname);
        }
        System.out.println(" Das ist die globale Variable append in der onCreate methode"+append);


    }

    public void onPause(){
        super.onPause();
        save(myCheck[0].isChecked());
        for(int i=1; i < 64; i++){
            save2(myCheck[i].isChecked());
        }


    }

    public void onResume(){
        super.onResume();
        myCheck[0].setChecked(load());
        for(int i=1; i < 64; i++){
            myCheck[i].setChecked(load2());
        }
        append=1;
        append2=0;

        System.out.println("Die globale Variable append beinhaltet aktuell "+append);
        System.out.println("Die globale Variable append2 beinhaltet aktuell "+append2);

    }


    private void save(final boolean isChecked){
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("round", isChecked);
        editor.commit();
    }

    private void save2(final boolean isChecked){
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("round"+String.valueOf(append), isChecked);
        editor.commit();
        append++;
    }

    private boolean load(){
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("round", false);
    }

    private boolean load2(){
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        append2++;
        String id = "round"+String.valueOf(append2);
        return sharedPreferences.getBoolean(id, false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToTravelList = new Intent(this, travelLists.class);
        startActivity(backToTravelList);
        return true;
    }
}
