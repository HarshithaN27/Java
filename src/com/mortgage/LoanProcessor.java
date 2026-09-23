package com.mortgage;
public interface LoanProcessor {

    void processLoan();

    static void showSystemMessage() {
        System.out.println("Loan processing system is active.");
    }
}
