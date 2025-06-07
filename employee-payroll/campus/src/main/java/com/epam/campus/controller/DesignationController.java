package com.epam.campus.controller;


import com.epam.campus.dto.DesignationDTO;
import com.epam.campus.entity.Designation;
import com.epam.campus.mapper.DesignationMapper;
import com.epam.campus.service.DesignationService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/designations")
public class DesignationController {
    
	@Autowired
	private DesignationService designationService;
    @Autowired
    private DesignationMapper designationMapper;

    @GetMapping
    public  ResponseEntity<List<DesignationDTO>> getAllDesignations() {
        return ResponseEntity.ok(designationService.getAllDesignations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DesignationDTO> getDesignationById(@PathVariable int id) {
        return ResponseEntity.ok(designationService.getDesignationById(id))             ;
    }

    @PostMapping
    public  ResponseEntity<DesignationDTO> addDesignation(@Valid @RequestBody DesignationDTO designation) {
        return ResponseEntity.ok(designationService.saveDesignation(designation));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDesignation(@PathVariable int id) {
        designationService.deleteDesignation(id);
        return ResponseEntity.ok("Designation deleted successfully!");
    }
}
