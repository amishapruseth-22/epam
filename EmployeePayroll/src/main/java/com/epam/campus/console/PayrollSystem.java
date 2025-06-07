package com.epam.campus.console;

import com.epam.campus.entity.Department;
import com.epam.campus.entity.Designation;
import com.epam.campus.entity.Employee;
import com.epam.campus.repository.EmployeeDatabase;
import com.epam.campus.service.PayrollService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        PayrollService payrollService = new PayrollService();

        while (true) {
            System.out.println("\nEmployee Payroll System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Calculate Payroll");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int employeeIdCounter=1;
                    int id=employeeIdCounter++;
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Department Name: ");
                    String deptName = scanner.nextLine();
                    Department department = new Department(deptName);

                    System.out.print("Enter Designation: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Level (junior/senior): ");
                    String level = scanner.nextLine();
                    Designation designation = new Designation(title, level);

                    System.out.print("Enter Performance Grade (A/B/C): ");
                    String grade = scanner.nextLine();

                    Employee employee = new Employee(name, id, department, designation,new Date(), grade);
                    employeeDatabase.addEmployee(employee);
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nEmployee List:");
                    for (Employee emp : employeeDatabase.getEmployees()) {
                        System.out.println(emp);
                        emp.displayDetails();

                    }
                    break;

                case 3:
                    List<Employee> employees=employeeDatabase.getEmployees();
                    payrollService.calculateSalary(employees);
                    break;

                case 4:
                    System.out.println("Exiting Employee Payroll System...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
