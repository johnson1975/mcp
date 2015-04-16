package com.cntaipingasset.mcp.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/16.
 */
@Entity
public class InnovationProject implements Serializable {
    private Long id;
    private String projectId;
    private Integer projectType;
    private String projectName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
