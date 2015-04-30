package com.cntaipingasset.mcp.repository;

import com.cntaipingasset.mcp.domain.auth.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Johnson on 2015/4/30.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByPosition(Long position);

    @Modifying
    @Query("update User  u set u.department.id = ?1 where u.id in (?2)")
    @Transactional
    void setDepartment(Long departmentId, List<Long> uidList);
}
