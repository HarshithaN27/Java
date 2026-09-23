package com.mortgage;
public class HomeLoan extends Loan {

    public HomeLoan(double loanAmount, double interestRate) {
        super(loanAmount, interestRate);
    }

    @Override
    public double calculateInterest() {
        return loanAmount * interestRate / 100;
    }
}
