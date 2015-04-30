package com.cntaipingasset.mcp.web;

import com.cntaipingasset.mcp.common.Result;
import com.cntaipingasset.mcp.domain.auth.Department;
import com.cntaipingasset.mcp.domain.auth.User;
import com.cntaipingasset.mcp.service.MemberService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Johnson on 2015/4/29.
 */
@RestController
public class MemberController {
    @Inject
    private MemberService memberService;

    @RequestMapping(value = "/organization", method = RequestMethod.GET)
    @ResponseBody
    public Result getOrganization() {
        return Result.successResult(memberService.getDepartments());
    }

    @RequestMapping(value = "/departments/{departmentId}", method = RequestMethod.GET)
    @ResponseBody
    public Result getDepartment(@PathVariable Long departmentId) {
        return Result.successResult(memberService.getDepartments(departmentId));
    }

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    @ResponseBody
    public Result addDepartment(@RequestBody Department department) {
        return Result.successResult(memberService.saveDepartment(department));
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public Result addUser(@RequestBody User user) {
        return Result.successResult(memberService.saveUser(user));
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public Result editUser(@RequestBody User user) {
        return Result.successResult(memberService.saveUser(user));
    }

    @RequestMapping(value = "/users/{uid}", method = RequestMethod.PUT)
    @ResponseBody
    public Result addUser(@PathVariable Long uid) {
        return Result.successResult(memberService.removeUser(uid));
    }

    @RequestMapping(value = "/users/position/{position}", method = RequestMethod.POST)
    @ResponseBody
    public Result getUsersByPosition(@RequestBody Long position) {
        return Result.successResult(memberService.getUsersBy(position));
    }

    @RequestMapping(value = "/users/department/{departmentId}", method = RequestMethod.POST)
    @ResponseBody
    public Result getUsersByPosition(@MatrixVariable(value = "u") List<Long> uidList, @PathVariable Long departmentId) {
        return Result.successResult(memberService.updateDepartmentForUsers(departmentId, uidList));
    }
}
