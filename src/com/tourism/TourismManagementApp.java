package com.tourism;
public class TourismManagementApp {

    public static void main(String[] args) {

        // Creating tourists
        Tourist tourist1 = new Tourist();

        tourist1.setTouristId(101);
        tourist1.setTouristName("Harshitha");
        tourist1.setEmail("harshitha@gmail.com");
        tourist1.setPhone("9876543210");

        Tourist tourist2 = new Tourist(
                102,
                "" +
                        "padma",
                "padma@gmail.com",
                "9876501234"
        );

        // Display tourist details
        System.out.println("========================================");
        System.out.println("          DHILTOUR TRAVELS");
        System.out.println("========================================");

        System.out.println();
        System.out.println("Tourist Details");

        tourist1.displayTouristInformation();

        System.out.println();
        System.out.println("----------------------------------------");

        tourist2.displayTouristInformation();

        System.out.println();
        System.out.println("----------------------------------------");

        // Creating tourism packages using parent-class reference

        TourismPackage package1 = new DomesticTourism(
                "TP101",
                "Goa",
                5,
                2,
                40000
        );

        TourismPackage package2 = new InternationalTourism(
                "TP102",
                "Paris",
                7,
                2,
                100000
        );

        TourismPackage package3 = new AdventureTourism(
                "TP103",
                "Manali",
                6,
                3,
                60000
        );

        // Store packages in an array
        TourismPackage[] packages = {
                package1,
                package2,
                package3
        };

        // Display package details and final price
        for (TourismPackage tourismPackage : packages) {

            System.out.println();
            tourismPackage.displayPackageDetails();

            System.out.println("Final Price  : "
                    + tourismPackage.calculateFinalPrice());

            System.out.println("----------------------------------------");
        }
    }
}


