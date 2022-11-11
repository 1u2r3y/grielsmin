package com.grielsmin.grielsmin.service;

import com.grielsmin.grielsmin.model.Priority;

import java.util.List;

public interface PriorityService {

    List<Priority> findAll();

    Priority findById(Integer priorityId);

    Priority add(Priority priority);
}
