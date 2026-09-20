package com.rental;

public class Rental {

    private String rentalId;
    private int rentalDays;

    // HAS-A Customer
    private Customer customer;

    // HAS-A Vehicle
    private Vehicle vehicle;

    // Constructor
    public Rental(String rentalId, int rentalDays,
                  Customer customer, Vehicle vehicle) {

        this.rentalId = rentalId;
        this.rentalDays = rentalDays;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    // Calculate Total Rental Cost
    public double calculateTotalCost() {

        return vehicle.getRentPerDay() * rentalDays;
    }

    // Display Rental Details
    public void displayRentalDetails() {

        System.out.println("========================================");
        System.out.println("       VEHICLE RENTAL MANAGEMENT");
        System.out.println("========================================");

        System.out.println("\nCustomer Information:");
        customer.displayCustomerDetails();

        System.out.println("\nVehicle Information:");
        vehicle.displayVehicleDetails();

        System.out.println("\nRental ID    : " + rentalId);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Amount : €" + calculateTotalCost());
    }
}


