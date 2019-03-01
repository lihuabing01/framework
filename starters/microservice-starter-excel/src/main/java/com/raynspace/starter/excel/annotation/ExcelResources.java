package com.raynspace.starter.excel.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by lihuabing on 2017/8/28.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelResources {
    /**
     * 属性的标题名称
     *
     * @return
     */
    String title();

    /**
     * 在excel的顺序
     *
     * @return
     */
    int order() default 9999;

}