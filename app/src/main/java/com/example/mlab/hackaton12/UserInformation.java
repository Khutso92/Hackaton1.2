package com.example.mlab.hackaton12;



public class UserInformation {


    public  String name;
    public double latitude;
    public double longitude;


    public UserInformation(double longitude, double latitude, String name) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
    }
}
