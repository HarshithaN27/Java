package com.tourism;
public class InternationalTourism extends TourismPackage {

    // Parameterized constructor
    public InternationalTourism(String packageId, String destination,
                                int days, int travelers, double basePrice) {

        super(packageId, destination, days, travelers, basePrice);
    }

    // Method overriding
    @Override
    public double calculateFinalPrice() {

        double serviceCharge = getBasePrice() * 0.10;
        double tax = getBasePrice() * 0.08;

        return getBasePrice() + serviceCharge + tax;
    }
}

