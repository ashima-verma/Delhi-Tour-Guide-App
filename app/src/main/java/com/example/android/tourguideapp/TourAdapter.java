package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by Om on 21-Mar-17.
 */

public class TourAdapter extends ArrayAdapter<Tour> {
    private int mColorResourceId;

    public TourAdapter(Context context, ArrayList<Tour> tours, int colorResourceId) {
        super(context, 0, tours);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        Tour currentTour = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.name_text);

        nameText.setText(currentTour.getmName());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentTour.hasImage()) {
            imageView.setImageResource(currentTour.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.name_text);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
