package SomeRecord;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MAin {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
         return employees.stream().collect(Collectors.groupingBy(Employee::department));

        }

    public static void main(String[] args) {

        List<Employee> employees= List.of(
            new Employee("Alice", "HR", new EmployeeRecord("Alice","HR")),
            new Employee("Bob", "IT", new EmployeeRecord("Bob","IT")),
            new Employee("Charlie", "Finance", new EmployeeRecord("Charlie","Finance")),
            new Employee("David", "IT", new EmployeeRecord("David","IT")));
        System.out.println(groupByDepartment(employees));
    }
}
