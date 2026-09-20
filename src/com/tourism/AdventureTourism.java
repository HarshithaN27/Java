package com.tourism;
public class AdventureTourism extends TourismPackage {

    // Parameterized constructor
    public AdventureTourism(String packageId, String destination,
                            int days, int travelers, double basePrice) {

        super(packageId, destination, days, travelers, basePrice);
    }

    // Method overriding
    @Override
    public double calculateFinalPrice() {

        double adventureCharge = getBasePrice() * 0.15;

        return getBasePrice() + adventureCharge;
    }
}
