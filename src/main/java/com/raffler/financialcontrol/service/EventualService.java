package com.raffler.financialcontrol.service;

import com.raffler.financialcontrol.DTO.request.EventualDTO;
import com.raffler.financialcontrol.mapper.EventualMapper;
import com.raffler.financialcontrol.model.Eventual;
import com.raffler.financialcontrol.repository.EventualRepository;
import org.springframework.stereotype.Service;

@Service
public class EventualService extends BaseService<EventualDTO, Eventual, EventualMapper, EventualRepository> {

    public EventualService(EventualMapper mapper, EventualRepository repository) {
        super(mapper, repository);
    }

}
