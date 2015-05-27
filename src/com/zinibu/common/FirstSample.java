package com.zinibu.common;

public class FirstSample {

    public static void main(String[] args) {
        System.out.println("Hi, we are starting");

        double salary;

        int vacationDays = 5;
        System.out.println(vacationDays);

        final int FIVE = 5;
        System.out.println("FIVE: " + FIVE);

        Plane boeing = new Plane();
        boeing.start();

        for (int i = 1; i <= 4; i++) {
            System.out.println("i = " + i);
        }

    }

    public static final int SIX_FOR_ALL = 6;

}
