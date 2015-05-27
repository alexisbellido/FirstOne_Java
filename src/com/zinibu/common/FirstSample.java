package com.zinibu.common;

public class FirstSample {

    public static final int SIX_FOR_ALL = 6;

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

        // Now, let's test arrays.

        int[] a = new int[10];
        a[0] = 1;
        a[1] = 2;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

        for (int element: a) {
            System.out.printf("number: %d\n", element);
        }


    }

}
