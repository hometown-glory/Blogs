package com.yun.weblog.web.model.vo.tag;

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
public class FindTagListRspVO {
    private Long id;
    private String name;
}


