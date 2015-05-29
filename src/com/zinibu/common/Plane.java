package com.zinibu.common;

public class Plane extends Vehicle {

    private int wings;

    public Plane() {
        System.out.println("Constructing plane");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public String getName() {
        return super.getName() + " (name of a plane)";
    }

    public void start() {
        System.out.println("This is SIX_FOR_ALL: " + FirstSample.SIX_FOR_ALL);
    }
}
