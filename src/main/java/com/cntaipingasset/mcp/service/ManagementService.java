package com.cntaipingasset.mcp.service;

import com.cntaipingasset.mcp.domain.*;

import java.util.List;

/**
 * Created by Johnson on 2015/4/16.
 */
public interface ManagementService {
    public List<ImportantTask> getImportantTasks();

    public List<AlternativeInvestment> getAlternativeInvestments();

    public List<InnovationProject> getInnovationProjects();

    public List<AssetManagementProduct> getAssetManagementProducts();

    public InnovationProject addInnovationProject(InnovationProject innovationProject);

    public List<InnovationProjectHistory> getProgressHistories(Long pid);

    public ImportantTask addImportantTask(ImportantTask importantTask);

    public List<ImportantTaskHistory> getProgressHistoriesOfImportantTask(Long tid);

}
