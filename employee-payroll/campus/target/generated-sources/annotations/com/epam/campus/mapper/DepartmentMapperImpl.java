package com.epam.campus.mapper;

import com.epam.campus.dto.DepartmentDTO;
import com.epam.campus.entity.Department;
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
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public Department toEntity(DepartmentDTO departmentDTO) {
        if ( departmentDTO == null ) {
            return null;
        }

        Department department = new Department();

        return department;
    }

    @Override
    public DepartmentDTO toDTO(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentDTO departmentDTO = new DepartmentDTO();

        departmentDTO.setDepartmentName( department.getDepartmentName() );

        return departmentDTO;
    }

    @Override
    public List<DepartmentDTO> toDTOList(List<Department> departments) {
        if ( departments == null ) {
            return null;
        }

        List<DepartmentDTO> list = new ArrayList<DepartmentDTO>( departments.size() );
        for ( Department department : departments ) {
            list.add( toDTO( department ) );
        }

        return list;
    }
}
