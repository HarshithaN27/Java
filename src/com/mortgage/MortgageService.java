package com.mortgage;
public class MortgageService implements Verifiable, LoanProcessor {

    @Override
    public void verify() {
        System.out.println("Mortgage application verified.");
    }

    @Override
    public void processLoan() {
        System.out.println("Loan processing completed.");
    }

    public void checkCreditScore(int creditScore) {

        if (creditScore >= 650) {
            System.out.println("Credit Check : Passed");
        } else {
            System.out.println("Credit Check : Failed");
        }
    }

    public boolean checkEligibility(LoanApplication application) {

        double income = application.getEmployment().getAnnualIncome();
        double loanAmount = application.getRequestedAmount();

        return income >= 500000 && loanAmount <= income * 5;
    }
}
