package Streams;

import Streams.Emp.Employee;

import java.util.Arrays;
import java.util.List;

class Employeee{
    String name;
    int yearOfJoining;

    public Employeee(String name, int yearOfJoining) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
}
public class EmployeesAfter2015 {
    public static List<String> getEmployeeAfter2015(List<Employeee> employees){
        return employees.stream().filter(e->e.getYearOfJoining()>2015)
                .map(Employeee::getName).toList();
    }

    public static void main(String[] args) {
        List<Employeee> employeees= Arrays.asList(new Employeee("ABC",2014),
                new Employeee("DEF",2019),new Employeee("GHI",2017));
        System.out.println(getEmployeeAfter2015(employeees));
    }
}
