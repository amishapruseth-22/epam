package com.epam.campus.controller;


import com.epam.campus.dto.DepartmentDTO;
import com.epam.campus.entity.Department;
import com.epam.campus.mapper.DepartmentMapper;
import com.epam.campus.service.DepartmentService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentMapper departmentMapper;

   
    @GetMapping
    public  ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
		return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable int id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

   
    @PostMapping
    public  ResponseEntity<DepartmentDTO> addDepartment(@Valid @RequestBody DepartmentDTO department) {
        return ResponseEntity.ok(departmentService.saveDepartment(department));
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
        return ResponseEntity.ok("Department deleted successfully!");
    }
}
