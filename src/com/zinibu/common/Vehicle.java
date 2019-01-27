package com.zinibu.common;

public class Vehicle {

    private String name;
    private int speed;

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

    @Override
    public String toString() {
        return getName();
    }

    public static void main(String[] args) {
        System.out.println("Vehicle class");
        Plane myPlane = new Plane("Super Avion", 150);
        System.out.println(myPlane.getName());
        myPlane.setWings(3);
        System.out.println("Number of wings: " + myPlane.getWings());
    }

}
