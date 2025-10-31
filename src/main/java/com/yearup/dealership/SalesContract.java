package com.yearup.dealership;

import java.time.LocalDate;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean isFinanced;
    private double monthlyPayment;

    public SalesContract(LocalDate contractDate, String customerName, String customerEmail,
                         Vehicle vehicleSold, boolean isFinanced) {
        super(contractDate, customerName, customerEmail, vehicleSold);

        this.isFinanced = isFinanced;

        double price = vehicleSold.getPrice();
        this.salesTaxAmount = price * 0.05;
        this.processingFee = (price < 10000) ? 295 : 495;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        this.isFinanced = isFinanced;
    }



    @Override
    public double getMonthlyPayment() {
        if (!isFinanced) {
            return 0;
        }
        double totalPrice = getTotalPrice();
        double annualRate;
        int months;

        if (totalPrice >= 10000) {
            annualRate = 0.0425;
            months = 48;

        }else{
            annualRate = 0.0525;
            months = 24;
        }

        double monthlyRate = annualRate / 12.0;
        double monthlyPayment = (totalPrice * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
        return monthlyPayment;
    }

    @Override
    public double getTotalPrice() {
        double price = getVehicleSold().getPrice();
        return price + salesTaxAmount + recordingFee + processingFee;

    }
//
//    public double getTotalPrice(){
//        double price = getVehicleSold().getPrice();
//        double salesTax = price * salesTaxAmount;
//        double processingFee = getProcessingFee();
//
//        return price + salesTaxAmount + recordingFee + processingFee;
//
//
//    }
//



    }




