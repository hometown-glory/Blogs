package com.yun.weblog.web.service;


import com.yun.weblog.common.result.Response;
import com.yun.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.yun.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @author 云言月
 * 2024/11/7 22:09
 */
public interface ArticleService {

    /**
     * 首页文章列表
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}
