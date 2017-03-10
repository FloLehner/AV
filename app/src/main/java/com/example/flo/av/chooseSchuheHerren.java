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

public class chooseSchuheHerren extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner originDropdownSH;
    Spinner sizeDropdownSH;
    Spinner convertDropdownSH;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_schuhe_herren);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownSH = (Spinner) findViewById(R.id.originDropdownSH);
        sizeDropdownSH = (Spinner) findViewById(R.id.sizeDropdownSH);
        convertDropdownSH = (Spinner) findViewById(R.id.convertDropdownSH);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationSH);

        List<String> elements = new ArrayList<>();
        elements.add("Österreich");
        elements.add("Großbritannien");
        elements.add("Amerika");

        ArrayAdapter origins = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownSH.setAdapter(origins);
        convertDropdownSH.setAdapter(origins);

        originDropdownSH.setOnItemSelectedListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothMan.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = String.valueOf(originDropdownSH.getSelectedItem());



            if (value == "Österreich") {
                List<String> elements = new ArrayList<>();
                elements.add("38");
                elements.add("39");
                elements.add("39.5");
                elements.add("40");
                elements.add("40.5");
                elements.add("41");
                elements.add("41.5");
                elements.add("42");
                elements.add("42.5");
                elements.add("43");
                elements.add("43.5");
                elements.add("44");
                elements.add("44.5");
                elements.add("45");
                elements.add("46");
                elements.add("47");
                elements.add("48");
                elements.add("49");
                elements.add("50");

                ArrayAdapter<String> sizesDE = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
                sizesDE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sizeDropdownSH.setAdapter(sizesDE);
            }

            if (value == "Großbritannien") {
                List<String> elements = new ArrayList<>();
                elements.add("4");
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
                elements.add("12");
                elements.add("13");
                elements.add("14");
                elements.add("15");
                elements.add("16");

                ArrayAdapter<String> sizesGB = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
                sizesGB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sizeDropdownSH.setAdapter(sizesGB);
            }

            if (value == "Amerika") {
                List<String> elements = new ArrayList<>();
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
                elements.add("12.5");
                elements.add("13.5");
                elements.add("14.5");
                elements.add("15.5");
                elements.add("16.5");

                ArrayAdapter<String> sizesUS = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
                sizesUS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sizeDropdownSH.setAdapter(sizesUS);
            }


    }

    public void calcFinalSizeSH (View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdown = String.valueOf(originDropdownSH.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownSH.getSelectedItem());
        String finalConvertDrowdown = String.valueOf(convertDropdownSH.getSelectedItem());

        //Schuhe - Deutschland in Großbritannien und Amerika
        if(finalOriginDropdown=="Österreich"){
            if(finalSizeDropdown=="38"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("4");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="39"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="39.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("5.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("6");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="40"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("6");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("6.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="40.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("6.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("7");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="41"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("7.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="41.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="42"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("8");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="42.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("8.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("9");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="43"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("9");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("9.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="43.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("9.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="44"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("10.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="44.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="45"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("11");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="46"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("12");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("12.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="47"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("13");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("13.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="48"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("14");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("14.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="49"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("15");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("15.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="50"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("16");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("16.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Schuhe - Großbritannien in Amerika und Deutschland
        if(finalOriginDropdown=="Großbritannien"){
            if(finalSizeDropdown=="4"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("38");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="5"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("39");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("5.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="5.5"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("39.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("6");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="6"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("40");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("6.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="6.5"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("40.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("7");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="7"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("41");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("7.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="7.5"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("41.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="8"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("42");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("8.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="8.5"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("42.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("9");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="9"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("43");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("9.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="9.5"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("43.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="10"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("44");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("10.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="10.5"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("44.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="11"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("45");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("11.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="12"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("46");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("12.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="13"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("47");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("13.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="14"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("48");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("14.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="15"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("49");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("15.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="16"){
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("50");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("16.5");
                }
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

        }
        //Schuhe - Amerika in Großbritannien in Deutschland
        if(finalOriginDropdown=="Amerika"){
            if(finalSizeDropdown=="5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("4");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("38");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="5.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("39");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="6"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("5.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("39.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="6.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("6");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("40");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="7"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("6.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("40.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="7.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("41");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="8"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("7.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("41.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="8.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("8");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("42");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="9"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("8.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("42.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="9.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("9");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("43");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="10"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("9.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("43.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="10.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("44");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="11"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("10.5");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("44.5");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="11.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("11");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("45");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="12.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("12");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("46");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="13.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("13");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("47");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="14.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("14");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("48");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="15.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("15");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("49");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="16.5"){
                if(finalConvertDrowdown=="Großbritannien"){
                    outcome.setText("16");
                }
                if(finalConvertDrowdown=="Österreich"){
                    outcome.setText("50");
                }
                if(finalConvertDrowdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
