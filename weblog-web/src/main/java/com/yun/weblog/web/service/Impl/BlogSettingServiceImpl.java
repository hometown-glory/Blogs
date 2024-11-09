package com.yun.weblog.web.service.Impl;

import com.yun.weblog.common.domain.dos.BlogSettingsDO;
import com.yun.weblog.common.domain.mapper.BlogSettingsMapper;
import com.yun.weblog.common.result.Response;
import com.yun.weblog.web.convert.BlogSettingsConvert;
import com.yun.weblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import com.yun.weblog.web.service.BlogSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 云言月
 * 2024/11/8 10:54
 */
@Service
@Slf4j
public class BlogSettingServiceImpl implements BlogSettingService {
    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
