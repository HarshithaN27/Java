package com.payroll;

public class Person {

    final String country;

    // Superclass Constructor
    Person(String country) {
        this.country = country;
        System.out.println("Person Constructor Called");
    }

    void showCountry() {
        System.out.println("Country: " + country);
    }
}