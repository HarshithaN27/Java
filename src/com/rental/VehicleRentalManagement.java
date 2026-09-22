package com.rental;
public class VehicleRentalManagement {

    public static void main(String[] args) {

        // Creating Address object
        Address address = new Address(
                25,
                "Main Street",
                "Chennai",
                "600001"
        );

        // Creating Customer object
        Customer customer = new Customer(
                "C101",
                "Harshitha",
                "9876543210",
                address
        );

        // Creating Car object
        Vehicle car = new Car(
                "TN-01-AB-1234",
                "Toyota",
                "Corolla",
                50,
                4
        );

        // Creating Bike object
        Vehicle bike = new Bike(
                "TN-02-CD-5678",
                "Honda",
                "Shine",
                30,
                true
        );

        // Creating Truck object
        Vehicle truck = new Truck(
                "TN-03-EF-9012",
                "Tata",
                "Ace",
                100,
                2
        );

        // Creating Rental
        Rental rental = new Rental(
                "R101",
                4,
                customer,
                car
        );

        // Display Rental Details
        rental.displayRentalDetails();
        System.out.println("\n========================================");
        System.out.println("          IS-A RELATIONSHIP");
        System.out.println("========================================");

        System.out.println("Car IS-A Vehicle   : " + (car instanceof Vehicle));
        System.out.println("Bike IS-A Vehicle  : " + (bike instanceof Vehicle));
        System.out.println("Truck IS-A Vehicle : " + (truck instanceof Vehicle));
        System.out.println("\n========================================");
        System.out.println("          HAS-A RELATIONSHIP");
        System.out.println("========================================");
        System.out.println("Customer HAS-A Address");
        System.out.println("Rental HAS-A Customer");
        System.out.println("Rental HAS-A Vehicle");
        System.out.println("\n========================================");
        System.out.println("             POLYMORPHISM");
        System.out.println("========================================");

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle vehicle : vehicles) {

            vehicle.displayVehicleDetails();

            System.out.println("----------------------------------------");
        }
    }
}

