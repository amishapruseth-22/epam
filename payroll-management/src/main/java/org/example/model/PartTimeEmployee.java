package org.example.model;

import org.example.services.PayrollAdjustment;

public class PartTimeEmployee extends Employee{
    private  int hoursWorked;
    private double salary;
    private double bonus;
    public PartTimeEmployee(int employeeId, String name, String department, double baseSalary, int hoursWorked,double bonus,int overtimeHours) {
        super(employeeId, name, department, baseSalary,overtimeHours);
        this.hoursWorked=hoursWorked;
        this.bonus=bonus;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    @PayrollAdjustment(taxRate = 0.10 ,overtimeRate = 1.5)
    public void calculateSalary() {
        if(getBaseSalary()<0 || hoursWorked<0){
            throw new IllegalArgumentException("Salary and hours worked can't be negative");
        }
        salary=getBaseSalary()*hoursWorked;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus<0){
            throw new IllegalArgumentException("Bonus can't be non-negative");
        }
        this.bonus = bonus;
    }

    @Override
    public void printSalary(){
        printDetails();
        calculateSalary();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Part-Time Employee Salary: $" + salary);
        System.out.println("Bonus: "+getBonus());
    }
}
