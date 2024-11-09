package com.yun.weblog.web.model.vo.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 云言月
 * 2024/11/7 22:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryListRspVO  {
    private Long id;
    private String name;
}
