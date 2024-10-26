package com.yun.weblog.common.exception;

/**
 * @author 云言月
 * 2024/10/26 9:11
 * description: 通用异常接口
 */
public interface BaseExceptionInterface {
    //获取异常码
    String getErrorMessage();
    //获取异常信息
    String getErrorCode();
}
