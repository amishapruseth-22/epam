package org.example.services;

public class PermanentEmployee extends EmploymentType implements Payable{
    private double monthlySalary;
    public PermanentEmployee(String employeeName, int workHours,double monthlySalary) {
        super(employeeName, workHours);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public int calculateWorkHours() {
       return getWorkHours();
    }

    @Override
    public double calculatePay() {
        if (monthlySalary<0){
            throw new IllegalArgumentException("Salary can't be negative");
        }
        double payment=monthlySalary*12;
        return payment;
    }
}
