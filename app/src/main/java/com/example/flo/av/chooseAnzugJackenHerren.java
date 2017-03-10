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

public class chooseAnzugJackenHerren extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner originDropdownAJ;
    Spinner convertDropdownAJ;
    Spinner sizeDropdownAJ;
    TextView outcome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_anzug_jacken_herren);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownAJ = (Spinner) findViewById(R.id.originDropdownAJ);
        convertDropdownAJ = (Spinner) findViewById(R.id.convertDropdownAJ);
        sizeDropdownAJ = (Spinner) findViewById(R.id.sizeDropdownAJ);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationAJ);

        List<String> elements = new ArrayList<>();
        elements.add("International");
        elements.add("Deutschland");
        elements.add("Österreich");
        elements.add("Schweiz");
        elements.add("Spanien");
        elements.add("Niederlande");

        ArrayAdapter<String> origins = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownAJ.setAdapter(origins);
        convertDropdownAJ.setAdapter(origins);

        originDropdownAJ.setOnItemSelectedListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothMan.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value=String.valueOf(originDropdownAJ.getSelectedItem());

         if (value == "International") {
                List<String> elements = new ArrayList<>();
                elements.add("XS");
                elements.add("XS/S");
                elements.add("S");
                elements.add("S/M");
                elements.add("M");
                elements.add("M/L");
                elements.add("L");
                elements.add("L/XL");
                elements.add("XL");
                elements.add("XL/XXL");
                elements.add("XXL/3L");


                ArrayAdapter<String> sizesINT = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
                sizesINT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sizeDropdownAJ.setAdapter(sizesINT);

            }

            if (value == "Deutschland" || value == "Österreich" || value == "Schweiz" ||  value == "Niederlande" ||  value == "Spanien") {
                List<String> elements = new ArrayList<>();
                elements.add("42");
                elements.add("43");
                elements.add("44");
                elements.add("46");
                elements.add("48");
                elements.add("50");
                elements.add("52");
                elements.add("54");
                elements.add("56");
                elements.add("58");
                elements.add("60");


                ArrayAdapter<String> sizesINT = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
                sizesINT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sizeDropdownAJ.setAdapter(sizesINT);

            }

            if ( value == "Großbritannien" || value == "Amerika") {
                List<String> elements = new ArrayList<>();
                elements.add("32");
                elements.add("33");
                elements.add("34");
                elements.add("36");
                elements.add("38");
                elements.add("40");
                elements.add("42");
                elements.add("44");
                elements.add("46");
                elements.add("48");
                elements.add("50");


                ArrayAdapter<String> sizesINT = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
                sizesINT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sizeDropdownAJ.setAdapter(sizesINT);

            }

        }

        public void calcFinalSizeAJ(View view){
            outcome.setBackgroundResource(R.drawable.image_border);

            String finalOriginDropdown = String.valueOf(originDropdownAJ.getSelectedItem());
            String finalSizeDropdown = String.valueOf(sizeDropdownAJ.getSelectedItem());
            String finalConvertDrowdown = String.valueOf(convertDropdownAJ.getSelectedItem());

            //Anzug, Jacken International in Deutschland, Österreich, Schweiz, Spanien, Niederlande, Großbritannien und Amerika

            if(finalOriginDropdown =="International"){
                if(finalSizeDropdown =="XS") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                    outcome.setText("42");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("32");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
                if(finalSizeDropdown =="XS/S") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("43");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("33");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
                if(finalSizeDropdown =="S") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("44");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("34");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
                if(finalSizeDropdown =="S/M") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("46");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("36");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
                if(finalSizeDropdown =="M") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("48");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("38");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
                if(finalSizeDropdown =="M/L") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("50");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        //TextView outcome = (TextView) findViewById(R.id.textviewSizecalculation);
                        outcome.setText("40");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
                if(finalSizeDropdown =="L") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("52");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("42");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }

                if(finalSizeDropdown =="L/XL") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("54");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("44");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }

                if(finalSizeDropdown =="XL") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("56");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("46");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
                if(finalSizeDropdown =="XL/XXL") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("58");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("48");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }

                if(finalSizeDropdown =="XXL/3L") {
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("60");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("50");
                    }
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }

                }
            }

            //Anzug, Jacken - Großbritannien Amerika in Deutschland, Österreich, Schweiz, Niederlande, Spanien, International

            if(finalOriginDropdown=="Großbritannien" || finalOriginDropdown=="Amerika"){
                if(finalSizeDropdown=="32"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("42");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("XS");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("32");
                    }
                }

                if(finalSizeDropdown=="33"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("43");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("XS/S");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("33");
                    }
                }

                if(finalSizeDropdown=="34"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("44");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("S");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("34");
                    }
                }

                if(finalSizeDropdown=="36"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("46");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("S/M");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("36");
                    }
                }

                if(finalSizeDropdown=="38"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("48");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("M");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("38");
                    }
                }

                if(finalSizeDropdown=="40"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("50");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("M/L");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("40");
                    }
                }

                if(finalSizeDropdown=="42"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("52");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("L");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("42");
                    }
                }

                if(finalSizeDropdown=="44"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("54");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("L/XL");
                    }
                    if(finalConvertDrowdown=="Großbritannien" &&finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("44");
                    }
                }

                if(finalSizeDropdown=="46"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("56");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("XL");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("46");
                    }
                }

                if(finalSizeDropdown=="48"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("58");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("XL/XXL");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien"|| finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("48");
                    }
                }

                if(finalSizeDropdown=="50"){
                    if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                        outcome.setText("60");
                    }
                    if (finalConvertDrowdown=="International"){
                        outcome.setText("XXL/3L");
                    }
                    if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                        outcome.setText("50");
                    }
                }

            }
            //Anzug, Jacken - Deutschland, Österreich, Schweiz, Niederlande, Spanien in International, Großbritannien und Amerika
            if(finalOriginDropdown=="Deutschland" || finalOriginDropdown=="Österreich" || finalOriginDropdown=="Schweiz" || finalOriginDropdown=="Niederlande" || finalOriginDropdown=="Spanien"){
                if (finalSizeDropdown=="42"){
                    if(finalConvertDrowdown=="International"){
                        outcome.setText("XS");
                    }
                    if(finalConvertDrowdown=="Großbritannien" || finalConvertDrowdown=="Amerika"){
                        outcome.setText("32");
                    }
                    if(finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland"|| finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich"|| finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if(finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Spanien" ||
                            finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Spanien" ||
                            finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Spanien" ||
                            finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Spanien" ||
                            finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Niederlande"){
                        outcome.setText("42");
                    }
                }

                if (finalSizeDropdown=="43") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("XS/S");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("33");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("43");
                    }
                }

                if (finalSizeDropdown=="44") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("S");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("34");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("44");
                    }
                }

                if (finalSizeDropdown=="46") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("S/M");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("36");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("46");
                    }
                }

                if (finalSizeDropdown=="48") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("M");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("38");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("48");
                    }
                }

                if (finalSizeDropdown=="50") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("M/L");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("40");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("50");
                    }
                }

                if (finalSizeDropdown=="52") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("L");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("42");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("52");
                    }
                }

                if (finalSizeDropdown=="54") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("L/XL");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("44");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("54");
                    }
                }

                if (finalSizeDropdown=="56") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("XL");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("46");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                         outcome.setText("56");
                    }
                }

                if (finalSizeDropdown=="58") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("XL/XXL");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("48");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("58");
                    }
                }

                if (finalSizeDropdown=="60") {
                    if (finalConvertDrowdown == "International") {
                        outcome.setText("XXL/3L");
                    }
                    if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                        outcome.setText("50");
                    }
                    if (finalConvertDrowdown == "Deutschland" && finalOriginDropdown == "Deutschland" || finalConvertDrowdown == "Österreich" && finalOriginDropdown == "Österreich" || finalConvertDrowdown == "Schweiz" && finalOriginDropdown == "Schweiz" || finalConvertDrowdown == "Niederlande" && finalOriginDropdown == "Niederlande" || finalConvertDrowdown == "Spanien" && finalOriginDropdown == "Spanien") {
                        outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                    }
                    if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                            finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                        outcome.setText("60");
                    }
                }
            }



        }




    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
