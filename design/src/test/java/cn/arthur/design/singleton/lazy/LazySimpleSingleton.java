package cn.arthur.design.singleton.lazy;

/**
 * 功能描述：
 * 简单懒汉
 * 优点：节省内存
 * 缺点：线程不安全,如果在getInstance方法上加synchronized又会造成性能下降
 *
 * @author : arthur
 * @date : 2021/4/30 0030 14:51
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton() {

    }

    public  static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            return lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
