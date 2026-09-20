package com.tourism;
public class DomesticTourism extends TourismPackage {

    // Parameterized constructor
    public DomesticTourism(String packageId, String destination,
                           int days, int travelers, double basePrice) {

        super(packageId, destination, days, travelers, basePrice);
    }

    // Method overriding
    @Override
    public double calculateFinalPrice() {

        double serviceCharge = getBasePrice() * 0.05;

        return getBasePrice() + serviceCharge;
    }
}

