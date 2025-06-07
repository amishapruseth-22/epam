package org.example.services;

public abstract class EmploymentType {
    private String employeeName;
    private int workHours;

    public EmploymentType(String employeeName,int workHours) {
        this.employeeName = employeeName;
        this.workHours = workHours;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Work Hours: " + workHours);
    }

    public abstract int  calculateWorkHours();
}
