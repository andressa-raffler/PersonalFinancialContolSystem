package com.raffler.financialcontrol.service;

import com.raffler.financialcontrol.DTO.request.BaseDTO;
import com.raffler.financialcontrol.DTO.response.MessageResponseDTO;
import com.raffler.financialcontrol.mapper.BaseMapper;
import com.raffler.financialcontrol.model.BaseEntity;
import com.raffler.financialcontrol.repository.BaseRepository;


import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseService<DTO extends BaseDTO,
        Entity extends BaseEntity,
        Mapper extends BaseMapper<DTO, Entity>,
        Repository extends BaseRepository<Entity, Long>> {

    protected final Mapper mapper;
    protected final Repository repository;

    public BaseService(Mapper mapper, Repository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<DTO> listByMonthYear(String monthYear) {
        List<Entity> entityList = repository.findByMonthYear(monthYear);
        return entityList.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public MessageResponseDTO saveEntity(DTO dto) {
        repository.save(mapper.toModel(dto));
        return MessageResponseDTO.builder().message("Entity saved successfully!").build();
    }

    public MessageResponseDTO editEntity(DTO dto) {
        repository.save(mapper.toModel(dto));
        return MessageResponseDTO.builder().message("Entity updated successfully!").build();
    }

    public MessageResponseDTO deleteEntity(DTO dto) {
        repository.delete(mapper.toModel(dto));
        return MessageResponseDTO.builder().message("Entity deleted successfully!").build();
    }
}