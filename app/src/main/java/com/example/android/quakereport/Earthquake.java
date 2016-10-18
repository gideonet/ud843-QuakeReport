package com.example.android.quakereport;

/**
 * Created by Gideon on 10/16/2016.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private  String mLocation;

    /** Date of the earthquake */
    private long mTimeInMilliseconds;

    /** Construct a new {@link Earthquake} object
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the date the earthquake happened
     */
    public Earthquake (double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Return the magnitude of the earthquake
     *
     * @return
     */
    public double getMagnitude () { return mMagnitude; }

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
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}


