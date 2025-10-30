package com.yearup.dealership;

public class LeaseContract {
    private double expectedEndingValue;
    private double leasingFee;


    public LeaseContract(double expectedEndingValue, double leasingFee) {
        this.expectedEndingValue = expectedEndingValue;
        this.leasingFee = leasingFee;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeasingFee() {
        return leasingFee;
    }

    public void setLeasingFee(double leasingFee) {
        this.leasingFee = leasingFee;
    }

    public double getTotalPrice(){

    }

    public double getMonthlyPayment(){

    }
}
