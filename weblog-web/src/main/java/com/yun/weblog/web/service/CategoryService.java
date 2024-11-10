package com.yun.weblog.web.service;

import com.yun.weblog.common.result.Response;
import com.yun.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;

/**
 * @author 云言月
 * 2024/11/8 10:18
 */
public interface CategoryService {
    /**
     * 查询分类列表
     * @return
     */
    Response findCategoryList();

    /**
     * 查询分类文章列表
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
