package com.raffler.financialcontrol.service;

import com.raffler.financialcontrol.DTO.request.InflowDTO;
import com.raffler.financialcontrol.mapper.InflowMapper;
import com.raffler.financialcontrol.model.Inflow;
import com.raffler.financialcontrol.repository.InflowRepository;
import org.springframework.stereotype.Service;

@Service
public class InflowService extends BaseService<InflowDTO, Inflow, InflowMapper, InflowRepository> {

    public InflowService(InflowMapper mapper, InflowRepository repository) {
        super(mapper, repository);
    }

}
