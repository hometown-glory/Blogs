package com.yun.weblog.admin.controller;

import com.yun.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.yun.weblog.admin.service.AdminUserService;
import com.yun.weblog.common.aspect.ApiOperationLog;
import com.yun.weblog.common.result.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 云言月
 * 2024/11/1 15:14
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 用户模块")
public class AdminUserController {

    @Autowired
    private AdminUserService userService;

    /**
     * 修改用户密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    @PostMapping("/password/update")
    @ApiOperation(value = "修改用户密码")
    @ApiOperationLog(description = "修改用户密码")
    public Response updatePassword(@RequestBody @Validated UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO){
        return userService.updatePassword(updateAdminUserPasswordReqVO);
    }

    /**
     * 获取用户信息
     * @return
     */
    @PostMapping("/user/info")
    @ApiOperation(value = "获取用户信息")
    @ApiOperationLog(description = "获取用户信息")
    public Response findUserInfo() {
        return userService.findUserInfo();
    }

}

