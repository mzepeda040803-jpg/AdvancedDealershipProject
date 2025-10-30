package com.yearup.dealership;

public class UserInterface {
    private Dealership dealership;

    public void display(){
        System.out.println("Dealership App");



        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();


        // Print all vehicles in the inventory
        System.out.println("Inventory for " + dealership.getAllVehicles().size() + " vehicles ");
        System.out.println("Dealership Inventory:\n");

        for (Vehicle vehicle : dealership.getAllVehicles()) {
            System.out.println(vehicle);
            System.out.println("---------------------------");
        }

    }





}