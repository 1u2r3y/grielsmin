package com.grielsmin.grielsmin.repository;

import com.grielsmin.grielsmin.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {

    Issue findByIssueId(Long issueId);

    Issue findByTitle(String title);

    Issue findIssueByUserId (Long userId);

    Issue findByPriorityPriorityId(Integer priorityId);

    Issue findByTabTypeTabTypeId(Integer tabTypeId);
}
