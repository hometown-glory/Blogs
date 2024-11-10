package com.yun.weblog.web.model.vo.archive;

import com.yun.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author 云言月
 * 2024/11/9 16:40
 */
@Data
@Builder
@ApiModel(value = "文章归档分页 VO")
public class FindArchiveArticlePageListReqVO extends BasePageQuery {
}

