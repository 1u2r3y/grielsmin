package com.grielsmin.grielsmin.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@NoArgsConstructor
@Entity(name="tab_type")
public class TabType {
    @javax.persistence.Id
    @Id
    @Column(name = "tab_type_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer tabTypeId;

    @Column(name = "tab_type_name",nullable = false)
    private String tabTypeName;

    public Integer getTabTypeId() {
            return tabTypeId;
    }

    public String getTabTypeName() {
        return tabTypeName;
    }

    public void setTabTypeId(Integer tabTypeId) {
        this.tabTypeId = tabTypeId;
    }

    public void setTabTypeName(String tabTypeName) {
        this.tabTypeName = tabTypeName;
    }
}
