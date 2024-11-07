package com.yun.weblog.common.domain.mapper;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yun.weblog.common.config.InsertBatchMapper;
import com.yun.weblog.common.domain.dos.ArticleTagRelDO;

import java.util.List;

/**
 * @author 云言月
 * 2024/11/5 19:34
 * 文章标签关联
 */
public interface ArticleTagRelMapper extends InsertBatchMapper<ArticleTagRelDO> {
    /**
     * 根据文章 ID 删除关联记录
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getArticleId, articleId));
    }

    /**
     * 根据文章 ID 来查询
     * @param articleId
     * @return
     */
    default List<ArticleTagRelDO> selectByArticleId(Long articleId) {
        return selectList(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getArticleId, articleId));
    }
}
