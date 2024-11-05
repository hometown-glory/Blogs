package com.yun.weblog.admin.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yun.weblog.admin.convert.BlogSettingsConvert;
import com.yun.weblog.admin.model.vo.blogsetting.FindBlogSettingsRspVO;
import com.yun.weblog.admin.model.vo.blogsetting.UpdateBlogSettingsReqVO;
import com.yun.weblog.admin.service.AdminBlogSettingsService;
import com.yun.weblog.common.domain.dos.BlogSettingsDO;
import com.yun.weblog.common.domain.mapper.BlogSettingsMapper;
import com.yun.weblog.common.result.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 云言月
 * 2024/11/5 8:31
 * description:博客设置模块
 */
@Service
@Slf4j
public class AdminBlogSettingsServiceImpl extends ServiceImpl<BlogSettingsMapper, BlogSettingsDO> implements AdminBlogSettingsService {
    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    //@Override
    //public Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO) {
    //    // VO 转 DO
    //    BlogSettingsDO blogSettingsDO = BlogSettingsDO.builder()
    //            .id(1L)
    //            .logo(updateBlogSettingsReqVO.getLogo())
    //            .name(updateBlogSettingsReqVO.getName())
    //            .author(updateBlogSettingsReqVO.getAuthor())
    //            .introduction(updateBlogSettingsReqVO.getIntroduction())
    //            .avatar(updateBlogSettingsReqVO.getAvatar())
    //            .githubHomepage(updateBlogSettingsReqVO.getGithubHomepage())
    //            .giteeHomepage(updateBlogSettingsReqVO.getGiteeHomepage())
    //            .csdnHomepage(updateBlogSettingsReqVO.getCsdnHomepage())
    //            .zhihuHomepage(updateBlogSettingsReqVO.getZhihuHomepage())
    //            .build();
    //
    //    // 保存或更新（当数据库中存在 ID 为 1 的记录时，则执行更新操作，否则执行插入操作）
    //    saveOrUpdate(blogSettingsDO);
    //    return Response.success();
    //}
    @Override
    public Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO) {
        // VO 转 DO
        BlogSettingsDO blogSettingsDO = BlogSettingsConvert.INSTANCE.convertVO2DO(updateBlogSettingsReqVO);
        blogSettingsDO.setId(1L);

        // 保存或更新（当数据库中存在 ID 为 1 的记录时，则执行更新操作，否则执行插入操作）
        saveOrUpdate(blogSettingsDO);
        return Response.success();
    }

    /**
     * 获取博客设置详情
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询 ID 为 1 的记录
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);

        // DO 转 VO
        FindBlogSettingsRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}




