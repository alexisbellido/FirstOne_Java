package com.zinibu.common;

import com.zinibu.sports.SoccerTeam;

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
        boeing.setWings(5);
        System.out.println("A boeing has " + boeing.getWings() + " wings");
        boeing.setName("Big Boeing");
        System.out.println(boeing.getName());

        for (int i = 1; i <= 4; i++) {
            System.out.println("i = " + i);
        }

        // Now, let's test arrays.

        int[] a = new int[3];
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
        Date cloneOfSomeDay = (Date) someDay.clone();
        System.out.println("This is a clone of a Date object: " + cloneOfSomeDay);

        Vehicle enterprise = new Vehicle("SS Enterpise", 5000);
        Vehicle maxFive = new Vehicle("Max 5", 100);
        System.out.println("Spaceship is called: " + enterprise.getName());
        System.out.println("Car is called: " + maxFive.getName());

        SoccerTeam team = new SoccerTeam("Boca Juniors", "Argentina", 11, maxFive);
        System.out.printf("%s is from %s and has %d players\n", team.getName(), team.getCountry(), team.getPlayers());
        team.changeToLowerCase();
        System.out.printf("%s is from %s and has %d players who travel in %s\n", team.getName(), team.getCountry(), team.getPlayers(), team.getTrasnportationName());

        runSample();

    }

    /**
     * Some sample code marked as static because it belongs to the class.
     */
    private static void runSample() {
        // Here an example of an static method; it doesn't need an instance of the class so it doesn't have a this parameter.
        System.out.println(SoccerTeam.popularChant());
        System.out.println("running sample");
    }

}