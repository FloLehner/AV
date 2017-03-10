package com.example.flo.av;

import android.content.Intent;
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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class calcBabygroessen extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner originDropdownBabygrößen;
    Spinner convertDropdownBabygrößen;
    Spinner sizeDropdownBabygrößen;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_babygroessen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownBabygrößen = (Spinner) findViewById(R.id.originDropdownBabygrößen);
        convertDropdownBabygrößen = (Spinner) findViewById(R.id.convertDropdownBabygrößen);
        sizeDropdownBabygrößen = (Spinner) findViewById(R.id.sizeDropdownBabygrößen);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationBabygrößen);

        List<String> elements = new ArrayList<>();
        elements.add("Amerika");
        elements.add("Europa");

        ArrayAdapter ausgangswert = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);
        ausgangswert.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownBabygrößen.setAdapter(ausgangswert);
        convertDropdownBabygrößen.setAdapter(ausgangswert);

        originDropdownBabygrößen.setOnItemSelectedListener(this);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothChild.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value = String.valueOf(originDropdownBabygrößen.getSelectedItem());

        if(value =="Amerika"){
            List<String> elements = new ArrayList<>();
            elements.add("bis zu 17 inch / bis zu 7 lbs");
            elements.add("17 - 23 inch / 7 - 12 lbs");
            elements.add("23 - 27 inch / 12 - 17 lbs");
            elements.add("25 - 27 inch / 15 - 18 lbs");
            elements.add("27 - 29 inch / 17 - 22 lbs");
            elements.add("29 - 31 inch / 22 - 27 lbs");
            elements.add("31 - 33 inch / 27 - 30 lbs");

            ArrayAdapter<String> sizes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBabygrößen.setAdapter(sizes);

        }

        if(value=="Europa"){
            List<String> elements = new ArrayList<>();
            elements.add("bis zu 43 cm / bis zu 3 kg");
            elements.add("43 - 59 cm / 3 - 5.5 kg");
            elements.add("59 - 69 cm / 5.5 - 8 kg");
            elements.add("64 - 69 cm / 7 - 8 kg");
            elements.add("69 - 74 cm / 8 - 10 kg");
            elements.add("74 - 79 cm / 10 - 12 kg");
            elements.add("79 - 84 cm / 12 - 13.5 kg");

            ArrayAdapter<String> sizes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownBabygrößen.setAdapter(sizes);


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void calcFinalSizeBabygrößen (View view){
        String finalOriginDropdown = String.valueOf(originDropdownBabygrößen.getSelectedItem());
        String finalConvertDropdown = String.valueOf(convertDropdownBabygrößen.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownBabygrößen.getSelectedItem());

        outcome.setBackgroundResource(R.drawable.image_border);

        //Hier wird die Größe von Amerika in die EU berechnet
        if(finalOriginDropdown=="Amerika"){
            if(finalSizeDropdown=="bis zu 17 inch / bis zu 7 lbs"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("bis zu 43 cm / bis zu 3 kg");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="17 - 23 inch / 7 - 12 lbs"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("43 - 59 cm / 3 - 5.5 kg");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="23 - 27 inch / 12 - 17 lbs"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("59 - 69 cm / 5.5 - 8 kg");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="25 - 27 inch / 15 - 18 lbs"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("64 - 69 cm / 7 - 8 kg");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="27 - 29 inch / 17 - 22 lbs"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("69 - 74 cm / 8 - 10 kg");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="29 - 31 inch / 22 - 27 lbs"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("74 - 79 cm / 10 - 12 kg");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="31 - 33 inch / 27 - 30 lbs"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("79 - 84 cm / 12 - 13.5 kg");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

        }

        if(finalOriginDropdown=="Europa"){
            if(finalSizeDropdown=="bis zu 43 cm / bis zu 3 kg"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("bis zu 17 inch / bis zu 7 lbs");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="43 - 59 cm / 3 - 5.5 kg"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("17 - 23 inch / 7 - 12 lbs");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="59 - 69 cm / 5.5 - 8 kg"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("23 - 27 inch / 12 - 17 lbs");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="64 - 69 cm / 7 - 8 kg"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("25 - 27 inch / 15 - 18 lbs");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="69 - 74 cm / 8 - 10 kg"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("27 - 29 inch / 17 - 22 lbs");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="74 - 79 cm / 10 - 12 kg"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("29 - 31 inch / 22 - 27 lbs");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="79 - 84 cm / 12 - 13.5 kg"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("31 - 33 inch / 27 - 30 lbs");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
    }
}
