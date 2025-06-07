package org.example.project;

import java.util.Scanner;

public class FullTimeContract extends EmployeeContract{

    public FullTimeContract(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void defineWorkHours() {
        System.out.println("10 hours for full time employee");
    }

    @Override
    public void assignProject() {
        System.out.println("Realtime projects are assigned");

    }
}
