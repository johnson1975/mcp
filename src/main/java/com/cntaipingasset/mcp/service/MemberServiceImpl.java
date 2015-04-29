package com.cntaipingasset.mcp.service;

import com.cntaipingasset.mcp.domain.auth.Department;
import com.cntaipingasset.mcp.repository.DepartmentRepository;
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

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }
}
