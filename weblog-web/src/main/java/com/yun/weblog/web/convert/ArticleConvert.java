package com.yun.weblog.web.convert;

import com.yun.weblog.common.domain.dos.ArticleDO;
import com.yun.weblog.web.model.vo.article.FindIndexArticlePageListRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 云言月
 * 2024/11/8 9:43
 */
@Mapper
public interface ArticleConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindIndexArticlePageListRspVO convertDO2VO(ArticleDO bean);

}

