package Streams.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderCount {
    public static Map<String,Long> countByGender(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    }

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>(Arrays.asList(new Employee("abc",40,"Female","CSE")
                ,new Employee("def",44,"Male","IT"),
                 new Employee("dhf",46,"Male","CSE"),
                new Employee("abuhi",39,"Female","IT")));
        System.out.println(countByGender(employees));
    }
}
