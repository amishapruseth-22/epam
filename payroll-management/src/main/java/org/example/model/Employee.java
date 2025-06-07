package org.example.model;

import java.util.List;

public abstract class Employee implements Comparable<Employee> {
    private int employeeId;
    private String name;
    private String department;
    private double baseSalary;
    private double bonus;
    private int overtimeHours;
    private double finalSalary;

    public Employee(int employeeId, String name, String department, double baseSalary,int overtimeHours) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        this.overtimeHours=overtimeHours;
        this.finalSalary=0.0;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<0){
            throw new IllegalArgumentException("Enter non-negative value ");
        }
        this.baseSalary=baseSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }
    public int getOvertimeHours() {
        return overtimeHours;
    }

    public int compareTo(Employee other){
        return Integer.compare(this.employeeId,other.employeeId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                '}';
    }

    public void printDetails(){
        System.out.println("EmployeeId: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);

    }
    public abstract void calculateSalary();

    public abstract void printSalary();


}
