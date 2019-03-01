package currentlimiting;

import currentlimiting.annotation.CurrentLimitingAnnotation;
import currentlimiting.exception.CurrentLimitingException;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/7/30 下午4:38.
 * Modified By:
 */
public interface CurrentLimitingStrategyInterface {

    void doCurrentLimiting(String methodName, CurrentLimitingAnnotation currentLimitingAnnotation) throws CurrentLimitingException;
}
