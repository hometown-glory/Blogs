package com.yun.weblog.web.controller;

import com.yun.weblog.common.aspect.ApiOperationLog;
import com.yun.weblog.common.result.Response;
import com.yun.weblog.web.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 云言月
 * 2024/11/8 10:22
 */
@RestController
@RequestMapping("/tag")
@Api(tags = "标签")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/list")
    @ApiOperation(value = "前台获取标签列表")
    @ApiOperationLog(description = "前台获取标签列表")
    public Response findTagList() {
        return tagService.findTagList();
    }

}

