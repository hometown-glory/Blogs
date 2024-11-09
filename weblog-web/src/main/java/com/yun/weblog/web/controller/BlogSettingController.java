package com.yun.weblog.web.controller;

import com.yun.weblog.common.aspect.ApiOperationLog;
import com.yun.weblog.common.result.Response;
import com.yun.weblog.web.service.BlogSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 云言月
 * 2024/11/8 10:54
 */
@RestController
@RequestMapping("/blog/settings")
@Api(tags = "博客设置")
public class BlogSettingController {

    @Autowired
    private BlogSettingService blogSettingsService;

    @PostMapping("/detail")
    @ApiOperation(value = "前台获取博客详情")
    @ApiOperationLog(description = "前台获取博客详情")
    public Response findDetail() {
        return blogSettingsService.findDetail();
    }

}

