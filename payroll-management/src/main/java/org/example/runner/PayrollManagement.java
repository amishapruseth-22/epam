package org.example.runner;

import org.example.model.Employee;
import org.example.model.FullTimeEmployee;
import org.example.model.PartTimeEmployee;
import org.example.project.EmployeeContract;
import org.example.project.FullTimeContract;
import org.example.project.PartTimeContract;
import org.example.services.Contractor;
import org.example.services.PayrollProcessor;
import org.example.services.PermanentEmployee;

import java.util.*;
import java.util.stream.Collectors;

public class PayrollManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new PartTimeEmployee(201, "Alice Brown", "HR", 20.0, 160,500.0,3));
        employees.add(new PartTimeEmployee(202, "David Lee", "Support", 25.0, 120,600.0,2));
        employees.add(new FullTimeEmployee(301, "Bob Smith", "Finance", 5000.0, 10000.0,2));
        employees.add(new FullTimeEmployee(302, "Emma Wilson", "Marketing", 4500.0, 8000.0,1));
        employees.add(new PartTimeEmployee(205, "Indigo", "HR", 40.0, 160,500.0,4));


        // Handling empty employee list case
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee employee:employees){
            employee.printSalary();

        }
        System.out.println();
        EmployeeContract partTimeEmployeeContract=new PartTimeContract("Alice",101);
        EmployeeContract fullTimeEmployeeContract=new FullTimeContract("Bob",105);
        partTimeEmployeeContract.displayDetails();
        partTimeEmployeeContract.defineWorkHours();
        partTimeEmployeeContract.assignProject();
        fullTimeEmployeeContract.displayDetails();
        fullTimeEmployeeContract.defineWorkHours();
        fullTimeEmployeeContract.assignProject();
        System.out.println();
        Contractor contractor = new Contractor("Alice", 40, 50.0);
        PermanentEmployee permanentEmployee = new PermanentEmployee("Bob", 40, 5000.0);

        System.out.println("Contractor Details:");
        contractor.displayEmployeeDetails();
        System.out.println("Pay: $" + contractor.calculatePay());

        System.out.println("\nPermanent Employee Details:");
        permanentEmployee.displayEmployeeDetails();
        System.out.println("Pay: $" + permanentEmployee.calculatePay());
        System.out.println();
        employees.stream().sorted().forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getBaseSalary).thenComparing(Employee::getName)).forEach(System.out::println);
        Map<String,List<Employee>> employeesByDepartment=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeesByDepartment);
        Map<String, Optional<Employee>> employeeWithHighestSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getBaseSalary))));
        employeeWithHighestSalary.forEach((dept,emp)-> System.out.println(dept+" -> "+emp.orElse(null)));
        for (Employee employee:employees) {
            PayrollProcessor.processPayroll(employee);
            System.out.println(employee.getName()+" "+employee.getFinalSalary());
        }



    }
}
