package com.mortgage;
public class InvestmentLoan extends Loan {

    public InvestmentLoan(double loanAmount, double interestRate) {
        super(loanAmount, interestRate);
    }

    @Override
    public double calculateInterest() {
        return loanAmount * interestRate / 100;
    }
}
