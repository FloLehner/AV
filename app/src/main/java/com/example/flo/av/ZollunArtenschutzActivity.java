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

public class ZollunArtenschutzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zollun_artenschutz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView zollundartenschutz = (TextView) findViewById(R.id.textzollundartenschutz);
        String text="<b>Einreise aus EU-Staaten</b>" +"<br><br>"+
                "Abgabenfreie Wareneinfuhr <br>" +
                "Sie dürfen, ohne in Österreich Zoll und sonstige Abgaben zu bezahlen, Waren für den persönlichen Ge- oder Verbrauch bzw. den Ihrer Haushaltsangehörigen in Ihrem Reisegepäck einführen. Ausnahmen bestehen generell für neue Fahrzeuge, Tabakwaren und alkoholische Getränke.<br><br> " +
                "EU-Staaten sind:<br><br>" +
                "Belgien, Bulgarien, Dänemark, Deutschland, Estland, Finnland, Frankreich, Griechenland, Großbritannien, Irland, Italien, Kroatien, Lettland, Litauen, Luxemburg, Malta, die Niederlande, Österreich, Polen, Portugal, Rumänien, Schweden, Slowakei, Slowenien, Spanien, Tschechien, Ungarn und Zypern.<br><br>" +
                "<b>Ausnahmen zum freien Warenverkehr</b><br><br>" +
                "Beim Kauf neuer Fahrzeuge müssen Sie die Erwerbssteuer (Form der Umsatzsteuer) und NoVA (Normverbrauchsabgabe) bezahlen. Sie erhalten jedoch das Fahrzeug von Ihrem Verkäufer umsatzsteuerfrei.<br><br>" +
                "Tabakwaren oder alkoholische Getränke in Ihrem Reisegepäck sind nur abgabenfrei, wenn sie Ihrem Eigenbedarf dienen. Bei Überschreitung der folgenden Richtmengen müssen Sie darlegen, dass die Waren für Ihren Eigenbedarf bestimmt sind.<br><br>" +
                "<b>Zigaretten aus Ungarn, Kroatien, Lettland, Litauen, Rumänien oder Bulgarien</b><br>" +
                "300 Stück<br>" +
                "Für jene Zigaretten, die Sie über diese Freimenge hinaus mitführen, müssen Sie die Tabaksteuer beim Zollamt unverzüglich (mündlich) anmelden und entrichten!<br><br>" +
                "<b>Zigaretten aus allen anderen EU-Ländern</b><br>" +
                "800 Stück<br><br>" +
                "<b>Zigarillos</b>" +
                "(Zigarren mit einem Stückgewicht von max. drei Gramm)<br>" +
                "400 Stück<br><br>" +
                "<b>Zigarren</b><br> " +
                "200 Stück<br><br>" +
                "<b>Rauchtabak</b><br>" +
                "1 Kilogramm<br><br>" +
                "<b>Spirituosen</b><br>" +
                "10 Liter<br><br>" +
                "<b>Andere Alkoholika</b><br>" +
                "als Bier, Schaumwein oder Wein <b>bis 22% vol.</b><br>" +
                "20 Liter<br><br>" +
                "<b>Wein</b><br>" +
                "(davon max. 60 Liter Schaumwein)<br>" +
                "90 Liter<br><br>" +
                "<b>Bier</b><br>" +
                "110 Liter<br><br><br><br>" +

                "<b>Einreise aus Nicht-EU-Staaten</b><br>" +
                "Zollanmeldung von Waren<br>" +
                "Folgende Waren müssen Sie deklarieren:<br><br>" +
                "Waren, die nicht für Ihren persönlichen Ge- oder Verbrauch oder den Ihrer Haushaltsangehörigen bestimmt sind,<br><br>" +
                "außerhalb der EU erworbene Waren, die die Freimengen für Tabakwaren, Alkoholika, nicht schäumende Weine, Bier und Arzneimittel oder die Freigrenze von 430 € für Flugreisende oder 300 € für alle anderen Reisenden für andere Waren übersteigen,<br><br>" +
                "Waren, die gesonderten Einfuhrverboten und -beschränkungen unterliegen.<br><br><br><br>" +
                "Mit zu deklarierenden Waren müssen Sie zwecks Zollanmeldung den sogenannten \"Rotkanal\" (speziell ausgewiesener Ausgang für Reisende, die zu deklarierende Waren einführen) benützen. Hat eine Zollstelle keine getrennten Kontrollausgänge, deklarieren Sie diese Waren bitte von sich aus. Im Zuge der Zollanmeldung sind der Zoll und die sonstigen Eingangsabgaben (z.B. die in Österreich geltende Umsatzsteuer) grundsätzlich zu bezahlen. Bei der Berechnung dieser Abgaben wird meist vom Kaufpreis ausgegangen. Bewahren Sie daher Einkaufsbelege oder Rechnungen über die im Ausland gekauften Waren auf.<br><br>" +
                "Wenn Sie keine anzumeldenden Waren mitführen, benützen Sie den sogenannten \"Grünkanal\" (speziell ausgewiesener Ausgang für Reisende, die keine zu deklarierenden Waren einführen).<br><br>" +
                "Für Personal von Verkehrsmitteln, im \"kleinen\" Grenzverkehr mit der Schweiz/Liechtenstein und für Reisende mit gewöhnlichem Wohnsitz in Österreich, die aus dem Samnauntal einreisen, gelten jeweils Sonderregelungen.<br><br>" +
                "<b>Einfuhr von Barmitteln</b><br><br>"+
                "Sollten bei der Einreise Barmittel und gleichgestellte Zahlungsmittel in der Höhe von 10.000 € oder mehr mit sich führen, müssen Sie diese Barmittel anmelden. Das Anmeldeformular 'Überwachung von Barmitteln' steht auf www.bmf.gv.at unter der Rubrik 'Zoll', 'Reise' - 'Mitnahme Bargeld' - Anmeldeformular ZA 292 als Download zur Verfügung oder liegt bei Ihrem Zollamt auf.<br><br>" +
                "<b>Abgabenfreie Einfuhr von Waren - Freimengen</b><br><br>Sie dürfen - ohne in Österreich Zoll und sonstige Abgaben zu bezahlen - folgende Waren pro Kalendertag bei der Einreise aus Nicht EU-Staaten für Ihren persönlichen Ge- oder Verbrauch bzw. den Ihrer Familienangehörigen oder als Geschenk in Ihrem Reisegepäck einführen:<br><br><br>" +
                "<b>Alkoholika</b> (ab einem Alter von 17 Jahren)<br><br>" +
                "<b>1 Liter</b><br>    Alkohol und alkoholische " +
                "Getränke mit einem Alkoholgehalt von mehr als 22% vol oder unvergällter Ethylalkohol mit einem Alkoholgehalt von 80 % vol oder mehr " +
                "<b>oder</b><br><br> <b>2 Liter</b><br>    Alkohol und alkoholische Getränke mit einem Alkoholgehalt von höchstens 22 % vol " +
                "<b>oder</b> eine anteilige Zusammenstellung der Waren <b>und zusätzlich</b><br><br> <b>4 Liter</b><br>    nicht schäumende Weine sowie<br><br> " +
                "<b>16 Liter</b><br>  Bier <br><br><br>" +
                "<b>Tabakwaren</b> (ab einem Alter von 17 Jahren)<br> " +
                "200 Stück Zigaretten oder <br>" +
                "100 Stück Zigarillos oder <br>" +
                "50 Stück Zigarren oder <br>" +
                "250 Gramm Rauchtabak oder <br>" +
                "eine anteilige Zusammenstellung der Waren<br><br>" +
                "<b>Arzneimittel</b><br> in der Ihrem Reisebedarf entsprechenden Menge<br><br> <b>Hinweis</b><br> Ohne Bewilligung können Reisende mit EU-Wohnsitz jene Arzneimittel, die sie bereits bei der Ausreise mitgeführt haben, wieder nach Österreich einführen. Im Ausland erworbene Arzneimittel dürfen aber nur in einer Menge bis zu jeweils drei Einzelhandelspackungen pro Person bewilligungsfrei eingeführt werden.<br><br><br> <b>Andere Waren</b><br> " +
                "bis zu einem Gesamtwert von 430 € für Flugreisende oder bis zu einem Gesamtwert von 300 € für alle anderen Reisenden. " +
                "Für Reisende unter 15 Jahren verringern sich diese beiden Freigrenzen generell auf 150 €.<br><br> <b>Hinweis</b><br> " +
                "Einfuhrverbote- und Beschränkungen sind aber auch bei diesen abgabefreien Waren zu beachten!<br><br><br>" +
                "<b>Zollkontrollen</b><br><br> Zollkontrollen im Reiseverkehr gibt es weiterhin. Diese Kontrollen werden an der Grenze zu Nicht-EU-Staaten ständig bzw. an der Grenze zu EU-Staaten fallweise auch mobil im Inland durchgeführt. Sie dienen vielfältigen Allgemeininteressen, wie beispielsweise der Bekämpfung von Schmuggel und Produktpiraterie oder dem Schutz der Umwelt und Gesundheit.<br><br> " +
                "<b>Gesonderte Einfuhrverbote und -beschränkungen</b><br><br> Die Einfuhr von Tieren, Pflanzen, Lebensmitteln, Arzneimitteln, Waffen und vielen anderen Waren unterliegt gesonderten Verboten und Beschränkungen. Diese Bestimmungen gelten sowohl bei der Einreise aus der EU- bzw. Nicht-EU-Staaten. Zum Schutz des Lebens und der Gesundheit von Menschen, Tieren und Pflanzen oder der öffentlichen Sicherheit ist diesen Regelungen besonderes Augenmerk zu schenken. Am besten erkundigen Sie sich vor Ihrem Urlaubsantritt nach den aktuellen Einfuhrbestimmungen bei der Zentralen Auskunftsstelle Zoll oder Ihrem Zollamt.<br><br>" +
                "" +
                "<b>Information</b><br> " +
                "<b>Zentrale Auskunftsstelle Zoll</b><br> " +
                "Zollamt Klagenfurt Villach, Ackerweg 19, 9500 Villach<br>" +
                "Telefon +43(0)1 51433 564 053<br>" +
                "Fax x43(0)1 51433 5964053<br>" +
                "Mo-Fr 6.00-22.00 Uhr<br>" +
                "E-Mail zollinfo@bmf.gv.at<br>" +
                "BMF-Homepage www.bmf.gv.at (Zoll)<br><br><br>" +

                "<b>Artenschutzrechtliche Beschränkungen für Tiere und Pflanzen</b><br><br>" +
                "Zum Schutz bedrohter Tier- und Pflanzenarten gelten artenschutzrechtliche Beschränkungen auch im Reiseverkehr. Durch das Washingtoner Artenschutzübereinkommen (CITES), die Artenhandelsverordnung der EU und das österreichischen Artenhandelsgesetz 2009 wird der Handel mit bedrohten Arten streng kontrolliert, eingeschränkt oder gänzlich verboten. Über 30.000 Tier- und Pflanzenarten sind inzwischen geschützt. Die Regelungen für die Mitnahme dieser geschützten Arten umfassen nicht nur lebende, sondern auch tote Tiere und Pflanzen sowie einzelne Teile und Erzeugnisse daraus, die nur mit entsprechenden CITES Ein- und Ausfuhrgenehmigung legal mitgebracht werden dürfen.<br><br>" +
                "Ein kleiner Überblick über geschützte Gegenstände:<br><br><br>" +
                "" +
                "Papageien, Greifvögel, Schildkröten und andere Reptilien<br><br>" +
                "Orchideen oder Kakteen<br><br>" +
                "Lederprodukte aus Reptilienhäuten wie Taschen, Schuhe oder Gürtel<br><br>" +
                "Felle, Häute, Zähne und Klauen von Raubtieren wie Tigern, Leoparden, Jaguaren oder Fleckenkatzen<br><br>" +
                "Schmuck, Accessoires oder Kunstgegenstände aus Elfenbein und Elefantenleder<br><br>" +
                "Lederprodukte von Flusspferden, Warzenschweinen, Nashörnern, sowie afrikanischen Schlangen- und Krokodilarten<br><br>" +
                "Produkte aus Panzern von Meeresschildkröten<br><br>" +
                "\"Arzneimittel\" mit Inhaltsstoffen von Tiger- oder Leopardenknochen, vermahlenen Nashörnern oder Gallenflüssigkeit von Bären<br><br>" +
                "Stör-Kaviar (die private Einfuhr zum persönlichen Gebrauch von 125 g pro Person ist ohne Genehmigung gestattet)<br><br>" +
                "Schmuck und Souvenirs aus Korallen, Schildpatt, Muscheln und Schnecken<br><br>" +
                "" +
                "Sollten Sie also Waren einführen wollen, die den Artenschutzbeschränkungen unterliegen, müssen Sie je nach Schutzwürdigkeit der Tiere oder Pflanzen, die jeweils erforderlichen Artenschutzdokumente sowohl bei der Ausfuhr aus dem Urlaubsland als auch bei der Einfuhr nach Österreich der Zollstelle vorlegen.<br><br>" +
                "<b>Folgende Waren können Sie derzeit bei privaten Einfuhren zum persönlichen Gebrauch ohne Artenschutzdokumente mitnehmen:</b><br><br><br><br>" +
                "" +
                "bis zu 125 Gramm Kaviar von Störarten in einzelnen gekennzeichneten Behältern und/oder<br><br>" +
                "bis zu drei Stück Regenstöcken/rainsticks (aus Kakteenholz gefertigte Musikinstrumente) und/oder<br><br>" +
                "bis zu vier Erzeugnisse von toten, verarbeiteten Exemplaren von Krokodilen (ausgenommen Fleisch und Jagdtrophäen) und/oder<br><br>" +
                "bis zu drei Gehäuse von Fechterschnecken und/oder<br><br>" +
                "bis zu vier tote Exemplare von Seepferdchen und/oder<br><br>" +
                "bis zu drei Exemplare von Riesenmuscheln, insgesamt nicht mehr als drei Kilogramm, wobei ein Exemplar aus einer intakten vollständigen Schale oder zwei zusammenpassenden Schalenhälften bestehen kann<br><br><br><br>" +
                "" +
                "Weiterführende Informationen finden Sie unter www.cites.at.<br>" +
                "CITES-Genehmigungen in Österreich erteilt auch das Bundesministerium für Land- und Forstwirtschaft, Umwelt und Wasserwirtschaft (www.bmlfuw.gv.at).<br><br><br>" +
                "" +
                "Quelle<br><br>" +
                "Bundesministerium für Finanzen, Abt. I/8<br>Öffentlichkeitsarbeit und Kommunikation,<br>" +
                "Johannesgasse 5,1010 Wien";



        zollundartenschutz.setText(Html.fromHtml(text));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backToMenu = new Intent (this, MenuActivity.class);
        startActivity(backToMenu);
        return true;
    }
}
