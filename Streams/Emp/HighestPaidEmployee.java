package Streams.Emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestPaidEmployee {
    public static Optional<Employee> getHighestPaidEmployee(List<Employee> employees){
        return  employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
    }
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(1,8000,"HR"),
                new Employee(2,10000,"IT"),
                new Employee(3,20000,"Finance"));
        System.out.println(getHighestPaidEmployee(employees));
    }
}
