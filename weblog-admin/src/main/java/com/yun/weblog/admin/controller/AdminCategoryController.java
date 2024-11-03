package com.yun.weblog.admin.controller;

import com.yun.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.yun.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.yun.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.yun.weblog.admin.service.AdminCategoryService;
import com.yun.weblog.common.aspect.ApiOperationLog;
import com.yun.weblog.common.result.Response;
import com.yun.weblog.common.utils.PageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author 云言月
 * 2024/11/2 17:47
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 分类模块")
public class AdminCategoryController {

    @Autowired
    private AdminCategoryService categoryService;

    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    @PostMapping("/category/add")
    @ApiOperation(value = "添加分类")
    @ApiOperationLog(description = "添加分类")
    public Response addCategory(@RequestBody @Validated AddCategoryReqVO addCategoryReqVO) {
        return categoryService.addCategory(addCategoryReqVO);
    }

    /**
     * 分类分页数据获取
     * @param findCategoryPageListReqVO
     * @return
     */
    @PostMapping("/category/list")
    @ApiOperation(value = "分类分页数据获取")
    @ApiOperationLog(description = "分类分页数据获取")
    public PageResponse findCategoryList(@RequestBody @Validated FindCategoryPageListReqVO findCategoryPageListReqVO) {
        return categoryService.findCategoryList(findCategoryPageListReqVO);
    }

    /**
     *
     * @param deleteCategoryReqVO
     * @return
     */
    @PostMapping("/category/delete")
    @ApiOperation(value = "删除分类")
    @ApiOperationLog(description = "删除分类")
    public Response deleteCategory(@RequestBody @Validated DeleteCategoryReqVO deleteCategoryReqVO) {
        return categoryService.deleteCategory(deleteCategoryReqVO);
    }

    /**
     * 分类 Select 下拉列表数据获取
     * @return
     */
    @GetMapping("/category/select/list")
    @ApiOperation(value = "分类 Select 下拉列表数据获取")
    @ApiOperationLog(description = "分类 Select 下拉列表数据获取")
    public Response findCategorySelectList() {
        return categoryService.findCategorySelectList();
    }


}

