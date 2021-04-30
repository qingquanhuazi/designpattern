package cn.arthur.design.singleton.lazy;

/**
 * 功能描述：
 * <p>
 * 优点：写法优雅,利用了java语法特性,性能高，避免了内存浪费,反射无法破坏
 * 缺点：不优雅
 * 在classpath下，LazyStaticInnerClassSingleton.class会被加载，但LazyStaticInnerClassSingleton$LazyHolder.class不会被加载
 *
 * @author : arthur
 * @date : 2021/4/30 0030 14:51
 */
public class LazyStaticInnerClassSingleton {


    private LazyStaticInnerClassSingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
