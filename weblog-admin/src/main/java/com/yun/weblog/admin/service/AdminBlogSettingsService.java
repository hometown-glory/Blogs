package com.yun.weblog.admin.service;

import com.yun.weblog.admin.model.vo.blogsetting.UpdateBlogSettingsReqVO;
import com.yun.weblog.common.result.Response;

/**
 * @author 云言月
 * 2024/11/5 8:31
 * description:博客设置模块
 */
public interface AdminBlogSettingsService {
    /**
     * 修改博客设置
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 查询博客设置详情
     * @return
     */
    Response findDetail();
}
