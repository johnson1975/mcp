package com.cntaipingasset.mcp.repository;

import com.cntaipingasset.mcp.domain.ImportantTaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Johnson on 2015/4/23.
 */
public interface ImportantTaskHistoryRepository extends JpaRepository<ImportantTaskHistory, Long> {
    public List<ImportantTaskHistory> findByTaskId(Long taskId);
}
