package cn.arthur.design.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/4 0004 15:09
 */
public class JsonLoggerFactory {
    public static JsonLogger getLogger(Class clazz){
        Logger logger= LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
