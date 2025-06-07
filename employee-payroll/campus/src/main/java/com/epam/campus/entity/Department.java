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
@Table(name="departments")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="department_name" , nullable = false,unique = true)
    private String departmentName;
	
	@OneToMany(mappedBy = "department" , cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	private List<Employee> employees;
	
	public Department() {
		super();
	}


	public Department(String departmentName) {

        this.departmentName=departmentName;

    }
	
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartment(String departmentName) {
        this.departmentName = departmentName;
    }


	@Override
	public String toString() {
		return "Department [id=" + id + ", department=" + departmentName + ", employees=" + employees + "]";
	}

    
}
