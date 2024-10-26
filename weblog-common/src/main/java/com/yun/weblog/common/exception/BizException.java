package com.yun.weblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 云言月
 * 2024/10/26 9:21
 * description：自定义业务异常
 */
@Getter
@Setter
public class BizException extends RuntimeException{
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}
