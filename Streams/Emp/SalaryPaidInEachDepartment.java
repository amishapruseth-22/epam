package Streams.Emp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryPaidInEachDepartment {
    public static Map<String,Double> getSalaryByDepartment(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
    }
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(1,8000,"HR"),
                new Employee(2,10000,"IT"),
                new Employee(3,20000,"Finance"),
                new Employee(4,10000,"IT"),
                new Employee(5,20000,"Finance"));
        System.out.println(getSalaryByDepartment(employees));
    }
}
