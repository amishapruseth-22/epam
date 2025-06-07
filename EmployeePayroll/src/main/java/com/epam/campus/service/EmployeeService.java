package com.epam.campus.service;


import com.epam.campus.entity.Department;
import com.epam.campus.entity.Designation;
import com.epam.campus.entity.Employee;
import com.epam.campus.repository.EmployeeDatabase;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
     Scanner scanner=new Scanner(System.in);
     private static int employeeIdCounter=1;


    public void createEmployee() {
        int id=employeeIdCounter++;

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        Department department = new Department(deptName);

        System.out.print("Enter designation title: ");
        String title = scanner.nextLine();

        System.out.print("Enter designation level (e.g., Junior, Senior): ");
        String level = scanner.nextLine();
        Designation designation = new Designation(title, level);

        System.out.print("Enter performance grade (A/B/C): ");
        String performanceGrade = scanner.nextLine();

        Date dateOfJoining=new Date();

        Employee employee = new Employee(name, id, department, designation,dateOfJoining, performanceGrade);
        employee.setEmail(email);
        EmployeeDatabase.addEmployee(employee);
        System.out.println("Employee added successfully!");
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonus());
    }

    public void displayEmployees() {
        List<Employee> employees = EmployeeDatabase.getEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            employees.forEach(System.out::println);

        }
    }

    public void updatePerformanceGrade() {
        System.out.print("Enter Employee ID to update performance grade: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new performance grade (A/B/C): ");
        String newGrade = scanner.nextLine();

        EmployeeDatabase.updatePerformanceGrade(id, newGrade);
        System.out.println("Performance grade updated successfully.");
    }

    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        EmployeeDatabase.removeEmployee(id);
        System.out.println("Employee deleted successfully.");
    }
}
