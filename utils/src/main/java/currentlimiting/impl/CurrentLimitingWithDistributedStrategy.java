package currentlimiting.impl;

import currentlimiting.CurrentLimitingStrategyInterface;
import currentlimiting.annotation.CurrentLimitingAnnotation;
import currentlimiting.exception.CurrentLimitingException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/7/30 下午5:11.
 * Modified By:
 */
@Component
@Scope("singleton")
public class CurrentLimitingWithDistributedStrategy implements CurrentLimitingStrategyInterface {

    @Resource
    Jedis jedis;

    @Override
    public void doCurrentLimiting(String methodName, CurrentLimitingAnnotation currentLimitingAnnotation) throws CurrentLimitingException {
//        jedis.set()
    }
}
