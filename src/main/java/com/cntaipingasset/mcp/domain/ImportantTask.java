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
    private String progress;
    private String content;
    private String responsibleDepartment;
    private String responsibleDepartmentId;
    private String leader;
    private String leaderId;
    private String supervisor;
    private String supervisorId;
    private String accompanyDepartment;
    private String accompanyDepartmentId;
    private String accompanyDepartmentLeader;
    private String accompanyDepartmentLeaderId;
    private String accompanyDepartmentSupervisor;
    private String accompanyDepartmentSupervisorId;
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

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
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

    public String getResponsibleDepartmentId() {
        return responsibleDepartmentId;
    }

    public void setResponsibleDepartmentId(String responsibleDepartmentId) {
        this.responsibleDepartmentId = responsibleDepartmentId;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getAccompanyDepartment() {
        return accompanyDepartment;
    }

    public void setAccompanyDepartment(String accompanyDepartment) {
        this.accompanyDepartment = accompanyDepartment;
    }

    public String getAccompanyDepartmentId() {
        return accompanyDepartmentId;
    }

    public void setAccompanyDepartmentId(String accompanyDepartmentId) {
        this.accompanyDepartmentId = accompanyDepartmentId;
    }

    public String getAccompanyDepartmentLeader() {
        return accompanyDepartmentLeader;
    }

    public void setAccompanyDepartmentLeader(String accompanyDepartmentLeader) {
        this.accompanyDepartmentLeader = accompanyDepartmentLeader;
    }

    public String getAccompanyDepartmentLeaderId() {
        return accompanyDepartmentLeaderId;
    }

    public void setAccompanyDepartmentLeaderId(String accompanyDepartmentLeaderId) {
        this.accompanyDepartmentLeaderId = accompanyDepartmentLeaderId;
    }

    public String getAccompanyDepartmentSupervisor() {
        return accompanyDepartmentSupervisor;
    }

    public void setAccompanyDepartmentSupervisor(String accompanyDepartmentSupervisor) {
        this.accompanyDepartmentSupervisor = accompanyDepartmentSupervisor;
    }

    public String getAccompanyDepartmentSupervisorId() {
        return accompanyDepartmentSupervisorId;
    }

    public void setAccompanyDepartmentSupervisorId(String accompanyDepartmentSupervisorId) {
        this.accompanyDepartmentSupervisorId = accompanyDepartmentSupervisorId;
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
