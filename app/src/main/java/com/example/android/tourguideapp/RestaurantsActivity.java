package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.indian_accent)));
        tours.add(new Tour(getString(R.string.tamra)));
        tours.add(new Tour(getString(R.string.dakshin)));
        tours.add(new Tour(getString(R.string.jw_marriott)));
        tours.add(new Tour(getString(R.string.cafe_lota)));
        tours.add(new Tour(getString(R.string.pan_asian)));
        tours.add(new Tour(getString(R.string.delhi_pavilion)));
        tours.add(new Tour(getString(R.string.sorrento)));
        tours.add(new Tour(getString(R.string.barbeque_nation)));
        tours.add(new Tour(getString(R.string.zaffran)));

        TourAdapter adapter = new TourAdapter(this, tours, R.color.colorPrimary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
