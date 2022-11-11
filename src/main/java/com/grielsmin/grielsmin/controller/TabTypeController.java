package com.grielsmin.grielsmin.controller;
import com.grielsmin.grielsmin.model.TabType;
import com.grielsmin.grielsmin.repository.TabTypeRepository;
import com.grielsmin.grielsmin.service.TabTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TabTypeController {
    private final TabTypeService tabTypeService;
    private final TabTypeRepository tabTypeRepository;

    @Autowired
    public TabTypeController(TabTypeService tabTypeService, TabTypeRepository tabTypeRepository) {
        this.tabTypeService = tabTypeService;
        this.tabTypeRepository = tabTypeRepository;
    }

    @GetMapping("/tabTypes")
    public List<TabType> getOfTabTypes(){
        return tabTypeRepository.findAll();
    }

    @PostMapping(value = "/tabType", consumes = "application/json")
    public TabType addTabType(@RequestBody TabType tabType){ return tabTypeService.add(tabType);}

}
