package com.example.android.quakereport;

/**
 * Created by nelly on 8/22/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mCity;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String city, long timeInMilliseconds, String url){

        mMagnitude = magnitude;
        mCity = city;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getCity(){
        return mCity;
    }

    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return  mUrl;
    }

}
