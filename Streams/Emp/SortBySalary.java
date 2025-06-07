package Streams.Emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBySalary {
    public static List<Employee> sortEmployeesBySalary(List<Employee> employees){
        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee(1,80000,"IT"),
                new Employee(2,50000,"HR")
        );
        System.out.println(sortEmployeesBySalary(employees));
    }
}
