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

public class ManActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner originDropdown;
    Spinner sizeDropdown;
    Spinner convertDropdown;
    TextView outcome;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        originDropdown = (Spinner) findViewById(R.id.originDropdown);
        convertDropdown = (Spinner) findViewById(R.id.convertDropdown);
        sizeDropdown = (Spinner) findViewById(R.id.sizeDropdown);
        outcome = (TextView) findViewById(R.id.textviewSizecalculation);

        List<String> elements = new ArrayList<String>();
        elements.add("International");
        elements.add("Deutschland");
        elements.add("Österreich");
        elements.add("Schweiz");
        elements.add("Spanien");
        elements.add("Niederlande");
        elements.add("Großbritannien");
        elements.add("Amerika");

            ArrayAdapter<String> origins = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            origins.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            originDropdown.setAdapter(origins);
            convertDropdown.setAdapter(origins);


        originDropdown.setOnItemSelectedListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToCalcMenu = new Intent(this, chooseClothMan.class);
        startActivity(backToCalcMenu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String value = String.valueOf(originDropdown.getSelectedItem());

        if (value == "International") {

            List<String> elements = new ArrayList<>();
            elements.add("XS");
            elements.add("S");
            elements.add("M");
            elements.add("L");
            elements.add("XL");
            elements.add("XXL");


            ArrayAdapter<String> sizesINT = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesINT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdown.setAdapter(sizesINT);


        }

        if (value == "Deutschland" || value == "Österreich" || value == "Schweiz" || value == "Spanien" || value == "Niederlande") {

            List<String> elements = new ArrayList<>();
            elements.add("35 - 36");
            elements.add("37 - 38");
            elements.add("39 - 40");
            elements.add("41 - 42");
            elements.add("43 - 44");
            elements.add("45 - 46");


            ArrayAdapter<String> sizesDEATCHESNL = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesDEATCHESNL.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdown.setAdapter(sizesDEATCHESNL);


        }

        if (value == "Großbritannien" || value == "Amerika") {

            List<String> elements = new ArrayList<>();
            elements.add("13.5 - 14");
            elements.add("14.5 - 15");
            elements.add("15.5");
            elements.add("16 - 16.5");
            elements.add("17 - 17.5");
            elements.add("18 - 18.5");

            ArrayAdapter<String> sizesGBUS = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elements);
            sizesGBUS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sizeDropdown.setAdapter(sizesGBUS);


        }

        }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void calcFinalSize (View view) {
            outcome.setBackgroundResource(R.drawable.image_border);

            String finalOriginDropdown = String.valueOf(originDropdown.getSelectedItem());
            String finalSizeDropdown = String.valueOf(sizeDropdown.getSelectedItem());
            String finalConvertDrowdown = String.valueOf(convertDropdown.getSelectedItem());


            //Hemden - International in Deutschland, Österreich, Schweiz, Niederlande, Spanien, UK, Amerika
            if (finalOriginDropdown == "International" && finalSizeDropdown == "XS") {
                if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                    outcome.setText("35 - 36");
                }
                if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                    outcome.setText("13.5 - 14");
                }
                if (finalConvertDrowdown == "International") {
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }
            if (finalOriginDropdown == "International" && finalSizeDropdown == "S") {
                if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                    outcome.setText("37 - 38");
                }
                if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                    outcome.setText("14.5 - 15");
                }
                if (finalConvertDrowdown == "International") {
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }
            if (finalOriginDropdown == "International" && finalSizeDropdown == "M") {
                if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                    outcome.setText("39 - 40");
                }
                if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                    outcome.setText("15.5");
                }
                if (finalConvertDrowdown == "International") {
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }
            if (finalOriginDropdown == "International" && finalSizeDropdown == "L") {
                if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                    outcome.setText("41 - 42");
                }
                if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                    outcome.setText("16 - 16.5");
                }
                if (finalConvertDrowdown == "International") {
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }
            if (finalOriginDropdown == "International" && finalSizeDropdown == "XL") {
                if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                    outcome.setText("43 - 44");
                }
                if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                    outcome.setText("17 - 17.5");
                }
                if (finalConvertDrowdown == "International") {
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }

            }
            if (finalOriginDropdown == "International" && finalSizeDropdown == "XXL") {
                if (finalConvertDrowdown == "Deutschland" || finalConvertDrowdown == "Österreich" || finalConvertDrowdown == "Schweiz" || finalConvertDrowdown == "Niederlande" || finalConvertDrowdown == "Spanien") {
                    outcome.setText("45 - 46");
                }
                if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                    outcome.setText("18 - 18.5");
                }
                if (finalConvertDrowdown == "International") {
                    outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                }
            }


            //Hemden - Deutschland, Österreich, Schweiz, Niederlande, Spanien in International, UK, amerika


                if (finalOriginDropdown == "Österreich" || finalOriginDropdown == "Deutschland" || finalOriginDropdown == "Schweiz" || finalOriginDropdown == "Niederlande" || finalOriginDropdown == "Spanien") {
                    if (finalSizeDropdown == "35 - 36") {
                        if (finalConvertDrowdown == "International") {
                            outcome.setText("XS");
                        }
                        if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown =="Amerika") {
                            outcome.setText("13.5 - 14");
                        }
                        if(finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland"|| finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande"|| finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }

                        if(finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Niederlande"){
                            outcome.setText("35 - 36");
                        }

                    }

                }



                if (finalOriginDropdown == "Österreich" || finalOriginDropdown == "Deutschland" || finalOriginDropdown == "Schweiz" || finalOriginDropdown == "Niederlande" || finalOriginDropdown == "Spanien") {
                    if (finalSizeDropdown == "37 - 38") {
                        if (finalConvertDrowdown == "International") {
                            outcome.setText("S");
                        }
                        if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown =="Amerika") {
                            outcome.setText("14.5 - 15");
                        }
                        if(finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }

                        if(finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Niederlande"){
                            outcome.setText("37 - 38");
                        }
                    }
                }



                if(finalOriginDropdown == "Österreich" || finalOriginDropdown == "Deutschland" || finalOriginDropdown == "Schweiz" || finalOriginDropdown == "Niederlande" || finalOriginDropdown == "Spanien"){
                    if(finalSizeDropdown == "39 - 40"){
                        if(finalConvertDrowdown =="International") {
                            outcome.setText("M");
                        }
                            if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown =="Amerika") {
                            outcome.setText("15.5");
                            }
                        if(finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande"|| finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }
                        if(finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Niederlande"){
                            outcome.setText("39 - 40");
                        }
                    }
                }



                if (finalOriginDropdown == "Österreich" || finalOriginDropdown == "Deutschland" || finalOriginDropdown == "Schweiz" || finalOriginDropdown == "Niederlande" || finalOriginDropdown == "Spanien") {
                    if (finalSizeDropdown == "41 - 42") {
                        if (finalConvertDrowdown == "International") {
                            outcome.setText("L");
                        }
                        if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown == "Amerika") {
                            outcome.setText("16 - 16.5");
                        }
                        if(finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz"|| finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien" ){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }

                        if(finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Niederlande"){
                            outcome.setText("41 - 42");
                        }
                    }
                }



                if(finalOriginDropdown == "Österreich" || finalOriginDropdown == "Deutschland" || finalOriginDropdown == "Schweiz" || finalOriginDropdown == "Niederlande" || finalOriginDropdown == "Spanien"){
                    if(finalSizeDropdown == "43 - 44"){
                        if(finalConvertDrowdown=="International"){
                        outcome.setText("XL");
                        }
                        if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown =="Amerika") {
                        outcome.setText("17 - 17.5");
                        }
                        if(finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }
                        if(finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Niederlande"){
                            outcome.setText("43 - 44");
                        }
                    }
                }



                if(finalOriginDropdown == "Österreich" || finalOriginDropdown == "Deutschland" || finalOriginDropdown == "Schweiz" || finalOriginDropdown == "Niederlande" || finalOriginDropdown == "Spanien"){
                    if(finalSizeDropdown == "45 - 46"){
                        if(finalConvertDrowdown =="International") {
                            outcome.setText("XXL");
                        }
                        if (finalConvertDrowdown == "Großbritannien" || finalConvertDrowdown =="Amerika") {
                            outcome.setText("18 - 18.5");
                        }
                        if(finalConvertDrowdown=="Österreich" && finalOriginDropdown=="Österreich" || finalConvertDrowdown=="Deutschland" && finalOriginDropdown=="Deutschland" || finalConvertDrowdown=="Schweiz" && finalOriginDropdown=="Schweiz" || finalConvertDrowdown=="Niederlande" && finalOriginDropdown=="Niederlande" || finalConvertDrowdown=="Spanien" && finalOriginDropdown=="Spanien"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }
                        if(finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Deutschland" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Österreich" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Niederlande" || finalOriginDropdown=="Schweiz" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Niederlande" && finalConvertDrowdown=="Spanien" ||
                                finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Deutschland" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Österreich" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Schweiz" || finalOriginDropdown=="Spanien" && finalConvertDrowdown=="Niederlande"){
                            outcome.setText("45 - 46");
                        }
                    }
                }


            //Hemden -  UK, amerika in Deutschland, Österreich, Schweiz, Niederlande, Spanien, International,


                if(finalOriginDropdown =="Großbritannien" || finalOriginDropdown =="Amerika"){
                    if(finalSizeDropdown =="13.5 - 14"){
                        if(finalConvertDrowdown=="International"){
                            outcome.setText("XS");
                        }
                        if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                            outcome.setText("35 - 36");
                        }
                        if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" &&finalOriginDropdown=="Amerika"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }
                        if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                            outcome.setText("13.5 - 14");
                        }

                    }
                }



                if(finalOriginDropdown =="Großbritannien" || finalOriginDropdown =="Amerika"){
                    if(finalSizeDropdown =="14.5 - 15"){
                        if(finalConvertDrowdown=="International"){
                            outcome.setText("S");
                        }
                        if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                            outcome.setText("37 - 38");
                        }
                        if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }
                        if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                            outcome.setText("14.5 - 15");
                        }

                    }
                }



                if(finalOriginDropdown =="Großbritannien" || finalOriginDropdown =="Amerika"){
                    if(finalSizeDropdown =="15.5"){
                        if(finalConvertDrowdown=="International"){
                            outcome.setText("M");
                        }
                        if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                            outcome.setText("39 - 40");
                        }
                        if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich");
                        }
                        if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                            outcome.setText("15.5");
                        }


                    }
                }



                if(finalOriginDropdown =="Großbritannien" || finalOriginDropdown =="Amerika"){
                    if(finalSizeDropdown =="16 - 16.5"){
                        if(finalConvertDrowdown=="International"){
                            outcome.setText("L");
                        }
                        if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                            outcome.setText("41 - 42");
                        }
                        if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                        }
                        if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                            outcome.setText("16 - 16.5");
                        }


                    }
                }



                if(finalOriginDropdown =="Großbritannien" || finalOriginDropdown =="Amerika"){
                    if(finalSizeDropdown =="17 - 17.5"){
                        if(finalConvertDrowdown=="International"){
                            outcome.setText("XL");
                        }
                        if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                            outcome.setText("43 - 44");
                        }
                        if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien"|| finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                        }
                        if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                            outcome.setText("17 - 17.5");
                        }

                    }
                }



                if(finalOriginDropdown =="Großbritannien" || finalOriginDropdown =="Amerika"){
                    if(finalSizeDropdown =="18 - 18.5"){
                        if(finalConvertDrowdown=="International"){
                            outcome.setText("XXL");
                        }
                        if(finalConvertDrowdown=="Deutschland" || finalConvertDrowdown=="Österreich" || finalConvertDrowdown=="Schweiz" || finalConvertDrowdown=="Niederlande" || finalConvertDrowdown=="Spanien"){
                            outcome.setText("45 - 46");
                        }
                        if(finalConvertDrowdown=="Großbritannien" && finalOriginDropdown=="Großbritannien" || finalConvertDrowdown=="Amerika" && finalOriginDropdown=="Amerika"){
                            outcome.setText("Berechnung mit den angegebenen Kriterien nicht möglich.");
                        }
                        if(finalOriginDropdown=="Großbritannien" && finalConvertDrowdown=="Amerika" || finalOriginDropdown=="Amerika" && finalConvertDrowdown=="Großbritannien"){
                            outcome.setText("18 - 18.5");
                        }

                    }
                }
         }
    }
