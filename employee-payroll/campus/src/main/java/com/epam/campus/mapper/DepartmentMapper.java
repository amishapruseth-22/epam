package com.epam.campus.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.epam.campus.dto.DepartmentDTO;
import com.epam.campus.entity.Department;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
	Department toEntity(DepartmentDTO departmentDTO);
	DepartmentDTO toDTO(Department department);
	List<DepartmentDTO> toDTOList(List<Department> departments);


}
