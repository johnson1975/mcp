package com.cntaipingasset.mcp.service;

import com.cntaipingasset.mcp.domain.*;
import com.cntaipingasset.mcp.repository.*;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Johnson on 2015/4/16.
 */
@Service(value = "managementService")
public class ManagementServiceImpl implements ManagementService {
    @Inject
    private AlternativeInvestmentRepository alternativeInvestmentRepository;
    @Inject
    private AssetManagementProductRepository assetManagementProductRepository;
    @Inject
    private ImportantTaskRepository importantTaskRepository;
    @Inject
    private InnovationProjectRepository innovationProjectRepository;
    @Inject
    private InnovationProjectHistoryRepository innovationProjectHistoryRepository;
    @Inject
    private ImportantTaskHistoryRepository importantTaskHistoryRepository;


    @Override
    public List<ImportantTask> getImportantTasks() {
        return importantTaskRepository.findAll();
    }

    @Override
    public List<AlternativeInvestment> getAlternativeInvestments() {
        return alternativeInvestmentRepository.findAll();
    }

    @Override
    public List<InnovationProject> getInnovationProjects() {
        return innovationProjectRepository.findAll();
    }

    @Override
    public List<AssetManagementProduct> getAssetManagementProducts() {
        return assetManagementProductRepository.findAll();
    }

    @Override
    public InnovationProject addInnovationProject(InnovationProject innovationProject) {
        return innovationProjectRepository.save(innovationProject);
    }

    @Override
    public List<InnovationProjectHistory> getProgressHistories(Long pid) {
        return innovationProjectHistoryRepository.findByProjectId(pid);
    }

    @Override
    public ImportantTask addImportantTask(ImportantTask importantTask) {
        return importantTaskRepository.save(importantTask);
    }

    @Override
    public List<ImportantTaskHistory> getProgressHistoriesOfImportantTask(Long tid) {
        return importantTaskHistoryRepository.findByTaskId(tid);
    }
}
