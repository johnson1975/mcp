package com.cntaipingasset.mcp.repository;

import com.cntaipingasset.mcp.domain.auth.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Johnson on 2015/4/29.
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
