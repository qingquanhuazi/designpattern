package cn.arthur.design.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/4 0004 14:42
 */
public class JsonLogger extends LoggerDecorator {
    private static Logger logger = LoggerFactory.getLogger(JsonLogger.class);

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject jsonObject = newJsonObject();
        jsonObject.put("message", s);
        logger.info(jsonObject.toString());
    }

    @Override
    public void error(String s) {
        JSONObject jsonObject = newJsonObject();
        jsonObject.put("message", s);
        logger.info(jsonObject.toString());
    }

    public void error(Exception e) {
        JSONObject jsonObject = newJsonObject();
        jsonObject.put("exception", e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        jsonObject.put("stackTrace", trace);
        logger.info(jsonObject.toString());
    }

    private JSONObject newJsonObject() {
        return new JSONObject();
    }
}
