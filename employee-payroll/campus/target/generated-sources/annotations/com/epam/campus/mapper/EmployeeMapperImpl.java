package com.epam.campus.mapper;

import com.epam.campus.dto.EmployeeDTO;
import com.epam.campus.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-15T23:24:34+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20241112-0530, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setName( employeeDTO.getName() );
        employee.setEmail( employeeDTO.getEmail() );
        employee.setPerformanceGrade( employeeDTO.getPerformanceGrade() );

        return employee;
    }

    @Override
    public EmployeeDTO toDTO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setName( employee.getName() );
        employeeDTO.setEmail( employee.getEmail() );
        employeeDTO.setPerformanceGrade( employee.getPerformanceGrade() );

        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> toDTOList(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( toDTO( employee ) );
        }

        return list;
    }
}
