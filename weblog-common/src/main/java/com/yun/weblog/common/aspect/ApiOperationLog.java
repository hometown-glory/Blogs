package com.yun.weblog.common.aspect;

import java.lang.annotation.*;

/**
 * @author 云言月
 * 2024/10/25 12:08
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {

    /**
     * @return
     */
    String description() default "";
}
