package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employeeee{
    private String name;
    private double salary;
    private String department;

    public Employeeee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
public class MaxSalary {
    public static Map<String, Optional<Employeeee>> getHighestSalary(List<Employeeee> employeeees){
        return employeeees.stream().collect(Collectors.groupingBy(Employeeee::getDepartment,Collectors.maxBy(Comparator.comparing(Employeeee::getSalary))));
    }
}
