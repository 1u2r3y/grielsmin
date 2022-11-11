package com.grielsmin.grielsmin.mapper;

import com.grielsmin.grielsmin.dto.IssueDto;
import com.grielsmin.grielsmin.model.Issue;
import com.grielsmin.grielsmin.model.Priority;
import com.grielsmin.grielsmin.model.TabType;
import com.grielsmin.grielsmin.model.User;
import org.springframework.stereotype.Component;

@Component
public class IssueMapper {
    public static IssueDto toIssueDto (Issue issue){

        IssueDto issueDto = new IssueDto();

        issueDto.setIssueId(issue.getIssueId());
        issueDto.setDescription(issue.getDescription());
        issueDto.setPriorityId(issue.getPriority().getPriorityId());
        issueDto.setTabTypeId(issue.getTabType().getTabTypeId());
        issueDto.setUserId(issue.getUser().getUserId());
        issueDto.setTitle(issue.getTitle());

        return issueDto;

    }
}