package com.grielsmin.grielsmin.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@Entity(name = "priority")
public class Priority {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "priority_id")
    private Integer priorityId;

    @Column(name = "priority_name", nullable = false)
    private String priorityName;


    public Integer getPriorityId() {
        return priorityId;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }

}