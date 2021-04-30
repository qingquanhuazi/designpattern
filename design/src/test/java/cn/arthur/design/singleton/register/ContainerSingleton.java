package cn.arthur.design.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述：
 * 借鉴了枚举式单例,
 *
 * @author : arthur
 * @date : 2021/4/30 0030 16:45
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private volatile static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        Object instance = null;
        if (!ioc.containsKey(className)) {
            synchronized (ContainerSingleton.class) {
                if (ioc.containsKey(className)) {
                    return ioc.get(className);
                }
                try {
                    instance = Class.forName(className).newInstance();
                    ioc.put(className, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return instance;
        } else {
            return ioc.get(className);
        }
    }
}
