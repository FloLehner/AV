package com.example.flo.av;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class calcKindergroessen extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner originDropdownKindergrößen;
    Spinner convertDropdownKindergrößen;
    Spinner sizeDropdownKindergrößen;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_kindergroessen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownKindergrößen = (Spinner) findViewById(R.id.originDropdownKindergrößen);
        convertDropdownKindergrößen = (Spinner) findViewById(R.id.convertDropdownKindergrößen);
        sizeDropdownKindergrößen = (Spinner) findViewById(R.id.sizeDropdownKindergrößen);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationKindergrößen);

        List<String> element = new ArrayList<>();
        element.add("International");
        element.add("Amerika");
        element.add("Europa");

        ArrayAdapter<String> origin = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, element);
        origin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownKindergrößen.setAdapter(origin);
        convertDropdownKindergrößen.setAdapter(origin);

        originDropdownKindergrößen.setOnItemSelectedListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothChild.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value = String.valueOf(originDropdownKindergrößen.getSelectedItem());

        if(value=="Amerika"){
        List<String> sizes = new ArrayList<>();
            sizes.add("33 - 36 in / 30 - 32 lbs");
            sizes.add("36 - 39 in / 32 - 35 lbs");
            sizes.add("39 - 42 in / 35 - 41 lbs");
            sizes.add("42 - 45 in / 41 - 46 lbs");
            sizes.add("45 - 48 in / 46 - 51 lbs");

            ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownKindergrößen.setAdapter(adapter);
        }

        if(value=="Europa"){
            List<String> sizes = new ArrayList<>();
            sizes.add("84 - 91.5 cm / 13.5 - 14.5 kg");
            sizes.add("91.5 - 99 cm / 14.5 - 15.5 kg");
            sizes.add("99 - 107 cm / 15.5 - 18.5 kg");
            sizes.add("107 - 114 cm / 18.5 - 21 kg");
            sizes.add("114 - 121 cm / 21 - 24 kg");

            ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownKindergrößen.setAdapter(adapter);
        }

        if(value=="International"){
            List<String> sizes = new ArrayList<>();
            sizes.add("XS / S");
            sizes.add("M");
            sizes.add("L");
            sizes.add("XL");
            sizes.add("XXL");

            ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownKindergrößen.setAdapter(adapter);
        }

    }

    public void calcFinalSizeKindergrößen(View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdown = String.valueOf(originDropdownKindergrößen.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownKindergrößen.getSelectedItem());
        String finalConverDropdown = String.valueOf(convertDropdownKindergrößen.getSelectedItem());

        //Amerika in EU und International

        if(finalOriginDropdown=="Amerika"){
            if(finalSizeDropdown=="33 - 36 in / 30 - 32 lbs"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("84 - 91.5 cm / 13.5 - 14.5 kg");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("XS / S");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="36 - 39 in / 32 - 35 lbs"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("91.5 - 99 cm / 14.5 - 15.5 kg");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("M");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="39 - 42 in / 35 - 41 lbs"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("99 - 107 cm / 15.5 - 18.5 kg");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("L");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="42 - 45 in / 41 - 46 lbs"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("107 - 114 cm / 18.5 - 21 kg");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("XL");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="45 - 48 in / 46 - 51 lbs"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("114 - 121 cm / 21 - 24 kg");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("XXL");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }

        if(finalOriginDropdown=="Europa"){
            if(finalSizeDropdown=="84 - 91.5 cm / 13.5 - 14.5 kg"){
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("33 - 36 in / 30 - 32 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("XS / S");
                }
                if(finalConverDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="91.5 - 99 cm / 14.5 - 15.5 kg"){
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("36 - 39 in / 32 - 35 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("M");
                }
                if(finalConverDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="99 - 107 cm / 15.5 - 18.5 kg"){
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("39 - 42 in / 35 - 41 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("L");
                }
                if(finalConverDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="107 - 114 cm / 18.5 - 21 kg"){
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("42 - 45 in / 41 - 46 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("XL");
                }
                if(finalConverDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="114 - 121 cm / 21 - 24 kg"){
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("45 - 48 in / 46 - 51 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("XXL");
                }
                if(finalConverDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

        }

        if(finalOriginDropdown=="International"){
            if(finalSizeDropdown=="XS / S"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("84 - 91.5 cm / 13.5 - 14.5 kg");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("33 - 36 in / 30 - 32 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="M"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("91.5 - 99 cm / 14.5 - 15.5 kg");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("36 - 39 in / 32 - 35 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="L"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("99 - 107 cm / 15.5 - 18.5 kg");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("39 - 42 in / 35 - 41 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="XL"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("107 - 114 cm / 18.5 - 21 kg");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("42 - 45 in / 41 - 46 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="XXL"){
                if(finalConverDropdown=="Europa"){
                    outcome.setText("114 - 121 cm / 21 - 24 kg");
                }
                if(finalConverDropdown=="Amerika"){
                    outcome.setText("45 - 48 in / 46 - 51 lbs");
                }
                if(finalConverDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
