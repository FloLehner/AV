package com.example.flo.av;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class calcBHsInternationalFrauen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner originDropdownBHINT;
    Spinner convertDropdownBHINT;
    Spinner sizeDropdownBHINT;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_bhs_international_frauen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownBHINT = (Spinner) findViewById(R.id.originDropdownBHINTFrauen);
        convertDropdownBHINT = (Spinner) findViewById(R.id.convertDropdownBHINTFrauen);
        sizeDropdownBHINT = (Spinner) findViewById(R.id.sizeDropdownBHINTFrauen);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationBHINTFrauen);

        List<String> elements = new ArrayList<>();
        elements.add("Deutschland");
        elements.add("Österreich");
        elements.add("Niederlande");
        elements.add("Schweiz");
        elements.add("Spanien");
        elements.add("Italien");
        elements.add("Frankreich");
        elements.add("Belgien");
        elements.add("Amerika");
        elements.add("Großbritannien");

        ArrayAdapter origins = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownBHINT.setAdapter(origins);
        convertDropdownBHINT.setAdapter(origins);

        originDropdownBHINT.setOnItemSelectedListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothWoman.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value=String.valueOf(originDropdownBHINT.getSelectedItem());

        if(value=="Deutschland" || value=="Österreich" || value=="Niederlande" || value=="Schweiz" || value=="Spanien"){
            List<String> elements = new ArrayList<>();
            elements.add("70");
            elements.add("75");
            elements.add("80");
            elements.add("85");
            elements.add("90");
            elements.add("95");

            ArrayAdapter<String> sizesDEATNLCHES = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesDEATNLCHES.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBHINT.setAdapter(sizesDEATNLCHES);


        }
        if(value =="Italien"){
            List<String> elements = new ArrayList<>();
            elements.add("2");
            elements.add("3");
            elements.add("4");
            elements.add("5");
            elements.add("6");
            elements.add("7");

            ArrayAdapter<String> sizesIT = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesIT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBHINT.setAdapter(sizesIT);
        }

        if(value=="Frankreich" || value=="Belgien"){
            List<String> elements = new ArrayList<>();
            elements.add("85");
            elements.add("90");
            elements.add("95");
            elements.add("100");
            elements.add("105");
            elements.add("110");

            ArrayAdapter<String> sizesFRBE = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesFRBE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBHINT.setAdapter(sizesFRBE);
        }

        if(value=="Großbritannien" || value=="Amerika"){
            List<String> elements = new ArrayList<>();
            elements.add("32");
            elements.add("34");
            elements.add("36");
            elements.add("38");
            elements.add("40");
            elements.add("42");

            ArrayAdapter<String> sizesUSGB = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesUSGB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBHINT.setAdapter(sizesUSGB);
        }

    }

    public void calcFinalSizeBHINTFrauen (View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdownBHINTFrauen=String.valueOf(originDropdownBHINT.getSelectedItem());
        String finalConvertDropdownBHINTFrauen=String.valueOf(convertDropdownBHINT.getSelectedItem());
        String finalSizeDropdownBHINTFrauen=String.valueOf(sizeDropdownBHINT.getSelectedItem());

        //BH International = Österreich/Deutschland/Schweiz/Niederlande/Spanien in Italien, Frankreich, Belgien, Großbritannien, Amerika
        if(finalOriginDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Spanien"){
            if(finalSizeDropdownBHINTFrauen=="70"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("2");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("85");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("32");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" && finalOriginDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" && finalOriginDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" && finalOriginDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" && finalOriginDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien" && finalOriginDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
                if(finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Niederlande"){
                    outcome.setText("70");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="75"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("3");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("90");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("34");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" && finalOriginDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" && finalOriginDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" && finalOriginDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" && finalOriginDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien" && finalOriginDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
                if(finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Niederlande"){
                    outcome.setText("75");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="80"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("4");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("95");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" && finalOriginDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" && finalOriginDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" && finalOriginDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" && finalOriginDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien" && finalOriginDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
                if(finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Niederlande"){
                    outcome.setText("80");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="85"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("5");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("100");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" && finalOriginDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" && finalOriginDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" && finalOriginDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" && finalOriginDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien" && finalOriginDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
                if(finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Niederlande"){
                    outcome.setText("85");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="90"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("6");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("105");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" && finalOriginDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" && finalOriginDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" && finalOriginDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" && finalOriginDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien" && finalOriginDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
                if(finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Niederlande"){
                    outcome.setText("90");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="95"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("7");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("110");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" && finalOriginDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" && finalOriginDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" && finalOriginDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" && finalOriginDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien" && finalOriginDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
                if(finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Deutschland" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Österreich" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Niederlande" || finalOriginDropdownBHINTFrauen=="Schweiz" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Niederlande" && finalConvertDropdownBHINTFrauen=="Spanien" ||
                        finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Deutschland" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Österreich" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Schweiz" || finalOriginDropdownBHINTFrauen=="Spanien" && finalConvertDropdownBHINTFrauen=="Niederlande"){
                    outcome.setText("95");
                }
            }
        }

        // BH International - Italien in Österreich/Deutschland/Schweiz/Niderlande/Spanien, Italien, Frankreich, Belgien, Großbritannien, Amerika
        if(finalOriginDropdownBHINTFrauen=="Italien"){
            if(finalSizeDropdownBHINTFrauen=="2"){
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("70");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("85");
                }
                if(finalConvertDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("32");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="3"){
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("75");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("90");
                }
                if(finalConvertDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("34");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="4"){
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("80");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("95");
                }
                if(finalConvertDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="5"){
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("85");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("100");
                }
                if(finalConvertDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="6"){
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("90");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("105");
                }
                if(finalConvertDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBHINTFrauen=="7"){
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("95");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("110");
                }
                if(finalConvertDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        // BH International - Frankreich/Belgien in Italien, Österreich/Deutschland/Niederlande/Schweiz/Spanien, Amerika, Großbritannien
        if(finalOriginDropdownBHINTFrauen=="Frankreich" || finalOriginDropdownBHINTFrauen=="Belgien"){
            if(finalSizeDropdownBHINTFrauen=="85"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("2");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("70");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("32");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Frankreich"|| finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Belgien" || finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Frankreich"){
                    outcome.setText("85");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="90"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("3");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("75");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("34");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Frankreich"|| finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Belgien" || finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Frankreich"){
                    outcome.setText("90");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="95"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("4");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("80");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Frankreich"|| finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Belgien" || finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Frankreich"){
                    outcome.setText("95");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="100"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("5");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("85");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Frankreich"|| finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Belgien" || finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Frankreich"){
                    outcome.setText("100");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="105"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("6");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("90");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Frankreich"|| finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Belgien" || finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Frankreich"){
                    outcome.setText("105");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="110"){
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("7");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("95");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Frankreich"|| finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Frankreich" && finalOriginDropdownBHINTFrauen=="Belgien" || finalConvertDropdownBHINTFrauen=="Belgien" && finalOriginDropdownBHINTFrauen=="Frankreich"){
                    outcome.setText("110");
                }

            }
        }

        //BH International - Großbritannien/Amerika in Frankreich, Belgien, Italien, Österreich/Deutschland/Schweiz/Spanien/Niederlande
        if(finalOriginDropdownBHINTFrauen=="Großbritannien" || finalOriginDropdownBHINTFrauen =="Amerika"){
            if(finalSizeDropdownBHINTFrauen=="32"){
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("85");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("2");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("70");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika" && finalOriginDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Amerika" &&finalOriginDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("32");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="34"){
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("90");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("3");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("75");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika" && finalOriginDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Amerika" &&finalOriginDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("34");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="36"){
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("95");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("4");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("80");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika" && finalOriginDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Amerika" &&finalOriginDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("36");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="38"){
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("100");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("5");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("85");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika" && finalOriginDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Amerika" &&finalOriginDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("38");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="40"){
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("105");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("6");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("90");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika" && finalOriginDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Amerika" &&finalOriginDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("40");
                }

            }

            if(finalSizeDropdownBHINTFrauen=="42"){
                if(finalConvertDropdownBHINTFrauen=="Frankreich" || finalConvertDropdownBHINTFrauen=="Belgien"){
                    outcome.setText("110");
                }
                if(finalConvertDropdownBHINTFrauen=="Italien"){
                    outcome.setText("7");
                }
                if(finalConvertDropdownBHINTFrauen=="Österreich" || finalConvertDropdownBHINTFrauen=="Deutschland" || finalConvertDropdownBHINTFrauen=="Schweiz" || finalConvertDropdownBHINTFrauen=="Niederlande" || finalConvertDropdownBHINTFrauen=="Spanien"){
                    outcome.setText("95");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Großbritannien" || finalConvertDropdownBHINTFrauen=="Amerika" && finalOriginDropdownBHINTFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBHINTFrauen=="Großbritannien" && finalOriginDropdownBHINTFrauen=="Amerika" || finalConvertDropdownBHINTFrauen=="Amerika" &&finalOriginDropdownBHINTFrauen=="Großbritannien"){
                    outcome.setText("42");
                }

            }

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
