package com.makhabatusen;

public class Cat {

    private String name = null;
    private int weightKg = 3;
    private int age = 2 ;
    private  String color = "white";
    private String address = null;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weightKg, int age) {
        this.name = name;
        this.weightKg = weightKg;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weightKg, String color) {
        this.weightKg = weightKg;
        this.color = color;
        this.age = 0;
    }

    public Cat(int weightKg, String color, String address) {
        this.weightKg = weightKg;
        this.color = color;
        this.address = address;
    }


    public void getCatInfo() {
        System.out.printf("\nCat's name: %s, age: %d, weight: %d, color: %s, address: %s",
                name, age, weightKg, color, address);
    }
}
