package com.cntaipingasset.mcp.web;

import com.cntaipingasset.mcp.common.Result;
import com.cntaipingasset.mcp.service.ManagementService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
