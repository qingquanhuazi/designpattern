package cn.arthur.design.decorator.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/4 0004 14:39
 */
public class Test {
    private  static final Logger logger= LoggerFactory.getLogger(Test.class);
    private  static final JsonLogger jsonLogger= JsonLoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        logger.info("系统异常");
        jsonLogger.info("系统异常");
    }
}
