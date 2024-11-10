package com.yun.weblog.web.model.vo.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author 云言月
 * 2024/11/9 19:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryArticlePageListRspVO {
    private Long id;
    private String cover;
    private String title;
    /**
     * 发布日期
     */
    private LocalDate createDate;
}
