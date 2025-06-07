package com.epam.campus.entity;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="employees")
public class Employee {
	@Column(name="name",nullable=false)
    private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column(name="email",nullable = false)
    private String email;
	@Column(name="date_of_joining",nullable = false)
	@Temporal(TemporalType.DATE)
    private Date dateOfJoining =new Date();
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="department_id")
	private Department department;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="designation_id")
    private Designation designation;
    @Column(name="performance_grade",nullable = false)
    private String performanceGrade;
    @Column(name="salary",nullable = false)
    private double salary;
    @Column(name="bonus",nullable = false)
    private double bonus;
    
    public Employee() {
		super();
	}

	public Employee(String name, int id, Department department, Designation designation,Date dateOfJoining,String performanceGrade) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining=dateOfJoining;
        this.performanceGrade=performanceGrade;
        this.salary=designation.getBaseSalary();
        this.bonus=0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Designation getDesignation() {
        return designation;
    }
    
    public void setSalary(double salary) {
    	this.salary=salary;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
        this.salary= designation.getBaseSalary();
    }

    public String getPerformanceGrade() {
        return performanceGrade;
    }

    public void setPerformanceGrade(String performanceGrade) {
        this.performanceGrade = performanceGrade;
        this.bonus=calculateBonus();
    }

    public double getSalary() {
        return salary;
    }



    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double calculateBonus(){
        if (performanceGrade.equals("A"))
            return salary*0.50;
        else if (performanceGrade.equals("B"))
            return salary*0.20;
        else
            return salary*0.10;

    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", department=" + department +
                ", designation=" + designation +
                ", performanceGrade=" + performanceGrade +
                ", salary=" + salary +
                ", bonus=" +bonus+'}';
    }

   


}
