package com.yun.weblog.admin.config;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 云言月
 * 2024/11/4 21:06
 */
@ConfigurationProperties(prefix = "minio")
@Component
@Data
public class MinioProperties {

    private String endpoint;


    private String accessKey;


    private String secretKey;


    private String bucketName;
}

