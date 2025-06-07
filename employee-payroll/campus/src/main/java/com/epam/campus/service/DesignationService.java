package com.epam.campus.service;

import java.util.List;
import java.util.Optional;

import com.epam.campus.dto.DesignationDTO;
import com.epam.campus.entity.Designation;

public interface DesignationService {
	DesignationDTO saveDesignation(DesignationDTO designationDTO);
	List<DesignationDTO> getAllDesignations();
	DesignationDTO getDesignationById(int id);
	void deleteDesignation(int id);

}
