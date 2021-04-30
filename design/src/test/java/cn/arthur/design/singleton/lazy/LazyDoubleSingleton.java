package cn.arthur.design.singleton.lazy;

/**
 * 功能描述：
 * <p> 双重检查锁
 * 优点：性能高，线程安全，节省内存
 * 缺点：可读性降低,不够优雅
 * @author : arthur
 * @date : 2021/4/30 0030 14:51
 */
public class LazyDoubleSingleton {
    private volatile static LazyDoubleSingleton instance;

    private LazyDoubleSingleton() {

    }

    public static LazyDoubleSingleton getInstance() {
        //检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleSingleton.class) {
                //检查是否要重新创建实例
                if (instance == null) {
                    //多线程环境有一定随机性，线程会去抢占CPU的时间片，
                    // 一：需要分配实例new LazyDoubleSingleton()的内存地址
                    // ，二：需要分配变量instance本身的内存地址
                    //最后，变量本身内存地址指向实例指针
                    //这个流程创建了两个内存地址，则会出现先后问题
                    return instance = new LazyDoubleSingleton();
                }
            }
        }
        return instance;
    }
}
