package com.epam.campus.mapper;

import com.epam.campus.dto.DesignationDTO;
import com.epam.campus.entity.Designation;
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
public class DesignationMapperImpl implements DesignationMapper {

    @Override
    public Designation toEntity(DesignationDTO designationDTO) {
        if ( designationDTO == null ) {
            return null;
        }

        Designation designation = new Designation();

        designation.setId( designationDTO.getId() );
        designation.setBaseSalary( designationDTO.getBaseSalary() );

        return designation;
    }

    @Override
    public DesignationDTO toDTO(Designation designation) {
        if ( designation == null ) {
            return null;
        }

        DesignationDTO designationDTO = new DesignationDTO();

        designationDTO.setId( designation.getId() );
        designationDTO.setLevel( designation.getLevel() );
        designationDTO.setBaseSalary( designation.getBaseSalary() );

        return designationDTO;
    }

    @Override
    public List<DesignationDTO> toDTOList(List<Designation> designations) {
        if ( designations == null ) {
            return null;
        }

        List<DesignationDTO> list = new ArrayList<DesignationDTO>( designations.size() );
        for ( Designation designation : designations ) {
            list.add( toDTO( designation ) );
        }

        return list;
    }
}
