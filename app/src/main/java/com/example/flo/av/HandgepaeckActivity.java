package com.example.flo.av;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HandgepaeckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handgepaeck);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView handgepäck = (TextView) findViewById(R.id.handgepäckFirstRow);

        String t="<b>Neue Sicherheitsbestimmungen für Handgepäck</b><br><br>" +
                "Auf Flügen , die in der EU starten, dürfen Flüssigkeiten nur noch eingeschränkt mitgeführt werden<br><br>";

        handgepäck.setText(Html.fromHtml(t));

        TextView handgepäck2 = (TextView) findViewById(R.id.handgepäckSecondRow);
        String e = "<b>Volumen max. 1l</b><br><b>wiederverschließbar</b><br><b>transparent</b><br><br>";
        handgepäck2.setText(Html.fromHtml(e));

        TextView handgepäck3 = (TextView) findViewById(R.id.handgepäckThirdRow);
        String x = "Medikamente und Spezialnahrung, die während des Fluges an Bord benötigt werden, können außerhalb des Plastikbeutels transportiert werden.<br><br>";
        handgepäck3.setText(Html.fromHtml(x));

        TextView handgepäck4 = (TextView) findViewById(R.id.handgepäckFourthRow);
        String y = "Duty-free-Artikel, die an Flughäfen in der EU oder an Bord eines Flugzeuges einer EU-Fluggesellschaft erworben wurden, dürfen weiterhin mitgeführt werden.<br><br>";
        handgepäck4.setText(Html.fromHtml(y));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToMenu = new Intent(this, MenuActivity.class);
        startActivity(backToMenu);
        return true;
    }
}
