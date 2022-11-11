package com.grielsmin.grielsmin.service.impl;

import com.grielsmin.grielsmin.dto.IssueDto;
import com.grielsmin.grielsmin.mapper.IssueMapper;
import com.grielsmin.grielsmin.model.Issue;
import com.grielsmin.grielsmin.model.Priority;
import com.grielsmin.grielsmin.model.TabType;
import com.grielsmin.grielsmin.model.User;
import com.grielsmin.grielsmin.repository.IssueRepository;
import com.grielsmin.grielsmin.service.IssueService;
import com.grielsmin.grielsmin.service.PriorityService;
import com.grielsmin.grielsmin.service.TabTypeService;
import com.grielsmin.grielsmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;

    private final TabTypeService tabTypeService;

    private final PriorityService priorityService;

    private final UserService userService;

    @Autowired
    public IssueServiceImpl(IssueRepository issueRepository, TabTypeService tabTypeService,
                            PriorityService priorityService, UserService userService) {
        this.issueRepository = issueRepository;
        this.tabTypeService = tabTypeService;
        this.priorityService = priorityService;
        this.userService = userService;
    }

    @Override
    public List<IssueDto> findAll() {
//        List<Issue> issues = issueRepository.findAll();
//        List<IssueDto> issueDtos = new ArrayList<>();
//        for (Issue issue: issues) {
//            issueDtos.add(IssueMapper.toIssueDto(issue));
//        }
//        return issueDtos;
       // IssueMapper.toIssueDto(issue)
        return issueRepository.findAll().stream().map(IssueMapper::toIssueDto).collect(Collectors.toList());
    }

    @Override
    public Issue add(IssueDto issue) {

        User user = userService.findById(issue.getUserId());
        String title = issue.getTitle();
        String description = issue.getDescription();
        Priority priority = priorityService.findById(issue.getPriorityId());
        TabType tabType = tabTypeService.findById(issue.getTabTypeId());


        return issueRepository.save(new Issue(user, title, description, priority, tabType));
    }
}
