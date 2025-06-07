package com.epam.campus.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.epam.campus.dto.PayrollDTO;
import com.epam.campus.entity.Payroll;
@Mapper(componentModel = "spring")
public interface PayrollMapper {
	Payroll toEntity(PayrollDTO payrollDTO);
	PayrollDTO toDTO(Payroll payroll);
	List<PayrollDTO> toDTOList(List<Payroll> payrolls);


}
