package com.yun.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 云言月
 * 2024/10/27 16:01
 */
@Configuration
@MapperScan("com.yun.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
