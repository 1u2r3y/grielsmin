package com.grielsmin.grielsmin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
@Getter
@Setter
@Accessors
@NoArgsConstructor
@Entity(name="issue")
@Table(name = "issue", schema = "public")
public class Issue {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "issue_id")
    private Long issueId;

//    @Column(nullable = false)
//    private Integer user_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = true)
    private String description;

//    @Column(nullable = false)
//    private Integer priority_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "priority_id", referencedColumnName = "priority_id")
    private Priority priority;

//    @Column(nullable = false)
//    private Integer tab_type_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tab_type_id", referencedColumnName = "tab_type_id")
    private TabType tabType;

//    @Access(AccessType.PROPERTY)
//    @Column(name = "user_id", updatable = false, insertable = false)
//    private Long userId;

    public Issue(User user, String title, String description, Priority priority, TabType tabType){
        this.user = user;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.tabType = tabType;
    }
}
