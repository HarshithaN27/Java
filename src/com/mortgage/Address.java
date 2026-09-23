package com.mortgage;
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String postalCode;

    public Address(String houseNumber, String street, String city, String postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void displayAddress() {
        System.out.println(
                houseNumber + ", " +
                        street + ", " +
                        city + " - " +
                        postalCode
        );
    }
}
