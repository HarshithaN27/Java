package com.rental;
public class Truck extends Vehicle {

    // Additional property
    private int loadCapacity;

    // Constructor
    public Truck(String vehicleNumber, String brand,
                 String model, double rentPerDay,
                 int loadCapacity) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.loadCapacity = loadCapacity;
    }

    // Method Overriding
    @Override
    public void displayVehicleDetails() {

        System.out.println("Vehicle Type  : Truck");
        super.displayVehicleDetails();
        System.out.println("Load Capacity : " + loadCapacity + " Tons");
    }
}

