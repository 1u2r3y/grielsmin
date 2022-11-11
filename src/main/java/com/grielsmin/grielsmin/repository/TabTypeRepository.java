package com.grielsmin.grielsmin.repository;

import com.grielsmin.grielsmin.model.TabType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabTypeRepository extends JpaRepository<TabType, Integer> {

    TabType findByTabTypeId(Integer tabTypeId);

    TabType findByTabTypeName(String tabTypeName);
}
