package Streams.Employee;

import java.util.Arrays;
import java.util.List;

public class DisplayDepartment {
    public static List<String> getDepartments(List<Employee> employees){
        return employees.stream().map(Employee::getDepartment).toList();
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("ABC",3,"F","CSE"),
                new Employee("DEF",38,"M","IT"));
        System.out.println(getDepartments(employees));
    }
}
