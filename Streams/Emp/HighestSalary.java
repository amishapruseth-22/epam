package Streams.Emp;

import java.util.Arrays;
import java.util.List;

public class HighestSalary {
    public static double getHighestSalary(List<Employee> employees){
        return employees.stream().mapToDouble(Employee::getSalary).max().orElse(0);
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(1,8000,"HR"),
                new Employee(2,10000,"IT"),
                new Employee(3,20000,"Finance"));
        System.out.println(getHighestSalary(employees));
    }
}
