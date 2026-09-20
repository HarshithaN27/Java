package com.payroll;

public class Assistant extends Person {

    String name;
    int id;

    // Subclass Constructor
    Assistant(String country, String name, int id) {

        // Calling Superclass Constructor
        super(country);

        this.name = name;
        this.id = id;

        System.out.println("Assistant Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        showCountry();
    }
}