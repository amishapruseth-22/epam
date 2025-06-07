package Streams.Emp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByEachDepartment {
    public static Map<String,Double> getAverageSalary(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(1,8000,"HR"),
                new Employee(2,10000,"IT"),
                new Employee(3,20000,"Finance")
                ,new Employee(4,30000,"Finance"));
        System.out.println(getAverageSalary(employees));
    }
}
