package org.example.model;

import org.example.services.PayrollAdjustment;

public class FullTimeEmployee extends Employee{
    private double annualBonus;
    private double totalSalary;
    public FullTimeEmployee(int employeeId, String name, String department, double baseSalary,double annualBonus,int overtimeHours) {
        super(employeeId, name, department, baseSalary,overtimeHours);
        this.annualBonus=annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        if (annualBonus<0){
            throw new IllegalArgumentException("Annual bonus can't be non-negative");
        }
        this.annualBonus = annualBonus;
    }
    @Override
    public void printSalary(){
        printDetails();
        calculateSalary();
        System.out.println("Annual Bonus: $" + annualBonus);
        System.out.println("Full-Time Employee Total Salary: $" + totalSalary);
    }

    @Override
    @PayrollAdjustment(taxRate = 0.12 ,overtimeRate = 1.8)
    public void calculateSalary() {
        if (getBaseSalary()<0 || annualBonus<0){
            throw new IllegalArgumentException("Salary and bonus can't be negative");
        }
        totalSalary=(getBaseSalary()*12)+annualBonus;
    }
}
