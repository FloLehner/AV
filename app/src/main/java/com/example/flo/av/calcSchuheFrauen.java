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

public class calcSchuheFrauen extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner originDropdownSchuheFrauen;
    Spinner convertDropdownSchuheFrauen;
    Spinner sizeDropdownSchuheFrauen;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_schuhe_frauen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownSchuheFrauen = (Spinner) findViewById(R.id.originDropdownSchuheFrauen);
        convertDropdownSchuheFrauen = (Spinner) findViewById(R.id.convertDropdownSchuheFrauen);
        sizeDropdownSchuheFrauen = (Spinner) findViewById(R.id.sizeDropdownSchuheFrauen);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationSchuheFrauen);

        List<String> elements = new ArrayList<>();
        elements.add("Österreich");
        elements.add("Großbritannien");
        elements.add("Amerika");

        ArrayAdapter origins = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownSchuheFrauen.setAdapter(origins);
        convertDropdownSchuheFrauen.setAdapter(origins);

        originDropdownSchuheFrauen.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothWoman.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value = String.valueOf(originDropdownSchuheFrauen.getSelectedItem());

        if(value =="Österreich"){
            List<String> elements = new ArrayList<>();
            elements.add("34");
            elements.add("35");
            elements.add("35.5");
            elements.add("36");
            elements.add("36.5");
            elements.add("37");
            elements.add("37.5");
            elements.add("38");
            elements.add("38.5");
            elements.add("39");
            elements.add("39.5");
            elements.add("40");
            elements.add("40.5");
            elements.add("41");
            elements.add("41.5");
            elements.add("42");
            elements.add("42.5");
            elements.add("43");

            ArrayAdapter sizesAT = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesAT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownSchuheFrauen.setAdapter(sizesAT);
        }

        if(value=="Großbritannien"){
            List<String> elements = new ArrayList<>();
            elements.add("1");
            elements.add("2");
            elements.add("2.5");
            elements.add("3");
            elements.add("3.5");
            elements.add("4");
            elements.add("4.5");
            elements.add("5");
            elements.add("5.5");
            elements.add("6");
            elements.add("6.5");
            elements.add("7");
            elements.add("7.5");
            elements.add("8");
            elements.add("8.5");
            elements.add("9");
            elements.add("9.5");
            elements.add("10");

            ArrayAdapter sizesGB = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesGB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownSchuheFrauen.setAdapter(sizesGB);
        }
        if(value=="Amerika"){
            List<String> elements = new ArrayList<>();
            elements.add("3");
            elements.add("4");
            elements.add("4.5");
            elements.add("5");
            elements.add("5.5");
            elements.add("6");
            elements.add("6.5");
            elements.add("7");
            elements.add("7.5");
            elements.add("8");
            elements.add("8.5");
            elements.add("9");
            elements.add("9.5");
            elements.add("10");
            elements.add("10.5");
            elements.add("11");
            elements.add("11.5");
            elements.add("12");

            ArrayAdapter sizesUS = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesUS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownSchuheFrauen.setAdapter(sizesUS);
        }

    }

    public void calcFinalSizeSchuheFrauen (View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdownSchuheFrauen = String.valueOf(originDropdownSchuheFrauen.getSelectedItem());
        String finalConvertDropdownSchuheFrauen = String.valueOf(convertDropdownSchuheFrauen.getSelectedItem());
        String finalSizeDropdownSchuheFrauen = String.valueOf(sizeDropdownSchuheFrauen.getSelectedItem());

        //Schuhe Frauen - Österreich in Großbritannien, Amerika

        if(finalOriginDropdownSchuheFrauen=="Österreich"){
            if(finalSizeDropdownSchuheFrauen=="34"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("1");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("3");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="35"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("2");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("4");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="35.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("2.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("4.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="36"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("3");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="36.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("3.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("5.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="37"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("4");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("6");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="37.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("4.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("6.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="38"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("7");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="38.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("5.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("7.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="39"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("6");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="39.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("6.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("8.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="40"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("7");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("9");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="40.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("7.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("9.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="41"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="41.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("8.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("10.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="42"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("9");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("11");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="42.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("9.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("11.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="43"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }
        }

        // Schuhe Frauen - Großbritannien in Österreich, Amerika
        if(finalOriginDropdownSchuheFrauen=="Großbritannien"){
            if(finalSizeDropdownSchuheFrauen=="1"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("34");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("3");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="2"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("35");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("4");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="2.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("35.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("4.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="3"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="3.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("36.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("5.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="4"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("37");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("6");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="4.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("37.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("6.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("7");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="5.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("38.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("7.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="6"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("39");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="6.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("39.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("8.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="7"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("9");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="7.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("40.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("9.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="8"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("41");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="8.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("41.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("10.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="9"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("11");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="9.5"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("42.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("11.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="10"){
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("43");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }
        }


        //Schuhe Frauen - Amerika in Großbritannien, Österreich
        if(finalOriginDropdownSchuheFrauen=="Amerika"){
            if(finalSizeDropdownSchuheFrauen=="3"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("1");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("34");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="4"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("2");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("35");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="4.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("2.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("35.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("3");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("36");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="5.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("3.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("36.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="6"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("4");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("37");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="6.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("4.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("37.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="7"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("38");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="7.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("5.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("38.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="8"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("6");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("39");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="8.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("6.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("39.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="9"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("7");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("40");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="9.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("7.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("40.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="10"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("8");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("41");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="10.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("8.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("41.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="11"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("9");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("42");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="11.5"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("9.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("42.5");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

            if(finalSizeDropdownSchuheFrauen=="12"){
                if(finalConvertDropdownSchuheFrauen=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDropdownSchuheFrauen=="Österreich"){
                    outcome.setText("43");
                }
                if(finalConvertDropdownSchuheFrauen=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
