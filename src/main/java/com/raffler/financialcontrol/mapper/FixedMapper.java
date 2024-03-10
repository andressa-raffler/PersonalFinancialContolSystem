package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.FixedDTO;
import com.raffler.financialcontrol.DTO.request.InflowDTO;
import com.raffler.financialcontrol.model.Fixed;
import com.raffler.financialcontrol.model.Inflow;
import org.mapstruct.Mapper;


@Mapper
public interface FixedMapper extends BaseMapper<FixedDTO, Fixed> {

}
