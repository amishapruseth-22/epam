package com.epam.campus.repository;

import com.epam.campus.entity.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDatabase {
    private static Map<Integer, Employee> employees=new HashMap<>();
    private static int employeeIdCounter=1;
    public static void addEmployee(Employee employee){
        employee.setId(employeeIdCounter++);
        employees.put(employee.getId(), employee);
    }
    public static void removeEmployee(int id){
        employees.remove(id);
    }
    public static List<Employee> getEmployees(){
        return new ArrayList<>(employees.values());
    }
    public static void updatePerformanceGrade(int id, String newPerformanceGrade){
        Employee employee=employees.get(id);
        if (employee!=null) {
            employee.setPerformanceGrade(newPerformanceGrade);
            employee.setBonus();

        }
    }
}
