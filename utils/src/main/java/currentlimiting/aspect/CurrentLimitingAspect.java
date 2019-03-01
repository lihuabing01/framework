package currentlimiting.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/7/30 下午4:10.
 * Modified By:
 */
@Aspect
@Component
public class CurrentLimitingAspect {

    @Pointcut("@annotation(com.pluosi.financial.annotation.CurrentLimitingAnnotation)")
    public void currentLimitingPointCut(){}

    @Before("currentLimitingPointCut()")
    public void currentLimitingBefore(JoinPoint joinPoint) {
        String methodName = getMethodName(joinPoint);
        CurrentLimitingAnnotation currentLimitingAnnotation = findAnnotation(joinPoint);
        switch (currentLimitingAnnotation.currentLimitingType()) {
            case CURRENTLIMITING_DISTRIBUTED:

        }

    }

    private CurrentLimitingAnnotation findAnnotation(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        return signature.getMethod().getAnnotation(CurrentLimitingAnnotation.class);
    }


    private String getMethodName(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        return signature.getDeclaringTypeName() + "." + signature.getName();
    }
}
