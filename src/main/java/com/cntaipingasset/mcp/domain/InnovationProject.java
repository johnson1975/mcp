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
public class InnovationProject implements Serializable {
    private static final long serialVersionUID = -5891208629773411849L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer year;
    private Integer innovationDomain;
    private Integer number;
    private String aim;
    private String responsibleDepartment;
    private String responsibleDepartmentId;
    private String accompanyDepartment;
    private String accompanyDepartmentId;
    private String progress;
    private Integer percentage;
    private Date updateDate;
    private Date createDate = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getInnovationDomain() {
        return innovationDomain;
    }

    public void setInnovationDomain(Integer innovationDomain) {
        this.innovationDomain = innovationDomain;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
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

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
