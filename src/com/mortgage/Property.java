package com.mortgage;
public class Property {

    private String propertyId;
    private String propertyType;
    private double propertyValue;
    private Address address;

    public Property(String propertyId, String propertyType,
                    double propertyValue, Address address) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.propertyValue = propertyValue;
        this.address = address;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void verifyProperty() {
        System.out.println("Property verification completed.");
        System.out.println("Property ID    : " + propertyId);
        System.out.println("Property Type  : " + propertyType);
        System.out.println("Property Value : ₹" + propertyValue);

        System.out.print("Address        : ");
        address.displayAddress();
    }
}
