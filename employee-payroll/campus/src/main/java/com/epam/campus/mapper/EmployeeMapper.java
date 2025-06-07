package com.epam.campus.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.epam.campus.dto.EmployeeDTO;
import com.epam.campus.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	Employee toEntity(EmployeeDTO employeeDTO);
	EmployeeDTO toDTO(Employee employee);
	List<EmployeeDTO> toDTOList(List<Employee> employees);

}
