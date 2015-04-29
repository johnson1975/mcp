package com.cntaipingasset.mcp.domain.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/16.
 */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = -6307208559925501248L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String nickName;
    private String headPic;
    private Integer gender;
    @ManyToOne
    @JoinColumn(name = "departmentId")
    @JsonIgnore
    private Department department;
    private String mobile;
    private String phoneNo;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "roleId")
    private Role role;
    private PositionTypeEnum position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public PositionTypeEnum getPosition() {
        return position;
    }

    public void setPosition(PositionTypeEnum position) {
        this.position = position;
    }
}
