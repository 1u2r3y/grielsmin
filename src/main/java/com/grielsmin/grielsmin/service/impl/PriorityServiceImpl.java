package com.grielsmin.grielsmin.service.impl;

import com.grielsmin.grielsmin.model.Priority;
import com.grielsmin.grielsmin.repository.PriorityRepository;
import com.grielsmin.grielsmin.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriorityServiceImpl implements PriorityService {

    private final PriorityRepository priorityRepository;

    @Autowired
    public PriorityServiceImpl(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }


    @Override
    public List<Priority> findAll() {
        return priorityRepository.findAll();
    }

    @Override
    public Priority findById(Integer priorityId) {
        return priorityRepository.findByPriorityId(priorityId);
    }

    @Override
    public Priority add(Priority priority) {
        return priorityRepository.save(priority);
    }
}
