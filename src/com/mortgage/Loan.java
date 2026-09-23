package com.mortgage;
public abstract class Loan {

    protected double loanAmount;
    protected double interestRate;

    public Loan(double loanAmount, double interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    // Abstract method
    public abstract double calculateInterest();

    // Concrete method
    public void displayLoanDetails() {
        System.out.println("Loan Amount   : ₹" + loanAmount);
        System.out.println("Interest Rate : " + interestRate + "%");
    }

    // Static method
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    // Method Overloading
    public double calculateEMI(int months) {
        return loanAmount / months;
    }

    public double calculateEMI(int months, double extraCharge) {
        return (loanAmount + extraCharge) / months;
    }
}
