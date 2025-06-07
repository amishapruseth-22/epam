package Streams.EmployeeTasjk;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageOfIT {
    public static Map<String,Double> getAverageSalaryOfIT(List<Employee1> employees){
        return employees.stream().filter(e->e.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.averagingDouble(Employee1::getSalary)));
    }

    public static void main(String[] args) {

    }

}
