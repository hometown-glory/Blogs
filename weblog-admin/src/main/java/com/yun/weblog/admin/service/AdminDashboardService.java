package com.yun.weblog.admin.service;

import com.yun.weblog.common.result.Response;

/**
 * @author 云言月
 * 2024/11/10 21:01
 */
public interface AdminDashboardService {
    /**
     * 获取仪表盘基础统计信息
     * @return
     */
    Response findDashboardStatistics();

    /**
     * 获取文章发布热点统计信息
     * @return
     */
    Response findDashboardPublishArticleStatistics();

    /**
     * 获取文章最近一周 PV 访问量统计信息
     * @return
     */
    Response findDashboardPVStatistics();
}
