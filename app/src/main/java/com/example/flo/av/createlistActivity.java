package com.example.flo.av;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class createlistActivity extends AppCompatActivity {

    Button bt;
    EditText et;
    TextView tv;
    ListView lv;
    ArrayAdapter<String> adapter;
    ArrayList<String> listitems= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        Intent backToChecklist = new Intent (this, ChecklisteActivity.class);
        startActivity(backToChecklist);
        return true;
    }

    public void calcMan (View view){
        Intent manSize = new Intent(this, chooseClothMan.class);
        startActivity(manSize);
    }

    public void calcWoman (View view){
        Intent womanSize = new Intent(this, chooseClothWoman.class);
        startActivity(womanSize);
    }

    public void calcChild (View view){
        Intent childSize = new Intent(this, chooseClothChild.class);
        startActivity(childSize);
    }



}
