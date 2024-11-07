package com.yun.weblog.admin.service;

import com.yun.weblog.admin.model.vo.tag.AddTagReqVO;
import com.yun.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.yun.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.yun.weblog.admin.model.vo.tag.SearchTagsReqVO;
import com.yun.weblog.common.result.Response;
import com.yun.weblog.common.utils.PageResponse;

/**
 * @author 云言月
 * 2024/11/3 13:44
 */
public interface AdminTagService {
    /**
     * 添加标签
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页数据
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 模糊查询标签
     * @param searchTagsReqVO
     * @return
     */
    Response searchTags(SearchTagsReqVO searchTagsReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();
}
