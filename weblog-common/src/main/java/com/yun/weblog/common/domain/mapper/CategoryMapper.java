package com.yun.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yun.weblog.common.domain.dos.CategoryDO;

/**
 * @author 云言月
 * 2024/11/2 17:41
 */

public interface CategoryMapper extends BaseMapper<CategoryDO> {
    /**
     * 根据文章分类查询
     *
     * @param categoryName
     * @return
     */
    default CategoryDO selectByName(String categoryName) {
        // 构建查询条件
        LambdaQueryWrapper<CategoryDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CategoryDO::getName, categoryName);

        // 执行查询
        return selectOne(wrapper);
    }
}
