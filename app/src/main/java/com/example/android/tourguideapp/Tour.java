package com.example.android.tourguideapp;

import static android.R.attr.name;

/**
 * Created by Om on 21-Mar-17.
 */

public class Tour {

    //Name for the tour
    private String mName;

    //Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Tour(String name) {
        mName = name;
    }

    public Tour(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
