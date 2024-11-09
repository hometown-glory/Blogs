package com.yun.weblog.web.service;

import com.yun.weblog.common.result.Response;

/**
 * @author 云言月
 *  2024/11/8 10:23
 */
public interface TagService {
    /**
     * 查询所有标签
     * @return
     */
    Response findTagList();
}
