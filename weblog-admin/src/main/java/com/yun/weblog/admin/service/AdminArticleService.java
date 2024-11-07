package com.yun.weblog.admin.service;

import com.yun.weblog.admin.model.vo.article.*;
import com.yun.weblog.common.result.Response;

/**
 * @author 云言月
 * 2024/11/5 19:45
 */
public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);

    /**
     * 删除文章
     * @param deleteArticleReqVO
     * @return
     */
    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    /**
     * 查询文章分页数据
     * @param findArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindArticlePageListReqVO findArticlePageListReqVO);

    /**
     * 查询文章详情
     * @param findArticlePageListReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticlePageListReqVO);

    /**
     * 修改文章
     * @param updateArticleReqVO
     * @return
     */
    Response updateArticle(UpdateArticleReqVO updateArticleReqVO);
}
