package com.yun.weblog.web.service;

import com.yun.weblog.common.result.Response;
import com.yun.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;

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

    /**
     * 查询标签下的文章分页数据
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
