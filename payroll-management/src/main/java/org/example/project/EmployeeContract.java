package org.example.project;

public abstract class EmployeeContract {
    private String name;
    private int employeeId;

    public EmployeeContract(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public abstract void defineWorkHours();
    public abstract void assignProject();
    public void displayDetails(){
        System.out.println(name+" : "+employeeId);
    }

}
