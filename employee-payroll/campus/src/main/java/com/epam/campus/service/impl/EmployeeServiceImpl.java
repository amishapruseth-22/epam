package com.epam.campus.service.impl;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.campus.dto.EmployeeDTO;
import com.epam.campus.dto.PayrollDTO;
import com.epam.campus.entity.Department;
import com.epam.campus.entity.Designation;
import com.epam.campus.entity.Employee;
import com.epam.campus.entity.Payroll;
import com.epam.campus.mapper.EmployeeMapper;
import com.epam.campus.mapper.PayrollMapper;
import com.epam.campus.repository.DepartmentRepository;
import com.epam.campus.repository.DesignationRepository;
import com.epam.campus.repository.EmployeeRepository;
import com.epam.campus.repository.PayrollRepository;
import com.epam.campus.service.EmployeeService;
import com.epam.campus.service.PayrollService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private DesignationRepository designationRepository;
	
	@Autowired
	private PayrollService payrollService;
	
	@Autowired
	private PayrollRepository payrollRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private PayrollMapper payrollMapper;

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
		Employee employee=employeeMapper.toEntity(employeeDTO);
		Department department = departmentRepository.findById(employeeDTO.getDepartmentId())
	            .orElseThrow(() -> new RuntimeException("Department not found with ID: " + employeeDTO.getDepartmentId()));

	    Designation designation = designationRepository.findById(employeeDTO.getDesignationId())
	            .orElseThrow(() -> new RuntimeException("Designation not found with ID: " + employeeDTO.getDesignationId()));
	    logger.info("Saving Employee with Salary:{} " , employee.getSalary());

		Employee savedEmployee=employeeRepository.save(employee);
		EmployeeDTO savedEmployeeDTO=employeeMapper.toDTO(savedEmployee);
		PayrollDTO payroll=payrollService.calculateSalary(savedEmployeeDTO);
		
		payrollRepository.save(payrollMapper.toEntity(payroll));
		return savedEmployeeDTO;
	}

	private String generateEmail(String name) {
		return name.toLowerCase().replace(" ", ".")+"@org.com";
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		List<Employee> employees=employeeRepository.findAll();
		return employeeMapper.toDTOList(employees);
	}

	@Override
	public EmployeeDTO getEmployeebyId(int id) {
		return employeeRepository.findById(id)
				.map(employeeMapper::toDTO)
				.orElse(new EmployeeDTO());
	}

	@Override
	public EmployeeDTO updatePerformanceGrade(int id, String newperformanceGrade) {
		Optional<Employee> optionalEmployee=employeeRepository.findById(id);
		if(optionalEmployee.isPresent()) {
			Employee employee=optionalEmployee.get();
			employee.setPerformanceGrade(newperformanceGrade);
			EmployeeDTO employeeDTO=employeeMapper.toDTO(employee);
            PayrollDTO payroll=payrollService.calculateSalary(employeeDTO);
			employee.setBonus(payroll.getBonus());
			Employee savedEmployee= employeeRepository.save(employee);
			return employeeMapper.toDTO(savedEmployee);
			
		}
		else {
			throw new RuntimeException("Employee with "+id+" not found");
		}
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
	}

}
