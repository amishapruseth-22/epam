package Streams.EmployeeTasjk;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalaryOfEachDepartment {
    public static Map<String, Optional<Employee1>> maxSalaryOfDept(List<Employee1> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));
    }
}
