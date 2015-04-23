package com.cntaipingasset.mcp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Johnson on 2015/4/16.
 */
@Entity
public class ImportantTask implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private Integer type;
    private Integer category;
    private Integer progress;
    private String content;
    private String responsibleDepartment;
    private String leader;
    private String accompanyDepartment;
    private String accompanyDepartmentLeader;
    private String accompanyDepartmentSupervisor;
    private Date estimatedFinishDate;
    private Integer status;
    private Date createDate;
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResponsibleDepartment() {
        return responsibleDepartment;
    }

    public void setResponsibleDepartment(String responsibleDepartment) {
        this.responsibleDepartment = responsibleDepartment;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getAccompanyDepartment() {
        return accompanyDepartment;
    }

    public void setAccompanyDepartment(String accompanyDepartment) {
        this.accompanyDepartment = accompanyDepartment;
    }

    public String getAccompanyDepartmentLeader() {
        return accompanyDepartmentLeader;
    }

    public void setAccompanyDepartmentLeader(String accompanyDepartmentLeader) {
        this.accompanyDepartmentLeader = accompanyDepartmentLeader;
    }

    public String getAccompanyDepartmentSupervisor() {
        return accompanyDepartmentSupervisor;
    }

    public void setAccompanyDepartmentSupervisor(String accompanyDepartmentSupervisor) {
        this.accompanyDepartmentSupervisor = accompanyDepartmentSupervisor;
    }

    public Date getEstimatedFinishDate() {
        return estimatedFinishDate;
    }

    public void setEstimatedFinishDate(Date estimatedFinishDate) {
        this.estimatedFinishDate = estimatedFinishDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
