package com.yearup.dealership;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);

    public void display(){

        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();

        Dealership dealership = new Dealership(
                "Vroom Vroom Motors",
                "666 Arches Cir",
                "666-666-6666"
        );

        dealership.addVehicle(new Vehicle(1001, 2020, "Toyota", "Camry", "Sedan", "Silver", 32000, 18995.00));
        dealership.addVehicle(new Vehicle(1002, 2019, "Honda", "Civic", "Sedan", "Blue", 45000, 15995.00));
        dealership.addVehicle(new Vehicle(1003, 2021, "Ford", "F-150", "Truck", "Red", 25000, 29995.00));
        dealership.addVehicle(new Vehicle(1004, 2018, "Chevrolet", "Equinox", "SUV", "White", 60000, 17495.00));
        dealership.addVehicle(new Vehicle(1005, 2022, "Tesla", "Model 3", "Sedan", "Black", 12000, 35995.00));
        dealership.addVehicle(new Vehicle(1006, 2017, "Subaru", "Outback", "Wagon", "Green", 78000, 13995.00));
        dealership.addVehicle(new Vehicle(1007, 2020, "Jeep", "Wrangler", "SUV", "Orange", 31000, 28995.00));
        dealership.addVehicle(new Vehicle(1008, 2019, "BMW", "X5", "SUV", "Gray", 50000, 33995.00));
        dealership.addVehicle(new Vehicle(1009, 2021, "Hyundai", "Elantra", "Sedan", "White", 18000, 17995.00));
        dealership.addVehicle(new Vehicle(1010, 2018, "Nissan", "Altima", "Sedan", "Blue", 67000, 13995.00));



        // Print all vehicles in the inventory
        System.out.println("Inventory for " + dealership.getAllVehicles().size() + " vehicles ");
        System.out.println("Dealership Inventory:\n");

        for (Vehicle vehicle : dealership.getAllVehicles()) {
            System.out.println(vehicle);
            System.out.println("---------------------------");
        }

        System.out.println("""
                1. Find vehicles within a price range
                2. Find vehicles by make/model
                3. Find vehicles by year range
                4. Find vehicles by color
                5. Find vehicles by mileage range
                6. Find vehicles by Type(car, truck, SUV, van
                7. List all vehicles
                8. Add a vehicle
                9. Remove a vehicle
                10. Quit Program
                """);
        boolean running = true;

        while (running) {
            display();
            System.out.println("Enter Choice: ");
            String choice = scanner.nextLine().trim().toLowerCase();
            try {
                switch (choice) {
                    case "1":

                }
            }
        }


    }






}