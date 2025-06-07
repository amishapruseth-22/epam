package com.epam.campus.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="designations")
public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="designation_name" , nullable = false)
    private String designation;
	
	@Column(name="base_salary",nullable = false)
    private double baseSalary;
	
	@Column(name="level")
    private String level;
	
	@OneToMany(mappedBy = "designation" , cascade =CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Employee> employees;
	
	

    public Designation() {
		super();
	}

	public Designation(String designation,String level,double baseSalary) {
        this.designation = designation;
        this.level=level;
        this.baseSalary=baseSalary;
    }

   
   
   

    public int getId() {
	return id;
   }

    public void setId(int id) {
	this.id = id;
    }

	public double getBaseSalary() {
        return baseSalary;
    }
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary=baseSalary;
	}

    public String getLevel() {
        return level;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Designation{" +
                " designation='" + designation + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}

