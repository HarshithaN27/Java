package com.mortgage;
public class Customer {

    private int customerId;
    private String customerName;
    private String email;
    private String phone;

    public Customer(int customerId, String customerName, String email, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Email         : " + email);
        System.out.println("Phone         : " + phone);
    }
}

