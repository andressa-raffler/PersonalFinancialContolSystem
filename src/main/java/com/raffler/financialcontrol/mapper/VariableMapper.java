package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.VariableDTO;
import com.raffler.financialcontrol.model.Variable;
import org.mapstruct.Mapper;


@Mapper
public interface VariableMapper extends BaseMapper<VariableDTO, Variable> {

}
