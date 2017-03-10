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

public class calcUnterwaesche extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner originDropdownUW;
    Spinner sizeDropdownUW;
    Spinner convertDropdownUW;
    TextView outcomeUW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_unterwaesche);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        originDropdownUW = (Spinner) findViewById(R.id.originDropdownUW);
        convertDropdownUW = (Spinner) findViewById(R.id.convertDropdownUW);
        sizeDropdownUW = (Spinner) findViewById(R.id.sizeDropdownUW);
        outcomeUW = (TextView) findViewById(R.id.textviewSizecalculationUW);

        List<String> elements = new ArrayList<>();
        elements.add("International");
        elements.add("Deutschland");
        elements.add("Österreich");
        elements.add("Schweiz");
        elements.add("Spanien");
        elements.add("Niederlande");

        ArrayAdapter<String> origins = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
        originDropdownUW.setAdapter(origins);



        List<String> convert = new ArrayList<>();
        convert.add("International");
        convert.add("Deutschland");
        convert.add("Österreich");
        convert.add("Schweiz");
        convert.add("Spanien");
        convert.add("Niederlande");

        ArrayAdapter con = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, convert);
        convertDropdownUW.setAdapter(con);



        originDropdownUW.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothMan.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String value = String.valueOf(originDropdownUW.getSelectedItem());



        if (value == "International") {
            List<String> sizes = new ArrayList<>();
            sizes.add("S");
            sizes.add("M");
            sizes.add("L");
            sizes.add("XL");

            ArrayAdapter<String> sizesINT = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            sizesINT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownUW.setAdapter(sizesINT);

        }

        if (value == "Deutschland" || value == "Österreich" || value == "Schweiz" || value == "Niederlande" || value == "Spanien") {
            List<String> sizes = new ArrayList<>();
            sizes.add("46 - 48");
            sizes.add("50 - 52");
            sizes.add("54 - 56");
            sizes.add("58 - 60");

            ArrayAdapter<String> sizesDEATCHNLES = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sizes);
            sizesDEATCHNLES.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdownUW.setAdapter(sizesDEATCHNLES);

        }

    }

    public void calcFinalSizeUW(View view){
        outcomeUW.setBackgroundResource(R.drawable.image_border);

        String finalOriginDropdown = String.valueOf(originDropdownUW.getSelectedItem());
        String finalSizeDropdown = String.valueOf(sizeDropdownUW.getSelectedItem());
        String finalConvertDrowdown = String.valueOf(convertDropdownUW.getSelectedItem());

        //Unterwäsche - International in Deutschland, Österreich, Schweiz, Niderlande, Spanien,
        if(finalOriginDropdown=="International"){
            if(finalSizeDropdown=="S"){
                if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                    outcomeUW.setText("46 - 48");
                }
                if(finalConvertDrowdown =="International"){
                    outcomeUW.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="M"){
                if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                    outcomeUW.setText("50 - 52");
                }
                if(finalConvertDrowdown =="International"){
                    outcomeUW.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="L"){
                if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                    outcomeUW.setText("54 - 56");
                }
                if(finalConvertDrowdown =="International"){
                    outcomeUW.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

            if(finalSizeDropdown=="XL"){
                if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                    outcomeUW.setText("58 - 60");
                }
                if(finalConvertDrowdown =="International"){
                    outcomeUW.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
            }

        }
        //Unterwäsche - Deutschland, Österreich, Schweiz, Niederlande, Spanien in International

        if(finalOriginDropdown=="Deutschland" ||finalOriginDropdown=="Österreich" || finalOriginDropdown=="Schweiz" || finalOriginDropdown=="Niederlande" || finalOriginDropdown=="Spanien"){
            if(finalSizeDropdown=="46 - 48"){
                if(finalConvertDrowdown=="International"){
                    outcomeUW.setText("S");
                }
                if(finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                    TextView outcome = (TextView) findViewById(R.id.textviewSizecalculationUW);
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                    outcomeUW.setText("46 - 48");
                }
            }

            if(finalSizeDropdown=="50 - 52"){
                if(finalConvertDrowdown=="International"){
                    outcomeUW.setText("M");
                }
                if(finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                    outcomeUW.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                    outcomeUW.setText("50 - 52");
                }
            }

            if(finalSizeDropdown=="54 - 56"){
                if(finalConvertDrowdown=="International"){
                    outcomeUW.setText("L");
                }
                if(finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                    outcomeUW.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                    outcomeUW.setText("54 - 56");
                }
            }

            if(finalSizeDropdown=="58 - 60"){
                if(finalConvertDrowdown=="International"){
                    outcomeUW.setText("XL");
                }
                if(finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                    outcomeUW.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                }
                if (finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Deutschland" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Österreich" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Niederlande" || finalOriginDropdown == "Schweiz" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Niederlande" && finalConvertDrowdown == "Spanien" ||
                        finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Deutschland" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Österreich" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Schweiz" || finalOriginDropdown == "Spanien" && finalConvertDrowdown == "Niederlande") {
                    outcomeUW.setText("58 - 60");
                }
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
