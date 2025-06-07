package com.epam.campus.mapper;

import com.epam.campus.dto.PayrollDTO;
import com.epam.campus.entity.Payroll;
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
public class PayrollMapperImpl implements PayrollMapper {

    @Override
    public Payroll toEntity(PayrollDTO payrollDTO) {
        if ( payrollDTO == null ) {
            return null;
        }

        Payroll payroll = new Payroll();

        payroll.setId( payrollDTO.getId() );
        payroll.setSalary( payrollDTO.getSalary() );
        payroll.setBonus( payrollDTO.getBonus() );

        return payroll;
    }

    @Override
    public PayrollDTO toDTO(Payroll payroll) {
        if ( payroll == null ) {
            return null;
        }

        PayrollDTO payrollDTO = new PayrollDTO();

        payrollDTO.setId( payroll.getId() );
        payrollDTO.setSalary( payroll.getSalary() );
        payrollDTO.setBonus( payroll.getBonus() );
        payrollDTO.setTotalPay( payroll.getTotalPay() );

        return payrollDTO;
    }

    @Override
    public List<PayrollDTO> toDTOList(List<Payroll> payrolls) {
        if ( payrolls == null ) {
            return null;
        }

        List<PayrollDTO> list = new ArrayList<PayrollDTO>( payrolls.size() );
        for ( Payroll payroll : payrolls ) {
            list.add( toDTO( payroll ) );
        }

        return list;
    }
}
