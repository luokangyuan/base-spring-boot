package com.luokangyuan.core.result;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Response2Result
 *
 * @author lky
 * @version 1.0.0
 * @description 将响应结果封装为{@link Result}结果
 * @date 2023/2/11 22:56
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Response2Result {
}
