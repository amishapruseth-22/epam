package com.epam.campus.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.campus.dto.DesignationDTO;
import com.epam.campus.entity.Department;
import com.epam.campus.entity.Designation;
import com.epam.campus.mapper.DesignationMapper;
import com.epam.campus.repository.DesignationRepository;
import com.epam.campus.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {
	
	@Autowired
	private DesignationRepository designationRepository;
	
	@Autowired
	private DesignationMapper designationMapper;

	@Override
	public DesignationDTO saveDesignation(DesignationDTO designationDTO) {
		Designation designation=designationMapper.toEntity(designationDTO);
		Designation savedDesignation=designationRepository.save(designation);
		return designationMapper.toDTO(savedDesignation) ;
	}

	private double assignSalary(String designation, String level) {
		 if (designation.equals("Developer")){
	            switch (level){
	                case "junior":return 30000;
	                case "senior":return 60000;
	            }
	        } else if (designation.equals("HR")) {
	            switch (level){
	                case "junior":return 40000;
	                case "senior":return 70000;
	            }
	        }
		return 0;
	}

	@Override
	public List<DesignationDTO> getAllDesignations() {
		List<Designation> designations=designationRepository.findAll();
		return designationMapper.toDTOList(designations);
	}

	@Override
	public DesignationDTO getDesignationById(int id) {
		return designationRepository.findById(id)
				.map(designationMapper::toDTO)
				.orElse(new DesignationDTO());
	}

	@Override
	public void deleteDesignation(int id) {
		designationRepository.deleteById(id);
		
	}

}
