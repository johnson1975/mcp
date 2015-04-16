package com.cntaipingasset.mcp.service;

import com.cntaipingasset.mcp.domain.AlternativeInvestment;
import com.cntaipingasset.mcp.domain.AssetManagementProduct;
import com.cntaipingasset.mcp.domain.ImportantTask;
import com.cntaipingasset.mcp.domain.InnovationProject;
import com.cntaipingasset.mcp.repository.AlternativeInvestmentRepository;
import com.cntaipingasset.mcp.repository.AssetManagementProductRepository;
import com.cntaipingasset.mcp.repository.ImportantTaskRepository;
import com.cntaipingasset.mcp.repository.InnovationProjectRepository;
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
}
