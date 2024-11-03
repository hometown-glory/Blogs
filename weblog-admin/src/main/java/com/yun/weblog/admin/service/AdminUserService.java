package com.yun.weblog.admin.service;


import com.yun.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.yun.weblog.common.result.Response;

/**
 * @author 云言月
 * 2024/11/1 15:03
 * description:修改密码
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);


    /**
     * 查询用户信息
     * @return
     */
    Response findUserInfo();
}

