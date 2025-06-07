package Streams.Emp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeWithSalaryGreaterThanGivenAmt {
    public static List<Employee> getEmployeeWithSalaryGreaterThanGivenAmount(List<Employee> employees,double amount){
        return employees.stream().filter(e->e.getSalary()>amount).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(1,8000,"HR"),
                new Employee(2,10000,"IT"),
                new Employee(3,20000,"Finance"),
                new Employee(4,10000,"IT"),
                new Employee(5,20000,"Finance"));
        double amount=9000;
        System.out.println(getEmployeeWithSalaryGreaterThanGivenAmount(employees,amount));
    }
}
