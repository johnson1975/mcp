package com.cntaipingasset.mcp.web;

import com.cntaipingasset.mcp.common.Result;
import com.cntaipingasset.mcp.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by Johnson on 2015/4/29.
 */
@RestController
public class MemberController {
    @Inject
    private MemberService memberService;

    @RequestMapping(value = "/organization", method = RequestMethod.GET)
    @ResponseBody
    public Result getAlternativeInvestment() {
        return Result.successResult(memberService.getDepartments());
    }

}
