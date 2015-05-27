package com.zinibu.sports;

import com.zinibu.common.Vehicle;

public class SoccerTeam {

    private String name;
    private String country;
    private int players;
    private Vehicle transportation;

    public SoccerTeam(String n, String c, int p, Vehicle t) {
        name = n;
        country = c;
        players = p;
        transportation = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Use this to avoid shadowing instance field with the same name and easily distinguish between
        // instance field and local variable.
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public Vehicle getTransportation() {
        return transportation;
    }

    public void setTransportation(Vehicle transportation) {
        this.transportation = transportation;
    }

    public String getTrasnportationName() {
        return transportation.getName();
    }

    public void changeToLowerCase() {
        name = name.toLowerCase();
        country = country.toLowerCase();
    }
}
