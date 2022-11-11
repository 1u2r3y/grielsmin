package com.grielsmin.grielsmin.service;

import com.grielsmin.grielsmin.model.TabType;

import java.util.List;

public interface TabTypeService {

    List<TabType> findAll();

    TabType findById(Integer id);

    TabType add(TabType tabType);
}
