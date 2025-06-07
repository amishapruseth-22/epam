package Streams.EmployeeTasjk;

import SomeRecord.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesinIT {
    public static Map<String, Long> getEmployeesInIT(List<Employee1> employees){
        return employees.stream().filter(e->e.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
    }
}
