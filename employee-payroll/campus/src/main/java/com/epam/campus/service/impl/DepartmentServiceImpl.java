package com.epam.campus.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.campus.dto.DepartmentDTO;
import com.epam.campus.entity.Department;
import com.epam.campus.mapper.DepartmentMapper;
import com.epam.campus.repository.DepartmentRepository;
import com.epam.campus.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
     DepartmentMapper departmentMapper;

	@Override
	public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
		Department department=departmentMapper.toEntity(departmentDTO);
		Department savedDepartment=departmentRepository.save(department);
		return departmentMapper.toDTO(savedDepartment) ;
	}

	@Override
	public List<DepartmentDTO> getAllDepartments() {
		List<Department> departments=departmentRepository.findAll();
		return departmentMapper.toDTOList(departments);
	}

	@Override
	public DepartmentDTO getDepartmentById(int id) {
		return departmentRepository.findById(id)
				.map(departmentMapper::toDTO)
				.orElse(new DepartmentDTO());
	}

	@Override
	public void deleteDepartment(int id) {
         departmentRepository.deleteById(id);		
	}

}
