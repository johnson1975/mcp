package com.cntaipingasset.mcp.service;

import com.cntaipingasset.mcp.domain.auth.Department;
import com.cntaipingasset.mcp.domain.auth.User;
import com.cntaipingasset.mcp.repository.DepartmentRepository;
import com.cntaipingasset.mcp.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Johnson on 2015/4/29.
 */
@Service(value = "memberService")
public class MemberServiceImpl implements MemberService {
    @Inject
    private DepartmentRepository departmentRepository;
    @Inject
    private UserRepository userRepository;

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean removeUser(Long uid) {
        userRepository.delete(uid);
        return true;
    }

    @Override
    public Department getDepartments(Long departmentId) {
        return departmentRepository.findOne(departmentId);
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<User> getUsersBy(Long position) {
        return userRepository.findByPosition(position);
    }

    @Override
    public boolean updateDepartmentForUsers(Long departmentId, List<Long> uidList) {
        userRepository.setDepartment(departmentId, uidList);
        return false;
    }
}
