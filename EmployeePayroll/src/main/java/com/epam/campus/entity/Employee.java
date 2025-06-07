package com.epam.campus.entity;

import java.util.Date;

public class Employee {
    private String name;
    private int id;
    private String email;
    private Date dateOfJoining;
    private Department department;
    private Designation designation;
    private String performanceGrade;
    private double salary;
    private double bonus;

    public Employee(String name, int id, Department department, Designation designation,Date dateOfJoining,String performanceGrade) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining=dateOfJoining;
        this.performanceGrade=performanceGrade;
        this.salary=designation.getBaseSalary();
        this.bonus=calculateBonus();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Designation getDesignation() {
        return designation;
    }
    public void setSalary() {
        this.salary = designation.getBaseSalary();

    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
        this.salary= designation.getBaseSalary();
        this.bonus=calculateBonus();
    }

    public String getPerformanceGrade() {
        return performanceGrade;
    }

    public void setPerformanceGrade(String performanceGrade) {
        this.performanceGrade = performanceGrade;
        this.bonus=calculateBonus();
    }

    public double getSalary() {
        return salary;
    }



    public double getBonus() {
        return bonus;
    }

    public void setBonus() {
        this.bonus = calculateBonus();
    }
    public double calculateBonus(){
        if (performanceGrade.equals("A"))
            return salary*0.50;
        else if (performanceGrade.equals("B"))
            return salary*0.20;
        else
            return salary*0.10;

    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", department=" + department +
                ", designation=" + designation +
                ", performanceGrade=" + performanceGrade +
                ", salary=" + salary +
                ", bonus=" +bonus+'}';
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID:  "+id);
        System.out.println("Email: "+email);
        System.out.println("Date of Joining: "+dateOfJoining);
        System.out.println("Department: "+department);
        System.out.println("Designation: "+designation);
        System.out.println("Performance Grade: "+performanceGrade);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);

    }


}
