package com.epam.campus.service;

import java.util.List;

import com.epam.campus.dto.EmployeeDTO;
import com.epam.campus.dto.PayrollDTO;
import com.epam.campus.entity.Employee;
import com.epam.campus.entity.Payroll;

public interface PayrollService {
	PayrollDTO calculateSalary(EmployeeDTO employeeDTO);
	List<PayrollDTO> getAllPayrolls();

}
