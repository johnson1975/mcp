package com.cntaipingasset.mcp.service;

import com.cntaipingasset.mcp.domain.AlternativeInvestment;
import com.cntaipingasset.mcp.domain.AssetManagementProduct;
import com.cntaipingasset.mcp.domain.ImportantTask;
import com.cntaipingasset.mcp.domain.InnovationProject;

import java.util.List;

/**
 * Created by Johnson on 2015/4/16.
 */
public interface ManagementService {
    public List<ImportantTask> getImportantTasks();

    public List<AlternativeInvestment> getAlternativeInvestments();

    public List<InnovationProject> getInnovationProjects();

    public List<AssetManagementProduct> getAssetManagementProducts();

}
