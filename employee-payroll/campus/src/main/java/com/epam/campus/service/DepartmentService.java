package com.epam.campus.service;

import java.util.List;
import java.util.Optional;

import com.epam.campus.dto.DepartmentDTO;
import com.epam.campus.entity.Department;

public interface DepartmentService {
	DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);
	List<DepartmentDTO> getAllDepartments();
	DepartmentDTO getDepartmentById(int id);
	void deleteDepartment(int id);

}
