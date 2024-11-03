package com.yun.weblog.admin.service;

import com.yun.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.yun.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.yun.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.yun.weblog.common.result.Response;
import com.yun.weblog.common.utils.PageResponse;

/**
 * @author 云言月
 * 2024/11/2 19:33
 */
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 查询分类下拉列表
     * @return
     */
    Response findCategorySelectList();
}
