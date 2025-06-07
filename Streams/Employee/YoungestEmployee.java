package Streams.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestEmployee {
    public static Optional<Employee> getYoungestEmployee(List<Employee> employees){
        return employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT")).min(Comparator.comparing(Employee::getAge));
    }
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("ABC",3,"F","CSE"),
                new Employee("DEF",38,"M","IT")
                        ,new Employee("Dkij",28,"M","IT"));
        System.out.println(getYoungestEmployee(employees));
    }
}
