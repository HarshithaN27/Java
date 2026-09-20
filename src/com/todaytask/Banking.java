package com.todaytask;

public class Banking {

    String bankName = "ABC Bank";

    void displayBank() {
        System.out.println("Bank Name: " + bankName);
    }
}

class Account extends Banking {

    int accountNumber = 101;

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
    }
}

class Main {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.displayBank();
        acc.displayAccount();
    }
}