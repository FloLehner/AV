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

public class calcKinderUndBabyschuhe extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner originDropdownKinderUndBabyschuhe;
    Spinner convertDropdownKinderUndBabyschuhe;
    Spinner sizeDropdownKinderUndBabyschuhe;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_kinder_und_babyschuhe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownKinderUndBabyschuhe = (Spinner) findViewById(R.id.originDropdownKinderUndBabyschuhe);
        convertDropdownKinderUndBabyschuhe = (Spinner) findViewById(R.id.convertDropdownKinderUndBabyschuhe);
        sizeDropdownKinderUndBabyschuhe = (Spinner) findViewById(R.id.sizeDropdownKinderUndBabyschuhe);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationKinderUndBabyschuhe);

        List<String> elements = new ArrayList<>();
        elements.add("Amerika");
        elements.add("Europa");
        elements.add("Großbritannien");

        ArrayAdapter<String> origins = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownKinderUndBabyschuhe.setAdapter(origins);
        convertDropdownKinderUndBabyschuhe.setAdapter(origins);

        originDropdownKinderUndBabyschuhe.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothChild.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value=String.valueOf(originDropdownKinderUndBabyschuhe.getSelectedItem());

        if(value=="Amerika"){
            List<String> elements = new ArrayList<>();
            elements.add("0.5 - 1");
            elements.add("1.5 - 2");
            elements.add("2.5 - 3");
            elements.add("3.5 - 4");
            elements.add("4.5 - 5");
            elements.add("5.5");
            elements.add("6 - 6.5");
            elements.add("7 - 7.5");
            elements.add("8");
            elements.add("8.5 - 9");
            elements.add("9.5");
            elements.add("10 - 10.5");
            elements.add("11");
            elements.add("11.5");
            elements.add("12 - 12.5");
            elements.add("13 - 13.5");
            elements.add("1 (Erw.)");
            elements.add("1.5 - 2 (Erw.)");
            elements.add("2.5 - 3 (Erw.)");
            elements.add("3.5 (Erw.)");
            elements.add("4 - 4.5 (Erw.)");
            elements.add("5 - 5.5 (Erw.)");

            ArrayAdapter<String> sizesUS = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesUS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownKinderUndBabyschuhe.setAdapter(sizesUS);


        }
        if(value=="Europa"){
            List<String> elements = new ArrayList<>();
            elements.add("16");
            elements.add("17");
            elements.add("18");
            elements.add("19");
            elements.add("20");
            elements.add("21");
            elements.add("22");
            elements.add("23");
            elements.add("24");
            elements.add("25");
            elements.add("26");
            elements.add("27");
            elements.add("28");
            elements.add("29");
            elements.add("30");
            elements.add("31");
            elements.add("32");
            elements.add("33");
            elements.add("34");
            elements.add("35");
            elements.add("36");
            elements.add("37");



            ArrayAdapter<String> sizesEU = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesEU.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownKinderUndBabyschuhe.setAdapter(sizesEU);

        }
        if(value=="Großbritannien"){
            List<String> elements = new ArrayList<>();
            elements.add("0 - 0.5");
            elements.add("1");
            elements.add("1.5 - 2");
            elements.add("2.5 - 3");
            elements.add("3.5 - 4");
            elements.add("4.5");
            elements.add("5 - 5.5");
            elements.add("6 - 6.5");
            elements.add("7");
            elements.add("7.5 - 8");
            elements.add("8.5");
            elements.add("9 - 9.5");
            elements.add("10");
            elements.add("10.5");
            elements.add("11 - 11.5");
            elements.add("12 - 12.5");
            elements.add("13");
            elements.add("14 / 1 (Erw.)");
            elements.add("1.5 - 2 (Erw.)");
            elements.add("2.5 (Erw.)");
            elements.add("3 - 3.5 (Erw.)");
            elements.add("4 - 4.5 (Erw.)");

            ArrayAdapter<String> sizesGB = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
            sizesGB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownKinderUndBabyschuhe.setAdapter(sizesGB);


        }


    }

    public void calcFinalSizeKinderUndBabyschuhe (View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdown = String.valueOf(originDropdownKinderUndBabyschuhe.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownKinderUndBabyschuhe.getSelectedItem());
        String finalConvertDrowdown = String.valueOf(convertDropdownKinderUndBabyschuhe.getSelectedItem());

        //Kinder- und Babyschuhe - EU in Amerika, Großbritannien

        if(finalOriginDropdown=="Europa"){
            if(finalSizeDropdown=="16"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("0 - 0.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("0.5 - 1");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="17"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("1");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("1.5 - 2");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="18"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("1.5 - 2");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("2.5 - 3");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="19"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("2.5 - 3");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("3.5 - 4");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="20"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("3.5 - 4");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("4.5 - 5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="21"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("4.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="22"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("5 - 5.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("6 - 6.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="23"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("6 - 6.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("7 - 7.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="24"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="25"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7.5 - 8");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8.5 - 9");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="26"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("8.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("9.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="27"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("9 - 9.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("10 - 10.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="28"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="29"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="30"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("11 - 11.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("12 - 12.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="31"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("12 - 12.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("13 - 13.5");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="32"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("13");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("1 (Erw.)");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="33"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("14 / 1 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("1.5 - 2 (Erw.)");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="34"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("1.5 - 2 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("2.5 - 3 (Erw.)");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="35"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("2.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("3.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="36"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("3 - 3.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("4 - 4.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="37"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("4 - 4.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5 - 5.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Kinder- und Babyschuhe - Amerika in EU, Großbritannien
        if(finalOriginDropdown=="Amerika"){
            if(finalSizeDropdown=="0.5 - 1"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("16");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("0 - 0.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="1.5 - 2"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("17");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("1");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="2.5 - 3"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("18");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("1.5 - 2");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="3.5 - 4"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("19");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("2.5 - 3");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="4.5 - 5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("20");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("3.5 - 4");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="5.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("21");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("4.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="6 - 6.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("22");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("5 - 5.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="7 - 7.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("23");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("6 - 6.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="8"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("24");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="8.5 - 9"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("25");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7.5 - 8");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="9.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("26");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("8.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="10 - 10.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("27");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("9 - 9.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="11"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("28");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="11.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("29");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="12 - 12.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("30");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("11 - 11.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="13 - 13.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("31");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("12 - 12.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="1 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("32");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("13");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="1.5 - 2 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("33");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("14 / 1 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="2.5 - 3 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("34");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("1.5 - 2 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="3.5 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("35");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("2.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="4 - 4.5 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("36");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("3 - 3.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="5 - 5.5 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("37");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("4 - 4.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Kinder- und Babyschuhe - Amerika in EU, Großbritannien
        if(finalOriginDropdown=="Großbritannien"){
            if(finalSizeDropdown=="0 - 0.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("16");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("0.5 - 1");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="1"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("17");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("1.5 - 2");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="1.5 - 2"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("18");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("2.5 - 3");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="2.5 - 3"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("19");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("3.5 - 4");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="3.5 - 4"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("20");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("4.5 - 5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="4.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("21");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="5 - 5.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("22");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("6 - 6.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="6 - 6.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("23");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("7 - 7.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="7"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("24");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="7.5 - 8"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("25");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8.5 - 9");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="8.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("26");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("9.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="9 - 9.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("27");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("10 - 10.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="10"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("28");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="10.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("29");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="11 - 11.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("30");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("12 - 12.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="12 - 12.5"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("31");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("13 - 13.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="13"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("32");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("1 (Erw.)");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="14 / 1 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("33");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("1.5 - 2 (Erw.)");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="1.5 - 2 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("34");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("2.5 - 3 (Erw.)");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="2.5 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("35");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("3.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="3 - 3.5 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("36");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("4 - 4.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="4 - 4.5 (Erw.)"){
                if(finalConvertDrowdown=="Europa"){
                    outcome.setText("37");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5 - 5.5 (Erw.)");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
