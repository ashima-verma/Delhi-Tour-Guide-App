package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.qutubminar), R.drawable.qutub_minar));
        tours.add(new Tour(getString(R.string.humayun_tomb), R.drawable.humayun_tomb));
        tours.add(new Tour(getString(R.string.red_fort), R.drawable.red_fort));
        tours.add(new Tour(getString(R.string.jama_masjid), R.drawable.jama_masjid));
        tours.add(new Tour(getString(R.string.alai_darwaza), R.drawable.alaidarwaza));
        tours.add(new Tour(getString(R.string.diwan), R.drawable.diwan));
        tours.add(new Tour(getString(R.string.alai_minar), R.drawable.alai_minar));
        tours.add(new Tour(getString(R.string.jantar_mantar), R.drawable.jantar_mantar));
        tours.add(new Tour(getString(R.string.rang_mahal), R.drawable.rang_mahal));
        tours.add(new Tour(getString(R.string.vishwa_shanti_stupa), R.drawable.vishwa_shanti_stupa));

        TourAdapter adapter = new TourAdapter(this, tours, R.color.colorAccent);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
