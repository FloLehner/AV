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

public class calcHosenHerren extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner originDropdownHO;
    Spinner convertDropdownHO;
    Spinner sizeDropdownHO;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_hosen_herren);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        originDropdownHO = (Spinner) findViewById(R.id.originDropdownHO);
        convertDropdownHO = (Spinner) findViewById(R.id.convertDropdownHO);
        sizeDropdownHO = (Spinner) findViewById(R.id.sizeDropdownHO);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationHO);

        List<String> elements = new ArrayList<>();
        elements.add("Österreich");
        elements.add("Bundumfang(cm)");
        elements.add("Seitenlänge(cm)");

        ArrayAdapter<String> origin = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownHO.setAdapter(origin);
        convertDropdownHO.setAdapter(origin);

        originDropdownHO.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothMan.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value = String.valueOf(originDropdownHO.getSelectedItem());

        if(value =="Österreich"){
            List<String> elements = new ArrayList<>();
            elements.add("44");
            elements.add("46");
            elements.add("48");
            elements.add("50");
            elements.add("52");
            elements.add("54");
            elements.add("56");
            elements.add("58");
            elements.add("60");
            elements.add("62");
            elements.add("64");

            ArrayAdapter<String> sizes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownHO.setAdapter(sizes);
        }

        if(value =="Bundumfang(cm)"){
            List<String> elements = new ArrayList<>();
            elements.add("74 - 77");
            elements.add("78 - 81");
            elements.add("82 - 85");
            elements.add("86 - 89");
            elements.add("90 - 94");
            elements.add("95 - 99");
            elements.add("100 - 104");
            elements.add("105 - 109");
            elements.add("110 - 114");
            elements.add("115 - 119");
            elements.add("120 - 124");

            ArrayAdapter<String> sizes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownHO.setAdapter(sizes);
        }

        if(value =="Seitenlänge(cm)"){
            List<String> elements = new ArrayList<>();
            elements.add("100 - 103");
            elements.add("102 - 104");
            elements.add("103 - 106");
            elements.add("105 - 108");
            elements.add("107 - 109");
            elements.add("108 - 110");
            elements.add("109 - 112");
            elements.add("111 - 114");
            elements.add("112 - 115");
            elements.add("114 - 116");
            elements.add("115 - 117");

            ArrayAdapter<String> sizes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownHO.setAdapter(sizes);
        }

    }

    public void calcFinalSizeHO (View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdown = String.valueOf(originDropdownHO.getSelectedItem());
        String finalConvertDropdown = String.valueOf(convertDropdownHO.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownHO.getSelectedItem());
        //Hosen - Österreich in Bundumfang und Seitenlänge

        if(finalOriginDropdown=="Österreich"){
            if(finalSizeDropdown=="44"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("74 - 77");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("100 - 103");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="46"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("78 - 81");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("102 - 104");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="48"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("82 - 85");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("103 - 106");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="50"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("86 - 89");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("105 - 108");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="52"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("90 - 94");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("107 - 109");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="54"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("95 - 99");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("108 - 110");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="56"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("100 - 104");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("109 - 112");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="58"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("105 - 109");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("111 - 114");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="60"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("110 - 114");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("112 - 115");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="62"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("115 - 119");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("114 - 116");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="64"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("120 - 124");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("115 - 117");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Hosen - Bundumfang in Seitenlänge und Österreich
        if(finalOriginDropdown=="Bundumfang(cm)"){
            if(finalSizeDropdown=="74 - 77"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("100 - 103");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("44");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="78 - 81"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("102 - 104");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("46");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="82 - 85"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("103 - 106");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("48");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="86 - 89"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("105 - 108");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("50");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="90 - 94"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("107 - 109");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("52");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="95 - 99"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("108 - 110");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("54");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="100 - 104"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("109 - 112");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("56");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="105 - 109"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("111 - 114");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("58");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="110 - 114"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("112 - 115");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("60");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="115 - 119"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("114 - 116");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("62");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="120 - 124"){
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("115 - 117");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("64");
                }
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Hosen - Seitenlänge in Bundumfang und Österreich
        if(finalOriginDropdown=="Seitenlänge(cm)"){
            if(finalSizeDropdown=="100 - 103"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("74 - 77");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("44");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="102 - 104"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("78 - 81");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("46");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdown=="103 - 106"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("82 - 85");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("48");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="105 - 108"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("86 - 89");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("50");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="107 - 109"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("90 - 94");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("52");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="108 - 110"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("95 - 99");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("54");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="109 - 112"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("100 - 104");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("56");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="111 - 114"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("105 - 109");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("58");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="112 - 115"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("110 - 114");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("60");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="114 - 116"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("115 - 119");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("62");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="115 - 117"){
                if(finalConvertDropdown=="Bundumfang(cm)"){
                    outcome.setText("120 - 124");
                }
                if(finalConvertDropdown=="Österreich"){
                    outcome.setText("64");
                }
                if(finalConvertDropdown=="Seitenlänge(cm)"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
