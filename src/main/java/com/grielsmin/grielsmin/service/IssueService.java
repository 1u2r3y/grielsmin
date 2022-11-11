package com.grielsmin.grielsmin.service;

import com.grielsmin.grielsmin.dto.IssueDto;
import com.grielsmin.grielsmin.model.Issue;

import java.util.List;

public interface IssueService {
    List<IssueDto> findAll();

    Issue add(IssueDto issue);
}
