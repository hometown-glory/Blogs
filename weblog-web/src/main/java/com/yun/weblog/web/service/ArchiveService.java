package com.yun.weblog.web.service;

import com.yun.weblog.common.result.Response;
import com.yun.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author 云言月
 * 2024/11/9 16:42
 */
public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}

