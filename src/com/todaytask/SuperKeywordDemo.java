package com.todaytask;

public class SuperKeywordDemo {

    public static void main(String[] args) {

        PremiumAccount account = new PremiumAccount();

        account.printDetails();

        Staff staff = new Staff();
    }
}


// Parent class
class CustomerAccount {

    String name = "Customer Account";

    void display() {
        System.out.println("Customer Account Display");
    }
}


// Child class
class PremiumAccount extends CustomerAccount {

    String name = "Premium Account";

    void printDetails() {

        // Child class variable
        System.out.println(name);

        // Parent class variable
        System.out.println(super.name);

        // Parent class method
        super.display();
    }
}


// Parent class for constructor
class Organization {

    Organization() {
        System.out.println("Organization Constructor");
    }
}


// Child class for constructor
class Staff extends Organization {

    Staff() {

        // Calls parent constructor
        super();

        System.out.println("Staff Constructor");
    }
}