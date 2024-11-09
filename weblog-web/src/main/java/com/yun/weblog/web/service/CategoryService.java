package com.yun.weblog.web.service;

import com.yun.weblog.common.result.Response;

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
}
