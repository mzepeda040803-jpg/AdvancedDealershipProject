package com.yearup.dealership;

public class SalesContract {
    private double salesTaxAmount;
    private double recordingFee;
    private boolean isFinanced;

    public SalesContract(double salesTaxAmount, double recordingFee, boolean isFinanced) {
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.isFinanced = isFinanced;
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

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public double getProcessingFee(){

    }

    public double getTotalPrice(){

    }

    public double getMonthlyPayment(){

    }



}
