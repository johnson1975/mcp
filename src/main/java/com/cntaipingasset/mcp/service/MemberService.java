package com.cntaipingasset.mcp.service;

import com.cntaipingasset.mcp.domain.auth.Department;
import com.cntaipingasset.mcp.domain.auth.User;

import java.util.List;

/**
 * Created by Johnson on 2015/4/29.
 */
public interface MemberService {
    public List<Department> getDepartments();

    public User saveUser(User user);

    public boolean removeUser(Long uid);

    public Department getDepartments(Long departmentId);

    public Department saveDepartment(Department department);

    public List<User> getUsersBy(Long position);

    public boolean updateDepartmentForUsers(Long departmentId, List<Long> uidList);
}
