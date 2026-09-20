package com.rental;

/**
 * represents the address details of a customer
 */
public class Address {

    private int houseNumber;
    private String street;
    private String city;
    private String postalCode;

    /**
     *
     * @param houseNumber the houseNumber
     * @param street the street
     * @param city the city
     * @param postalCode the postalCode
     */
    // Constructor
    public Address(int houseNumber, String street,
                   String city, String postalCode) {

        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     * display the complete address details
     */

    // Display Address
    public void displayAddress() {

        System.out.println("House Number  : " + houseNumber);
        System.out.println("Street        : " + street);
        System.out.println("City          : " + city);
        System.out.println("Postal Code   : " + postalCode);
    }
}

