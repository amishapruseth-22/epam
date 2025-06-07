package com.epam.campus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.campus.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
