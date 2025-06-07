package com.epam.campus.controller;

import com.epam.campus.dto.EmployeeDTO;
import com.epam.campus.dto.PayrollDTO;
import com.epam.campus.entity.Employee;
import com.epam.campus.entity.Payroll;
import com.epam.campus.mapper.PayrollMapper;
import com.epam.campus.service.PayrollService;
import com.epam.campus.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payrolls")
public class PayrollController {
    @Autowired
    private PayrollService payrollService;
    
    @Autowired
    private PayrollMapper payrollMapper;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<PayrollDTO>> getAllPayrolls(){
    	return ResponseEntity.ok(payrollService.getAllPayrolls());
    }
    
    @PostMapping("/process/{employeeId}")
    public  ResponseEntity<PayrollDTO> processPayroll(@PathVariable int employeeId) {
    	return ResponseEntity.ok(payrollService.calculateSalary(
    			employeeService.getEmployeebyId(employeeId)));
}
    
    
}

