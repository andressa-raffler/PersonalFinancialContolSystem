package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.InflowDTO;
import com.raffler.financialcontrol.DTO.request.InstallmentDTO;
import com.raffler.financialcontrol.model.Inflow;
import com.raffler.financialcontrol.model.Installment;
import org.mapstruct.Mapper;


@Mapper
public interface InstallmentMapper extends BaseMapper<InstallmentDTO, Installment> {

}
