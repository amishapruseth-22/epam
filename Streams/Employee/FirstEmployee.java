package Streams.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEmployee {
    public static Optional<Employee> getEmployee(List<Employee> employees){
        return employees.stream().filter(e->e.getName().equals("ABC")).findFirst();
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("ABC",45,"F","IT"),
                new Employee("ABC",20,"M","Finanace"),
                new Employee("DEF",39,"M","T#W"));
        System.out.println(getEmployee(employees));
    }
}
