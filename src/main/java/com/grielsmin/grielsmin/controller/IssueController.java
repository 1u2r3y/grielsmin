package com.grielsmin.grielsmin.controller;

import com.grielsmin.grielsmin.dto.IssueDto;
import com.grielsmin.grielsmin.model.Issue;
import com.grielsmin.grielsmin.repository.IssueRepository;
import com.grielsmin.grielsmin.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssueController {
    private final IssueService issueService;
//    private final IssueRepository issueRepository;

    @Autowired
    public IssueController(IssueService issueService, IssueRepository issueRepository) {
        this.issueService = issueService;
//        this.issueRepository = issueRepository;
    }

    @GetMapping("/issues")
    public List<IssueDto> getOfIssues(){
        return issueService.findAll();
    }

    @PostMapping(value = "/issue", consumes = "application/json")
    public Issue addIssue(@RequestBody IssueDto issue){ return issueService.add(issue);}
}
