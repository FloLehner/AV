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

public class calcBekleidungsgroessenFrauen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner originDropdownBekleidungFrauen;
    Spinner convertDropdownBekleidungFrauen;
    Spinner sizeDropdownBekleidungFrauen;
    TextView outcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_bekleidungsgroessen_frauen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownBekleidungFrauen = (Spinner) findViewById(R.id.originDropdownBekleidungFrauen);
        convertDropdownBekleidungFrauen = (Spinner) findViewById(R.id.convertDropdownBekleidungFrauen);
        sizeDropdownBekleidungFrauen = (Spinner) findViewById(R.id.sizeDropdownBekleidungFrauen);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationBekleidungFrauen);

        List<String> elements = new ArrayList<>();
        elements.add("Unisex");
        elements.add("Deutschland");
        elements.add("Niederlande");
        elements.add("Österreich");
        elements.add("Spanien");
        elements.add("Schweiz");
        elements.add("Italien");
        elements.add("Frankreich");
        elements.add("Belgien");
        elements.add("Großbritannien");
        elements.add("Amerika");

        ArrayAdapter<String> origin = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownBekleidungFrauen.setAdapter(origin);
        convertDropdownBekleidungFrauen.setAdapter(origin);

        originDropdownBekleidungFrauen.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothWoman.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value=String.valueOf(originDropdownBekleidungFrauen.getSelectedItem());

        if(value=="Unisex"){
            List<String> elements = new ArrayList<>();
            elements.add("XS");
            elements.add("S");
            elements.add("M");
            elements.add("L");
            elements.add("XL");
            elements.add("XXL");

            ArrayAdapter<String> sizesUNI = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesUNI.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBekleidungFrauen.setAdapter(sizesUNI);
        }

        if(value=="Deutschland" || value=="Niederlande" || value=="Österreich" || value=="Schweiz" || value=="Spanien"){
            List<String> elements = new ArrayList<>();
            elements.add("32 - 34");
            elements.add("36");
            elements.add("38");
            elements.add("40");
            elements.add("42");
            elements.add("44");

            ArrayAdapter<String> sizesDENLATCHES = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesDENLATCHES.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBekleidungFrauen.setAdapter(sizesDENLATCHES);
        }

        if(value=="Italien"){
            List<String> elements = new ArrayList<>();
            elements.add("36 - 38");
            elements.add("40");
            elements.add("42");
            elements.add("44");
            elements.add("46");
            elements.add("48");

            ArrayAdapter<String> sizesIT = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesIT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBekleidungFrauen.setAdapter(sizesIT);
        }

        if(value=="Frankreich" || value=="Belgien"){
            List<String> elements = new ArrayList<>();
            elements.add("34 - 36");
            elements.add("38");
            elements.add("40");
            elements.add("42");
            elements.add("44");
            elements.add("46");

            ArrayAdapter sizesFRBE = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesFRBE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBekleidungFrauen.setAdapter(sizesFRBE);
        }

        if(value =="Großbritannien"){
            List<String> elements = new ArrayList<>();
            elements.add("6 - 8");
            elements.add("10");
            elements.add("12");
            elements.add("14");
            elements.add("16");
            elements.add("18");

            ArrayAdapter<String> sizesGB = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesGB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBekleidungFrauen.setAdapter(sizesGB);
        }

        if(value=="Amerika"){
            List<String> elements = new ArrayList<>();
            elements.add("4 - 6");
            elements.add("8");
            elements.add("10");
            elements.add("12");
            elements.add("14");
            elements.add("16");

            ArrayAdapter sizesUS = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesUS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBekleidungFrauen.setAdapter(sizesUS);

        }

    }

    public void calcFinalSizeBekleidungFrauen (View view){
        outcome.setBackgroundResource(R.drawable.image_border);



        String finalOriginDropdownBekleidungFrauen=String.valueOf(originDropdownBekleidungFrauen.getSelectedItem());
        String finalConvertDropdownBekleidungFrauen=String.valueOf(convertDropdownBekleidungFrauen.getSelectedItem());
        String finalSizeDropdownBekleidungFrauen = String.valueOf(sizeDropdownBekleidungFrauen.getSelectedItem());

        //Bekleidungsgrößen - Unisex in Deutschland/Österreich/Niederlande/Schweiz/Spanien, Italien, Frankreich, Belgien, Großbritannien, Amerika

        if(finalOriginDropdownBekleidungFrauen=="Unisex"){
            if(finalSizeDropdownBekleidungFrauen=="XS") {
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Spanien") {
                    outcome.setText("32 - 34");
                    }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("36 - 38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("34 - 36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("6 - 8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("4 - 6");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="S") {
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Spanien") {
                    outcome.setText("36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="M") {
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Spanien") {
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="L") {
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Spanien") {
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="XL") {
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Spanien") {
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="XXL") {
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Spanien") {
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("48");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("18");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }

        //Bekleidungsgrößen - Deutschland/Österreich/Niederlande/Schweiz/Spanien in Unisex, Italien, Frankreich, Belgien, Großbritannien, Amerika
        if(finalOriginDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Schweiz" ||finalOriginDropdownBekleidungFrauen=="Spanien"){
            if(finalSizeDropdownBekleidungFrauen=="32 - 34"){
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XS");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("36 - 38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("34 - 36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("6 - 8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("4 - 6");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" && finalOriginDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" && finalOriginDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" && finalOriginDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" && finalOriginDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien" && finalOriginDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    TextView outcome = (TextView) findViewById(R.id.textviewSizecalculation);
                    outcome.setText("32 - 34");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="36"){
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("S");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" && finalOriginDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" && finalOriginDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" && finalOriginDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" && finalOriginDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien" && finalOriginDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    TextView outcome = (TextView) findViewById(R.id.textviewSizecalculation);
                    outcome.setText("36");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="38"){
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("M");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" && finalOriginDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" && finalOriginDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" && finalOriginDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" && finalOriginDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien" && finalOriginDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    TextView outcome = (TextView) findViewById(R.id.textviewSizecalculation);
                    outcome.setText("38");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="40"){
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("L");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" && finalOriginDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" && finalOriginDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" && finalOriginDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" && finalOriginDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien" && finalOriginDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    TextView outcome = (TextView) findViewById(R.id.textviewSizecalculation);
                    outcome.setText("40");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="42"){
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" && finalOriginDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" && finalOriginDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" && finalOriginDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" && finalOriginDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien" && finalOriginDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    TextView outcome = (TextView) findViewById(R.id.textviewSizecalculation);
                    outcome.setText("42");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="44"){
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XXL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("48");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("18");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" && finalOriginDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" && finalOriginDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" && finalOriginDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" && finalOriginDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien" && finalOriginDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Deutschland" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Österreich" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Niederlande" || finalOriginDropdownBekleidungFrauen=="Schweiz" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Niederlande" && finalConvertDropdownBekleidungFrauen=="Spanien" ||
                        finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Deutschland" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Österreich" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Schweiz" || finalOriginDropdownBekleidungFrauen=="Spanien" && finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    TextView outcome = (TextView) findViewById(R.id.textviewSizecalculation);
                    outcome.setText("44");
                }
            }
        }
        //Bekleidungsgrößen - Italien in Deutschland/Österreich/Niederlande/Schweiz/Spanien, Unisex, Frankreich, Belgien, Großbritannien, Amerika
        if(finalOriginDropdownBekleidungFrauen=="Italien"){
            if(finalSizeDropdownBekleidungFrauen=="36 - 38"){
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("32 - 34");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XS");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("34 - 36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("6 - 8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("4 - 6");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="40"){
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("S");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="42"){
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("M");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="44"){
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("L");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="46"){
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="48"){
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XXL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("18");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Bekleidungsgrößen - Frankreich/Belgien in Deutschland/Österreich/Niederlande/Schweiz/Spanien, Unisex, Italien, Großbritannien, Amerika
        if(finalOriginDropdownBekleidungFrauen=="Frankreich" || finalOriginDropdownBekleidungFrauen=="Belgien"){
            if(finalSizeDropdownBekleidungFrauen=="34 - 36"){
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("36 - 38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("32 - 34");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XS");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("6 - 8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("4 - 6");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Belgien" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Frankreich"){
                    outcome.setText("34 - 36");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="38"){
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("S");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Belgien" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Frankreich"){
                    outcome.setText("38");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="40"){
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("M");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Belgien" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Frankreich"){
                    outcome.setText("40");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="42"){
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("L");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Belgien" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Frankreich"){
                    outcome.setText("42");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="44"){
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Belgien" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Frankreich"){
                    outcome.setText("44");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="46"){
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("48");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Niederlande" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XXL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("18");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" && finalOriginDropdownBekleidungFrauen=="Belgien" || finalConvertDropdownBekleidungFrauen=="Belgien" && finalOriginDropdownBekleidungFrauen=="Frankreich"){
                    outcome.setText("46");
                }
            }
        }

        //Bekleidungsgrößen - Großbritannien in Frankreich/Belgien, Deutschland/Österreich/Niederlande/Schweiz/Spanien, Unisex, Italien, Amerika
        if(finalOriginDropdownBekleidungFrauen=="Großbritannien"){
            if(finalSizeDropdownBekleidungFrauen=="6 - 8"){
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("34 - 36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("36 - 38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien" || finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    outcome.setText("32 - 34");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XS");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("4 - 6");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbirtannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="10"){
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien" || finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("S");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbirtannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="12"){
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien" || finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("M");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbirtannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="14"){
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien" || finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("L");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbirtannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="16"){
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien" || finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbirtannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="18"){
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("48");
                }
                if(finalConvertDropdownBekleidungFrauen=="Deutschland" || finalConvertDropdownBekleidungFrauen=="Österreich" || finalConvertDropdownBekleidungFrauen=="Schweiz" || finalConvertDropdownBekleidungFrauen=="Spanien" || finalConvertDropdownBekleidungFrauen=="Niederlande"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XXL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Großbirtannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Bekleidungsgrößen -  Amerika in Großbritannien, Frankreich/Belgien, Deutschland/Österreich/Niederlande/Schweiz/Spanien, Unisex, Italien
        if(finalOriginDropdownBekleidungFrauen=="Amerika"){
            if(finalSizeDropdownBekleidungFrauen=="4 - 6"){
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("6 - 8");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("34 - 36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("36 - 38");
                }
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Spanien"){
                   outcome.setText("32 - 34");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XS");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="8"){
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("40");
                }
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Spanien"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("S");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="10"){
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("42");
                }
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Spanien"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("M");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="12"){
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("14");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("44");
                }
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Spanien"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("L");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="14"){
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("16");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("46");
                }
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Spanien"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownBekleidungFrauen=="16"){
                if(finalConvertDropdownBekleidungFrauen=="Großbritannien"){
                    outcome.setText("18");
                }
                if(finalConvertDropdownBekleidungFrauen=="Frankreich" || finalConvertDropdownBekleidungFrauen=="Belgien"){
                    outcome.setText("46");
                }
                if(finalConvertDropdownBekleidungFrauen=="Italien"){
                    outcome.setText("48");
                }
                if (finalConvertDropdownBekleidungFrauen == "Deutschland" || finalConvertDropdownBekleidungFrauen == "Österreich" || finalConvertDropdownBekleidungFrauen == "Schweiz" || finalConvertDropdownBekleidungFrauen == "Niederlande" || finalConvertDropdownBekleidungFrauen == "Spanien"){
                    outcome.setText("44");
                }
                if(finalConvertDropdownBekleidungFrauen=="Unisex"){
                    outcome.setText("XXL");
                }
                if(finalConvertDropdownBekleidungFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {



    }
}
