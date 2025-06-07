package Streams.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageofGender {
    public static double getAverage(List<Employee> employees){

        return employees.stream().collect(Collectors.averagingDouble(Employee::getAge));
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("ABC",3,"F","CSE"),
                new Employee("DEF",38,"M","IT"));
        System.out.println(getAverage(employees));
    }

}
