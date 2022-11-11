package com.grielsmin.grielsmin.repository;

import com.grielsmin.grielsmin.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer> {

    Priority findByPriorityId(Integer priorityId);

    Priority findByPriorityName(String priorityName);
}
