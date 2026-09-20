package com.rental;

public class Customer {

    private String customerId;
    private String customerName;
    private String phoneNumber;

    // HAS-A relationship
    private Address address;

    // Constructor
    public Customer(String customerId, String customerName,
                    String phoneNumber, Address address) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Display Customer Details
    public void displayCustomerDetails() {

        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + phoneNumber);

        System.out.println("\nAddress Details:");
        address.displayAddress();
    }
}

