package com.epam.campus.service;

import com.epam.campus.entity.Employee;

import java.util.List;

public class PayrollService {
    public void calculateSalary(List<Employee> employees){
        for (Employee employee:employees){
            double totalSalary=employee.getSalary()+employee.getBonus();
            System.out.println("Employee Name: "+employee.getName()+" "+"Salary: "+totalSalary);
        }
    }
}
