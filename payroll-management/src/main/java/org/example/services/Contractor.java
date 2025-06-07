package org.example.services;

public class Contractor extends EmploymentType implements Payable{
    double hourlyRate;
    public Contractor(String employeeName, int workHours,double hourlyRate) {
        super(employeeName, workHours);
        this.hourlyRate=hourlyRate;
    }

    @Override
    public int calculateWorkHours() {
       return getWorkHours();
    }

    @Override
    public double calculatePay() {
        if (hourlyRate<0){
            throw new IllegalArgumentException("hourly rate can't be negative");
        }
        double payment=hourlyRate*getWorkHours();
        return payment;

    }
}
