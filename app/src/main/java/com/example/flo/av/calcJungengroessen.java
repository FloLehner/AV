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

import java.util.ArrayList;
import java.util.List;

public class calcJungengroessen extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner originDropdownJungengrößen;
    Spinner convertDropdownJungengrößen;
    Spinner sizeDropdownJungengrößen;
    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_jungengroessen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownJungengrößen = (Spinner) findViewById(R.id.originDropdownJungengrößen);
        convertDropdownJungengrößen = (Spinner) findViewById(R.id.convertDropdownJungengrößen);
        sizeDropdownJungengrößen = (Spinner) findViewById(R.id.sizeDropdownJungengrößen);
        outcome = (TextView) findViewById(R.id.textviewSizecalculationJungengrößen);

        List<String> origin = new ArrayList<>();
        origin.add("International");
        origin.add("Amerika");
        origin.add("Europa");

        ArrayAdapter origins = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, origin);
        origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originDropdownJungengrößen.setAdapter(origins);
        convertDropdownJungengrößen.setAdapter(origins);

        originDropdownJungengrößen.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothChild.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value = String.valueOf(originDropdownJungengrößen.getSelectedItem());

        if(value=="International"){
            List<String> sizes = new ArrayList<>();
            sizes.add("2XS");
            sizes.add("XS");
            sizes.add("S");
            sizes.add("M");
            sizes.add("L");
            sizes.add("X2L");
            sizes.add("XL");

            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownJungengrößen.setAdapter(adapter);

        }
        if(value=="Amerika"){
            List<String> sizes = new ArrayList<>();
            sizes.add("3");
            sizes.add("4 - 5");
            sizes.add("6 - 7");
            sizes.add("8");
            sizes.add("10");
            sizes.add("12");
            sizes.add("14");

            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownJungengrößen.setAdapter(adapter);

        }
        if(value=="Europa"){
            List<String> sizes = new ArrayList<>();
            sizes.add("3");
            sizes.add("4 - 5");
            sizes.add("6 - 8");
            sizes.add("9");
            sizes.add("10 - 11");
            sizes.add("12");
            sizes.add("14 - 16");

            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownJungengrößen.setAdapter(adapter);
        }

    }

    public void calcFinalSizeJungengrößen(View view){
        outcome.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdown = String.valueOf(originDropdownJungengrößen.getSelectedItem());
        String finalConvertDropdown = String.valueOf(convertDropdownJungengrößen.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownJungengrößen.getSelectedItem());

        //International in Amerika und Europa

        if(finalOriginDropdown=="International"){
            if(finalSizeDropdown=="2XS"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("3");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("3");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="XS"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("4 - 5");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("4 - 5");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="S"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("6 - 7");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("6 - 8");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="M"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("9");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="L"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("10 - 11");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="X2L"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("12");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="XL"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("14");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("14 - 16");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }
        //Amerika in Europa und International

        if(finalOriginDropdown=="Amerika"){
            if(finalSizeDropdown=="3"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("3");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("2XS");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }

            }

            if(finalSizeDropdown=="4 - 5"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("4 - 5");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("XS");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }

            }

            if(finalSizeDropdown=="6 - 7"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("6 - 8");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("S");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }

            }

            if(finalSizeDropdown=="8"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("9");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("M");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }

            }

            if(finalSizeDropdown=="10"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("10 - 11");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("L");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }

            }

            if(finalSizeDropdown=="12"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("12");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("X2L");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }

            }

            if(finalSizeDropdown=="14"){
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("14 - 16");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }

            }
        }

        //Europa in Amerika und International

        if(finalOriginDropdown=="Europa"){
            if(finalSizeDropdown=="3"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("3");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("2XS");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="4 - 5"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("4 - 5");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("XS");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="6 - 8"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("6 - 7");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("S");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="9"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("8");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("M");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="10 - 11"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("10");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("L");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="12"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("12");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("X2L");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="14 - 16"){
                if(finalConvertDropdown=="Amerika"){
                    outcome.setText("14");
                }
                if(finalConvertDropdown=="International"){
                    outcome.setText("XL");
                }
                if(finalConvertDropdown=="Europa"){
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
