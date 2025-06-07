package com.epam.campus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.campus.entity.Payroll;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Integer> {

}
