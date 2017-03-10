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

public class calcUnterwaescheFrauen extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner originDropdownUWFrauen;
    Spinner convertDropdownUWFrauen;
    Spinner sizeDropdownUWFrauen;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_unterwaesche_frauen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownUWFrauen = (Spinner) findViewById(R.id.originDropdownUWFrauen);
        convertDropdownUWFrauen = (Spinner) findViewById(R.id.convertDropdownUWFrauen);
        sizeDropdownUWFrauen = (Spinner) findViewById(R.id.sizeDropdownUWFrauen);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationUWFrauen);

        List<String> elements = new ArrayList<>();
        elements.add("International");
        elements.add("Österreich");

        ArrayAdapter<String> origin = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
        origin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownUWFrauen.setAdapter(origin);
        convertDropdownUWFrauen.setAdapter(origin);

        originDropdownUWFrauen.setOnItemSelectedListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothWoman.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value = String.valueOf(originDropdownUWFrauen.getSelectedItem());
        if(value=="International"){
            List<String> elements = new ArrayList<>();
            elements.add("XS");
            elements.add("S");
            elements.add("M");
            elements.add("L");
            elements.add("XL");

            ArrayAdapter sizeINT = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizeINT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownUWFrauen.setAdapter(sizeINT);
        }

        if(value=="Österreich"){
            List<String> elements = new ArrayList<>();
            elements.add("32 - 34");
            elements.add("36 - 38");
            elements.add("40 - 42");
            elements.add("44 - 46");
            elements.add("48 - 50");

            ArrayAdapter sizeAUT = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizeAUT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownUWFrauen.setAdapter(sizeAUT);
        }


    }

    public void calcFinalSizeUWFrauen (View view){
        outcome.setBackgroundResource(R.drawable.image_border);


        String finalOriginDropdownUWFrauen = String.valueOf(originDropdownUWFrauen.getSelectedItem());
        String finalConvertDropdownUWFrauen = String.valueOf(convertDropdownUWFrauen.getSelectedItem());
        String finalSizeDropdownUWFrauen = String.valueOf(sizeDropdownUWFrauen.getSelectedItem());

        //Unterwäsche Frauen - International in Österreich

        if(finalOriginDropdownUWFrauen=="International"){
            if(finalSizeDropdownUWFrauen=="XS"){
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("32 - 34");
                }
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdownUWFrauen=="S"){
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("36 - 38");
                }
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdownUWFrauen=="M"){
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("40 - 42");
                }
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdownUWFrauen=="L"){
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("44 - 46");
                }
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
            if(finalSizeDropdownUWFrauen=="XL"){
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("48 - 50");
                }
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

        }
        if(finalOriginDropdownUWFrauen=="Österreich"){
            if(finalSizeDropdownUWFrauen=="32 - 34"){
                if(finalConvertDropdownUWFrauen=="International"){
                outcome.setText("XS");
            }
            if(finalConvertDropdownUWFrauen=="Österreich"){
                outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
            }
            }

            if(finalSizeDropdownUWFrauen=="36 - 38"){
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("S");
                }
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownUWFrauen=="40 - 42"){
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("M");
                }
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownUWFrauen=="44 - 46"){
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("L");
                }
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdownUWFrauen=="48 - 50"){
                if(finalConvertDropdownUWFrauen=="International"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdownUWFrauen=="Österreich"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
