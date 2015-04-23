package com.cntaipingasset.mcp.web;

import com.cntaipingasset.mcp.common.Result;
import com.cntaipingasset.mcp.domain.ImportantTask;
import com.cntaipingasset.mcp.domain.InnovationProject;
import com.cntaipingasset.mcp.service.ManagementService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Johnson on 2015/4/16.
 */
@RestController(value = "managementController")
public class ManagementController {
    private ManagementService managementService;

    @RequestMapping(value = "/alternativeInvestments", method = RequestMethod.GET)
    @ResponseBody
    public Result getAlternativeInvestment() {
        return Result.successResult(managementService.getAlternativeInvestments());
    }

    @RequestMapping(value = "/innovationProjects", method = RequestMethod.GET)
    @ResponseBody
    public Result getInnovationProjects() {
        return Result.successResult(managementService.getInnovationProjects());
    }

    @RequestMapping(value = "/innovationProjects", method = RequestMethod.POST)
    @ResponseBody
    public Result addInnovationProject(@RequestBody InnovationProject innovationProject) {
        return Result.successResult(managementService.addInnovationProject(innovationProject));
    }

    @RequestMapping(value = "/innovationProjects/{pid}", method = RequestMethod.PUT)
    @ResponseBody
    public Result saveInnovationProject(@PathVariable Long pid) {
        return Result.successResult(managementService.getProgressHistories(pid));
    }

    @RequestMapping(value = "/innovationProjects/{pid}/progressHistories", method = RequestMethod.GET)
    @ResponseBody
    public Result getProgressHistoriesOf(@PathVariable Long pid) {
        return Result.successResult(managementService.getProgressHistories(pid));
    }

    @RequestMapping(value = "/importantTasks", method = RequestMethod.GET)
    @ResponseBody
    public Result getImportantTasks() {
        return Result.successResult(managementService.getImportantTasks());
    }

    @RequestMapping(value = "/importantTasks", method = RequestMethod.POST)
    @ResponseBody
    public Result addImportantTask(@RequestBody ImportantTask importantTask) {
        return Result.successResult(managementService.addImportantTask(importantTask));
    }

    @RequestMapping(value = "/importantTasks/{tid}/progressHistories", method = RequestMethod.GET)
    @ResponseBody
    public Result getProgressHistoriesOfImportantTask(@PathVariable Long tid) {
        return Result.successResult(managementService.getProgressHistoriesOfImportantTask(tid));
    }

}
