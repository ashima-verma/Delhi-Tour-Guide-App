package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.tourguideapp.R.id.religious;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the monuments category
        TextView monuments = (TextView) findViewById(R.id.monument);

        //Set a click listener on that View
        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the (@link MonumentsActivity}
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);

                //start the new activity
                startActivity(monumentsIntent);
            }
        });

        //Find the View that shows the parks category
        TextView parks = (TextView) findViewById(R.id.parks);

        //Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the (@link ParksActivity}
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);

                //start the new activity
                startActivity(parksIntent);
            }
        });

        //Find the View that shows the religious category
        TextView religious = (TextView) findViewById(R.id.religious);

        //Set a click listener on that View
        religious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the (@link ReligiousAactivity}
                Intent religiousIntent = new Intent(MainActivity.this, ReligiousAactivity.class);

                //start the new activity
                startActivity(religiousIntent);
            }
        });

        //Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        //Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the (@link RestaurantsAactivity
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                //start the new activity
                startActivity(restaurantsIntent);
            }
        });
    }
}
