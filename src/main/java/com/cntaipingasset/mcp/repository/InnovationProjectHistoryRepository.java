package com.cntaipingasset.mcp.repository;

import com.cntaipingasset.mcp.domain.InnovationProjectHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Johnson on 2015/4/23.
 */
public interface InnovationProjectHistoryRepository extends JpaRepository<InnovationProjectHistory, Long> {
    public List<InnovationProjectHistory> findByProjectId(Long projectId);
}
