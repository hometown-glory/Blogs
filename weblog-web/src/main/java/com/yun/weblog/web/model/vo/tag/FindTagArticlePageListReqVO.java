package com.yun.weblog.web.model.vo.tag;

import com.yun.weblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author 云言月
 * 2024/11/10 11:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindTagArticlePageListReqVO extends BasePageQuery {
    /**
     * 标签 ID
     */
    @NotNull(message = "标签 ID 不能为空")
    private Long id;
}
