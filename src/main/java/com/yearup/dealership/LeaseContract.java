package com.yearup.dealership;

import java.time.LocalDate;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leasingFee;


    public LeaseContract(LocalDate contractDate, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(contractDate, customerName, customerEmail, vehicleSold);

        this.expectedEndingValue = vehicleSold.getPrice() * 0.50;
        this.leasingFee = vehicleSold.getPrice() * 0.07;
    }

//    public double getExpectedEndingValue() {
//        return expectedEndingValue;
//    }
//
//    public void setExpectedEndingValue(double expectedEndingValue) {
//        this.expectedEndingValue = expectedEndingValue;
//    }
//
//    public double getLeasingFee() {
//        return leasingFee;
//    }
//
//    public void setLeasingFee(double leasingFee) {
//        this.leasingFee = leasingFee;
//    }

    public double getTotalPrice(){
        double price = getVehicleSold().getPrice();
        return getVehicleSold().getPrice() + leasingFee;
    }

    public double getMonthlyPayment(){
        double depreciation = getVehicleSold().getPrice() - expectedEndingValue;
        double totalLeaseCost = depreciation + leasingFee;
        int months = 36;
        return totalLeaseCost / months;

    }

    @Override
    public String toString() {
        return "LeaseContract{" +
                "Total Price=" + String.format("%.2f", getTotalPrice()) +
                ", Monthly Payment=" + String.format("%.2f", getMonthlyPayment()) +
                '}';
    }
}
