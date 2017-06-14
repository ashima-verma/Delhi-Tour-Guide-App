package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.india_gate), R.drawable.india_gate));
        tours.add(new Tour(getString(R.string.coronation_durbar_park), R.drawable.coronation_durbar_park));
        tours.add(new Tour(getString(R.string.nehru_park), R.drawable.nehru_park));
        tours.add(new Tour(getString(R.string.talkatora_gardens), R.drawable.talkatora_gardens));
        tours.add(new Tour(getString(R.string.lodi_garden), R.drawable.lodi_garden));
        tours.add(new Tour(getString(R.string.garden_of_five_senses), R.drawable.garden_of_five_senses));

        TourAdapter adapter = new TourAdapter(this, tours, R.color.colorPrimary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
