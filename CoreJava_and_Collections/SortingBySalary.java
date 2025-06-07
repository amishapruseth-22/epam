package CoreJava_and_Collections;

import Streams.Emp.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
    private int id;
    private String name;
    private double salary;
    public Employee1(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

public class SortingBySalary {
    public static List<Employee1> sortEmployeesBySalary(List<Employee1> employees){
//        return employees.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).collect(Collectors.toList());
        return employees.stream().sorted(Comparator.comparing(Employee1::getId).thenComparing(Employee1::getSalary)).toList();
    }

    public static void main(String[] args) {
        List<Employee1> employees= Arrays.asList(new Employee1(1,"ABC",70000),
                new Employee1(2,"DEF",80000));
        System.out.println(sortEmployeesBySalary(employees));
    }
}
