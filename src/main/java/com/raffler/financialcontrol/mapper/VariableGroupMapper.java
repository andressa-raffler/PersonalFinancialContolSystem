package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.VariableGroupDTO;
import com.raffler.financialcontrol.model.VariableGroup;
import org.mapstruct.Mapper;


@Mapper
public interface VariableGroupMapper extends BaseMapper<VariableGroupDTO, VariableGroup> {

}
