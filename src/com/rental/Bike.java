package com.rental;

public class Bike extends Vehicle {

    // Additional property
    private boolean hasHelmet;

    // Constructor
    public Bike(String vehicleNumber, String brand,
                String model, double rentPerDay,
                boolean hasHelmet) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.hasHelmet = hasHelmet;
    }

    // Method Overriding
    @Override
    public void displayVehicleDetails() {

        System.out.println("Vehicle Type  : Bike");
        super.displayVehicleDetails();
        System.out.println("Helmet Included : " + hasHelmet);
    }
}

