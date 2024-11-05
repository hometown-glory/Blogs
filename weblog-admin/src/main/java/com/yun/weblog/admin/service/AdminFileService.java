package com.yun.weblog.admin.service;

import com.yun.weblog.common.result.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 云言月
 * 2024/11/4 21:12
 */
public interface AdminFileService {
    /**
     * 文件上传
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
