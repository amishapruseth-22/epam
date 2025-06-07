package Streams.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployees {
    public static Map<String,Long> countEmployees(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

    }

}
