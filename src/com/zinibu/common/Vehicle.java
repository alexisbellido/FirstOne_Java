package com.zinibu.common;

public class Vehicle {

    protected String name;
    protected int speed;

    public Vehicle() {
        name = null;
        speed = 0;
    }

    public Vehicle(String n, int s) {
        name = n;
        speed = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
