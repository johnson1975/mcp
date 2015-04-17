package com.cntaipingasset.mcp.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Johnson on 2015/4/16.
 */
@Entity
public class ImportantTask implements Serializable {
    private Long id;
    private Integer number;
    private Integer type;
    private Integer category;
    private String name;
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
    private Date accomplishedDate;
    private Integer status;
    private Date updateDate;
}
