package com.makhabatusen;

import java.util.Calendar;

public class Home {
    private String name;
    private int yearOfConstruction;
    private int floors;

    // getters and Setters
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    // Constructor
    public Home(String name, int yearOfConstruction, int floors) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.floors = floors;
    }

    public int getYearsFromConstruction () {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearOfConstruction;
    }

    public void getHomeInfo() {
        System.out.printf("\n%s's name: %s, year of constructions: %d, number of floors: %d" +
                "\nYears past from construction year: %d ", getClass().getSimpleName(), name,
                yearOfConstruction, floors, getYearsFromConstruction());
    }


}
