package Streams.EmployeeTasjk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static List<Employee> sortEmployees(List<Employee> employees) {
        return employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)).toList();

    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice","HR",32 , 50000),
            new Employee("Bob", "IT", 25,60000),
            new Employee("Charlie", "IT", 19,55000),
            new Employee("David", "HR", 30,52000)
        );

        List<Employee> sortedEmployees = sortEmployees(employees);
        sortedEmployees.forEach(System.out::println);
    }
}
