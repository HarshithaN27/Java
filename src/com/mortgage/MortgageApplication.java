package com.mortgage;
public class MortgageApplication {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("     MORTGAGE LOAN APPLICATION");
        System.out.println("======================================");

        // Customer
        Customer customer = new Customer(
                101,
                "Harshitha",
                "harshitha@gmail.com",
                "9876543210"
        );

        // Address
        Address address = new Address(
                "12",
                "OMR Road",
                "Chennai",
                "600096"
        );

        // Employment
        Employment employment = new Employment(
                "ABC Technologies",
                "Software Developer",
                800000
        );

        // Property
        Property property = new Property(
                "P101",
                "Residential",
                5000000,
                address
        );

        // Loan Application
        LoanApplication application = new LoanApplication(
                1001,
                customer,
                employment,
                property,
                3000000
        );

        // Display customer
        System.out.println("\n--- CUSTOMER DETAILS ---");
        customer.displayCustomerDetails();

        // Employment verification
        System.out.println("\n--- EMPLOYMENT VERIFICATION ---");
        employment.verifyIncome();

        // Property verification
        System.out.println("\n--- PROPERTY VERIFICATION ---");
        property.verifyProperty();

        // Application
        System.out.println("\n--- LOAN APPLICATION ---");
        application.displayApplication();

        // Mortgage service
        MortgageService service = new MortgageService();

        System.out.println("\n--- CREDIT CHECK ---");
        service.checkCreditScore(750);

        System.out.println("\n--- ELIGIBILITY CHECK ---");

        if (service.checkEligibility(application)) {

            System.out.println("Eligibility : Approved");

            // Polymorphism
            Loan loan = new HomeLoan(
                    application.getRequestedAmount(),
                    7.5
            );

            System.out.println("\n--- LOAN DETAILS ---");
            loan.displayLoanDetails();

            System.out.println(
                    "Interest Amount : ₹" +
                            loan.calculateInterest()
            );

            System.out.println(
                    "Monthly EMI : ₹" +
                            loan.calculateEMI(240)
            );

            System.out.println("\n--- LOAN PROCESSING ---");
            service.processLoan();

        } else {

            System.out.println("Eligibility : Rejected");
        }

        System.out.println("\n======================================");
        System.out.println("          PROCESS COMPLETED");
        System.out.println("======================================");
    }
}
