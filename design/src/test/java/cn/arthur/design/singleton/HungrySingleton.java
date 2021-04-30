package cn.arthur.design.singleton;

/**
 * 功能描述：
 * 饿汉式单例：在类首次加载时即创建实例
 *  优点:执行效率高,没有任何的锁
 *  缺点:某些情况下,可能会造成内存浪费(不用时，单例情况较多时)
 * @author : arthur
 * @date : 2021/4/30 0030 14:40
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 隐藏其所有的构造方法
     */
    private HungrySingleton() {
    }

    /**
     * 提供一个全局访问点
     */
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
