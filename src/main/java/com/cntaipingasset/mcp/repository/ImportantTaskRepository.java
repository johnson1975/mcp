package com.cntaipingasset.mcp.repository;

import com.cntaipingasset.mcp.domain.ImportantTask;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Johnson on 2015/4/16.
 */
public interface ImportantTaskRepository extends JpaRepository<ImportantTask, Long> {
}
