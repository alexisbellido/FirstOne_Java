package com.zinibu.common;

import java.util.Arrays;
import java.util.Date;

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

        System.out.println(Arrays.toString(a));

        int[] myNumbers = {1, 5, 7};
        System.out.println(Arrays.toString(myNumbers));

        int[] copyMyNumbers = Arrays.copyOf(myNumbers, myNumbers.length);
        copyMyNumbers[1] = 500;
        System.out.println(Arrays.toString(copyMyNumbers));
        // original stays the same
        System.out.println(Arrays.toString(myNumbers));

        if (args.length > 0) {
            System.out.println("String[] args to see what was passed from command line:");
            System.out.println(Arrays.toString(args));
        }

        Date someDay = new Date();
        System.out.println(someDay);

        Vehicle enterprise = new Vehicle("SS Enterpise", 5000);
        Vehicle maxFive = new Vehicle("Max 5", 100);
        System.out.println("Spaceship is called: " + enterprise.getName());
        System.out.println("Car is called: " + maxFive.getName());

    }

}
