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

public class calcJeansHerren extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner originDropdownJS;
    Spinner convertDropdownJS;
    Spinner sizeDropdownJS;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_jeans_herren);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownJS = (Spinner) findViewById(R.id.originDropdownJS);
        convertDropdownJS = (Spinner) findViewById(R.id.convertDropdownJS);
        sizeDropdownJS = (Spinner) findViewById(R.id.sizeDropdownJS);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationJS);

        List<String> origin = new ArrayList<>();
        origin.add("Größe(inch)");
        origin.add("Bundumfang(cm)");

        ArrayAdapter<String> origins = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, origin);
        origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownJS.setAdapter(origins);
        convertDropdownJS.setAdapter(origins);

        originDropdownJS.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothMan.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String value = String.valueOf(originDropdownJS.getSelectedItem());

        if(value=="Größe(inch)"){
            List<String> sizesINCH = new ArrayList<>();
            sizesINCH.add("28");
            sizesINCH.add("29");
            sizesINCH.add("30");
            sizesINCH.add("31");
            sizesINCH.add("32");
            sizesINCH.add("33");
            sizesINCH.add("34");
            sizesINCH.add("35");
            sizesINCH.add("36");
            sizesINCH.add("38");
            sizesINCH.add("40");
            sizesINCH.add("42");
            sizesINCH.add("44");
            sizesINCH.add("46");
            sizesINCH.add("48");

            ArrayAdapter<String> sizes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sizesINCH);
            sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownJS.setAdapter(sizes);

        }
        if(value=="Bundumfang(cm)"){
            List<String> sizesBUND = new ArrayList<>();
            sizesBUND.add("70 - 72");
            sizesBUND.add("72 - 74");
            sizesBUND.add("75 - 77");
            sizesBUND.add("78 - 79");
            sizesBUND.add("80 - 81");
            sizesBUND.add("82 - 84");
            sizesBUND.add("85 - 86");
            sizesBUND.add("86 - 87");
            sizesBUND.add("88 - 91");
            sizesBUND.add("95 - 97");
            sizesBUND.add("100 - 102");
            sizesBUND.add("105 - 107");
            sizesBUND.add("110 - 112");
            sizesBUND.add("115 - 117");
            sizesBUND.add("120 - 123");

            ArrayAdapter<String> sizes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sizesBUND);
            sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownJS.setAdapter(sizes);




        }

    }

    public void calcFinalSizeJS (View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdown = String.valueOf(originDropdownJS.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownJS.getSelectedItem());
        String finalConvertDropdown = String.valueOf(convertDropdownJS.getSelectedItem());

        //Jeans - Inch in Bundumfang
        if(finalOriginDropdown=="Größe(inch)"){
            if(finalSizeDropdown=="28"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("70 - 72");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="29"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("72 - 74");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="30"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("75 - 77");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="31"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("78 - 79");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="32"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("80 - 81");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="33"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("82 - 84");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="34"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("85 - 86");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="35"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("86 - 87");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="36"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("88 - 91");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="38"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("95 - 97");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="40"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("100 - 102");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="42"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("105 - 107");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="44"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("110 - 112");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="46"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("115 - 117");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="48"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("120 - 123");
                }
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }

        //Jeans - Bundumfang in Größe(inch)
        if(finalOriginDropdown=="Bundumfang(cm)"){
            if(finalSizeDropdown=="70 - 72"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("28");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="72 - 74"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("29");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="75 - 77"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("30");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="78 - 79"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("31");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="80 - 81"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("32");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="82 - 84"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("33");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="85 - 86"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("34");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="86 - 87"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("35");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="88 - 91"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("36");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="95 - 97"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("38");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="100 - 102"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("40");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="105 - 107"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("42");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="110 - 112"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("44");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="115 - 117"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("46");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="120 - 123"){
                if(finalConvertDropdown=="Größe(inch)"){
                    outcome.setText("48");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
