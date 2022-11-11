package com.grielsmin.grielsmin.controller;

import com.grielsmin.grielsmin.model.Priority;
import com.grielsmin.grielsmin.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriorityController {

    private final PriorityService priorityService;

    @Autowired
    public PriorityController(PriorityService priorityService) {
        this.priorityService = priorityService;
    }

    @GetMapping("/priorities")
    public List<Priority> getOfPriority(){
        return priorityService.findAll();
    }

    @PostMapping(value = "/priority", consumes = "application/json")
    public Priority addPriority(@RequestBody Priority priority){ return priorityService.add(priority);}
}
