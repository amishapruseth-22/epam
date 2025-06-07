package com.epam.campus.service;

import java.util.List;
import java.util.Optional;

import com.epam.campus.dto.EmployeeDTO;
import com.epam.campus.entity.Employee;

public interface EmployeeService {
	EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
	List<EmployeeDTO> getAllEmployees();
	EmployeeDTO getEmployeebyId(int id);
	EmployeeDTO updatePerformanceGrade(int id,String newperformanceGrade);
	void deleteEmployeeById(int id);

}
