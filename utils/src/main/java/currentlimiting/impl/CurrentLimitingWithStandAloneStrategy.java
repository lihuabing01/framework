package currentlimiting.impl;

import currentlimiting.CurrentLimitingStrategyInterface;
import currentlimiting.annotation.CurrentLimitingAnnotation;
import currentlimiting.exception.CurrentLimitingException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/7/30 下午4:42.
 * Modified By:
 */
public class CurrentLimitingWithStandAloneStrategy implements CurrentLimitingStrategyInterface {

    private ReentrantLock lock = new ReentrantLock();
    private Map<String,List<String>> methodLimits = new HashMap<>();

    @Override
    public void doCurrentLimiting(String methodName, CurrentLimitingAnnotation currentLimitingAnnotation) throws CurrentLimitingException {

    }
}
