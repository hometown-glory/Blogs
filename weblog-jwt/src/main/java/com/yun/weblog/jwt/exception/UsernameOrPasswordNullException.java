package com.yun.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author 云言月
 * 2024/10/28 10:03
 * description:用户名或者密码为空异常
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
