package com.epam.campus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.campus.dto.EmployeeDTO;
import com.epam.campus.dto.PayrollDTO;
import com.epam.campus.entity.Employee;
import com.epam.campus.entity.Payroll;
import com.epam.campus.mapper.EmployeeMapper;
import com.epam.campus.mapper.PayrollMapper;
import com.epam.campus.repository.PayrollRepository;
import com.epam.campus.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService{
	
	@Autowired
	private PayrollRepository payrollRepository;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	private PayrollMapper payrollMapper;

	@Override
	public PayrollDTO calculateSalary(EmployeeDTO employeeDTO) {
		Employee employee=employeeMapper.toEntity(employeeDTO);
		double salary=employee.getDesignation().getBaseSalary();
		double bonus=calculateBonus(employee.getPerformanceGrade(),salary);
		double totalPay=salary+bonus;
		
		Payroll payroll=new Payroll(employee,salary,bonus);
//		Payroll savedPayroll= payrollRepository.save(payroll);
		return payrollMapper.toDTO(payroll);
	}
	private double calculateBonus(String performanceGrade,double salary) {
		switch(performanceGrade) {
		case "A":return salary*0.50;
		case "B":return salary*0.20;
		default:return salary*0.10;
		}
	}
	@Override
	public List<PayrollDTO> getAllPayrolls() {
		List<Payroll> payrolls=payrollRepository.findAll();
		return payrollMapper.toDTOList(payrolls);
	}

}
