package com.raffler.financialcontrol.mapper;

import com.raffler.financialcontrol.DTO.request.BaseDTO;
import com.raffler.financialcontrol.model.BaseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BaseMapper<DTO extends BaseDTO, Entity extends BaseEntity> {

    BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);

    Entity toModel(DTO dto);

    DTO toDTO(Entity entity);
}