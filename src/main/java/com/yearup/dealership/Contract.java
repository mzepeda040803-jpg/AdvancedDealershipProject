package com.yearup.dealership;

import java.time.LocalDate;

public abstract class Contract {
    private LocalDate contractDate;
    private String customerName;
    private String customerEmail;
    private String vehicleSold;
    private double price;
    private double monthlyPayment;

    public Contract(LocalDate contractDate, String customerName, String customerEmail, String vehicleSold) {
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
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

    public String getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public void getTotalPrice(){

    }

    public void getMonthlyPayment(){

    }

}
