package com.qianmi.autotest.base.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 测试场景
 * 测试场景可以区分输入输出数据
 * Created by liuzhaoming on 2016/11/14.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Scene {
    String value();
}
