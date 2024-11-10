package com.yun.weblog.common.domain.dos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
/**
 * @author 云言月
 * 2024/11/10 21:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticlePublishCountDO {
    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 文章发布数量
     */
    private Long count;
}
