package com.epam.campus.dto;

import com.epam.campus.entity.Employee;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class EmployeeDTO {
	
	@NotBlank(message="Name cannot be null")
	private String name;
	@NotNull(message="Department id cannot be null")
	private int departmentId;
	@NotNull(message="Designation id cannot be null")
	private int designationId;
	@Email(message="Invalid message format")
	@NotBlank(message="Email cannot be null")
	private String email;
	@NotBlank(message="Performance grade cannot be null")
	private String performanceGrade;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPerformanceGrade() {
		return performanceGrade;
	}
	public void setPerformanceGrade(String performanceGrade) {
		this.performanceGrade = performanceGrade;
	}
	
	
	

}
