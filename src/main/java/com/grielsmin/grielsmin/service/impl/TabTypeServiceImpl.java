package com.grielsmin.grielsmin.service.impl;

import com.grielsmin.grielsmin.model.TabType;
import com.grielsmin.grielsmin.repository.TabTypeRepository;
import com.grielsmin.grielsmin.service.TabTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabTypeServiceImpl implements TabTypeService {

    private final TabTypeRepository tabTypeRepository;

    @Autowired
    public TabTypeServiceImpl(TabTypeRepository tabTypeRepository) {
            this.tabTypeRepository = tabTypeRepository;
    }

    @Override
    public List<TabType> findAll(){
            return tabTypeRepository.findAll();
    }

    @Override
    public TabType findById(Integer id) {return tabTypeRepository.findByTabTypeId(id);}

    @Override
    public TabType add(TabType tabType) {
        return tabTypeRepository.save(tabType);
    }
}
