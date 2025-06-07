package Streams.Emp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Streams.Emp.HighestSalary.getHighestSalary;

public class EmployeeByDepartment {
    public static Map<String, List<Employee>> getEmployeesByDepartment(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(1,8000,"HR"),
                new Employee(2,10000,"IT"),
                new Employee(3,20000,"Finance"),
                new Employee(4,10000,"IT"),
                new Employee(5,20000,"Finance"));
        System.out.println(getEmployeesByDepartment(employees));
    }
}
