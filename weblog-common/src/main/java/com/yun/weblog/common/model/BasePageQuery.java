package com.yun.weblog.common.model;

import lombok.Data;

/**
 * @author 云言月
 * 2024/11/2 19:46
 */
@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;
    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}
