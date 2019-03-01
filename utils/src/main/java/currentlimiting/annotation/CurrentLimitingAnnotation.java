package currentlimiting.annotation;


import currentlimiting.constant.CurrentLimitingTypeEnum;

import java.lang.annotation.*;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/7/30 下午3:40.
 * Modified By:
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentLimitingAnnotation {

    /**
     * 限流数量
     * @return
     */
    int limitCount() default 200;

    /**
     * 动态
     * @return
     */
    long duration() default 2 * 64 * 1000;

    /**
     * 限流方式：分布式限流 or 单机限流
     * @return
     */
    CurrentLimitingTypeEnum currentLimitingType() default CurrentLimitingTypeEnum.CURRENTLIMITING_DISTRIBUTED;

}
