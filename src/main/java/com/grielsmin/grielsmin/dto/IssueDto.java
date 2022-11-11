package com.grielsmin.grielsmin.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.grielsmin.grielsmin.model.Priority;
import com.grielsmin.grielsmin.model.TabType;
import com.grielsmin.grielsmin.model.User;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor

public class IssueDto {
    private Long issueId;
    private Long userId;
    private String title;
    private String description;
    private Integer priorityId;
    private Integer tabTypeId;
}
