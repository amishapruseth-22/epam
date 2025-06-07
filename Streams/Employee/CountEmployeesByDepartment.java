package Streams.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesByDepartment {
    public static Map<String,Long> countEmployeesByDepartment(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("ABC",3,"F","CSE"),
                new Employee("DEF",38,"M","IT"),
                new Employee("GHI",27,"M","CSE"));
        System.out.println(countEmployeesByDepartment(employees));
    }
}
