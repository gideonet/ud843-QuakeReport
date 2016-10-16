package com.example.android.quakereport;

/**
 * Created by Gideon on 10/16/2016.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private String mMagnitude;

    /** Location of the earthquake */
    private  String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /** Construct a new {@link Earthquake} object
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earthquake happened
     */
    public Earthquake (String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Return the magnitude of the earthquake
     *
     * @return
     */
    public String getMagnitude () { return mMagnitude; }

    /**
     * Return Location of earthquake
     *
     * @return
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * REturn Date of the earthquake
     *
     * @return
     */
    public String getDate() {
        return mDate;
    }
}


