package com.mortgage;
public class LoanApplication {

    private int applicationId;
    private Customer customer;
    private Employment employment;
    private Property property;
    private double requestedAmount;

    public LoanApplication(int applicationId,
                           Customer customer,
                           Employment employment,
                           Property property,
                           double requestedAmount) {

        this.applicationId = applicationId;
        this.customer = customer;
        this.employment = employment;
        this.property = property;
        this.requestedAmount = requestedAmount;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employment getEmployment() {
        return employment;
    }

    public Property getProperty() {
        return property;
    }

    public void displayApplication() {
        System.out.println("Application ID : " + applicationId);
        System.out.println("Requested Loan : ₹" + requestedAmount);
    }
}
