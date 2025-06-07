package com.epam.campus.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.epam.campus.dto.DesignationDTO;
import com.epam.campus.entity.Designation;

@Mapper(componentModel = "spring")
public interface DesignationMapper {
	Designation toEntity(DesignationDTO designationDTO);
	DesignationDTO toDTO(Designation designation);
	List<DesignationDTO> toDTOList(List<Designation> designations);


}
