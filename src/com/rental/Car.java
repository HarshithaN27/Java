package com.rental;
public class Car extends Vehicle {

    // Additional property
    private int numberOfDoors;

    // Constructor
    public Car(String vehicleNumber, String brand,
               String model, double rentPerDay,
               int numberOfDoors) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.numberOfDoors = numberOfDoors;
    }

    // Method Overriding
    @Override
    public void displayVehicleDetails() {

        System.out.println("Vehicle Type  : Car");
        super.displayVehicleDetails();
        System.out.println("Number of Doors : " + numberOfDoors);
    }
}


