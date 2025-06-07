package Streams.Emp;

public class Employee {
    private int id;
    private double salary;
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int id, double salary, String department){
        this.id=id;
        this.salary=salary;
        this.department=department;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public  double getSalary(){
        return salary;
    }
    public String toString(){
        return "Employee[Id="+id+"Salary="+salary+"]";
    }
}
