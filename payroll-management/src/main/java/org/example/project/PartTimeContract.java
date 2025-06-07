package org.example.project;

public class PartTimeContract extends EmployeeContract{
    public PartTimeContract(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void defineWorkHours() {
        System.out.println("8 hours for part time employees");
    }

    @Override
    public void assignProject() {
        System.out.println("not exactly real time projects but kind of it is assigned");
    }
}
