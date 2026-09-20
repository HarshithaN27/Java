package com.rental;

public class Vehicle {

        // Encapsulation
        private String vehicleNumber;
        private String brand;
        private String model;
        private double rentPerDay;

        // Constructor
        public Vehicle(String vehicleNumber, String brand,
                       String model, double rentPerDay) {

            this.vehicleNumber = vehicleNumber;
            this.brand = brand;
            this.model = model;
            this.rentPerDay = rentPerDay;
        }

        // Getters
        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public double getRentPerDay() {
            return rentPerDay;
        }

        // Method
        public void displayVehicleDetails() {

            System.out.println("Vehicle No    : " + vehicleNumber);
            System.out.println("Brand         : " + brand);
            System.out.println("Model         : " + model);
            System.out.println("Rent Per Day  : €" + rentPerDay);
        }
    }


