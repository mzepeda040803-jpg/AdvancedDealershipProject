package com.yearup.dealership;

import java.time.LocalDate;

public abstract class Contract {
    private LocalDate contractDate;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSold;
//    private double price;
//    private double monthlyPayment;

    public Contract(LocalDate contractDate, String customerName, String customerEmail, Vehicle vehicleSold) {
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
//        this.price = price;
//        this.monthlyPayment = monthlyPayment;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setMonthlyPayment(double monthlyPayment) {
//        this.monthlyPayment = monthlyPayment;
//    }

    public abstract double getMonthlyPayment();

    public abstract double getTotalPrice();

    @Override
    public String toString() {
        return "Contract{" +
                "contractDate=" + contractDate +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", vehicleSold='" + vehicleSold + '\'' +
                '}';
    }
}
