package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.EventualDTO;
import com.raffler.financialcontrol.DTO.request.InflowDTO;
import com.raffler.financialcontrol.model.Eventual;
import com.raffler.financialcontrol.model.Inflow;
import org.mapstruct.Mapper;


@Mapper
public interface EventualMapper extends BaseMapper<EventualDTO, Eventual> {

}
