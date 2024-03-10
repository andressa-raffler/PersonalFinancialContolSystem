package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.InstallmentDTO;
import com.raffler.financialcontrol.DTO.request.ObjectivesDTO;
import com.raffler.financialcontrol.model.Installment;
import com.raffler.financialcontrol.model.Objectives;
import org.mapstruct.Mapper;


@Mapper
public interface ObjectivesMapper extends BaseMapper<ObjectivesDTO, Objectives> {

}
