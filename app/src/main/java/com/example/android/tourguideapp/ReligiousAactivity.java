package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ReligiousAactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.lotus_temple), R.drawable.lotus_temple));
        tours.add(new Tour(getString(R.string.fatehpuri_mosque), R.drawable.fatehpuri_mosque));
        tours.add(new Tour(getString(R.string.khirki_masjid), R.drawable.khirki_masjid));
        tours.add(new Tour(getString(R.string.jama_masjid), R.drawable.jama_masjid));
        tours.add(new Tour(getString(R.string.chhatarpur_temple), R.drawable.chhatarpur_temple));
        tours.add(new Tour(getString(R.string.laskhminarayan_temple), R.drawable.laskhminarayan_temple));
        tours.add(new Tour(getString(R.string.iskcon_temple), R.drawable.iskcon_temple));
        tours.add(new Tour(getString(R.string.malai_mandir), R.drawable.malai_mandir));
        tours.add(new Tour(getString(R.string.akshardham), R.drawable.akshardham));
        tours.add(new Tour(getString(R.string.vishwa_shanti_stupa), R.drawable.vishwa_shanti_stupa));

        TourAdapter adapter = new TourAdapter(this, tours, R.color.colorAccent);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
