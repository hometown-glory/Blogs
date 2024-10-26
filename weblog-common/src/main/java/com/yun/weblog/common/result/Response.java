package com.yun.weblog.common.result;

import com.yun.weblog.common.exception.BaseExceptionInterface;
import com.yun.weblog.common.exception.BizException;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 云言月
 * 2024/10/25 16:00
 * @deprecated 响应参数工具类
 */
@Data
public class Response<T> implements Serializable {
    // 是否成功，默认为 true
    private boolean success = true;
    // 响应消息
    private String message;
    // 异常码
    private String errorCode;
    // 响应数据
    private T data;

    // 构造方法
    private Response() {
    }

    private Response(boolean success) {
        this.success = success;
    }

    private Response(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    private Response(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    private Response(boolean success, String errorCode, String message, T data) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    // =================================== 成功响应 ===================================

    /**
     * 返回默认成功响应
     *
     * @param <T> 数据类型
     * @return 成功响应对象
     */
    public static <T> Response<T> success() {
        return new Response<>();
    }

    /**
     * 返回携带数据的成功响应
     *
     * @param data 响应数据
     * @param <T>  数据类型
     * @return 成功响应对象
     */
    public static <T> Response<T> success(T data) {
        return new Response<>(true, data);
    }

    // =================================== 失败响应 ===================================

    /**
     * 返回默认失败响应
     *
     * @param <T> 数据类型
     * @return 失败响应对象
     */
    public static <T> Response<T> fail() {
        return new Response<>(false);
    }

    /**
     * 返回携带错误消息的失败响应
     *
     * @param errorMessage 错误信息
     * @param <T>          数据类型
     * @return 失败响应对象
     */
    public static <T> Response<T> fail(String errorMessage) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setMessage(errorMessage);
        return response;
    }

    /**
     * 返回携带错误码和错误消息的失败响应
     *
     * @param errorCode    错误码
     * @param errorMessage 错误信息
     * @param <T>          数据类型
     * @return 失败响应对象
     */
    public static <T> Response<T> fail(String errorCode, String errorMessage) {
        return new Response<>(false, errorCode, errorMessage, null);
    }

    /**
     * 根据业务异常返回失败响应
     * @param bizException
     * @return
     * @param <T>
     */
    public static <T> Response<T> fail(BizException bizException) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(bizException.getErrorCode());
        response.setMessage(bizException.getErrorMessage());
        return response;
    }

    public static <T> Response<T> fail(BaseExceptionInterface baseExceptionInterface) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(baseExceptionInterface.getErrorCode());
        response.setMessage(baseExceptionInterface.getErrorMessage());
        return response;
    }


}
