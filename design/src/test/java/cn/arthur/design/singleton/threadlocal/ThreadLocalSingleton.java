package cn.arthur.design.singleton.threadlocal;

/**
 * 功能描述：
 * 数据源切换时会用到，因为需要针对某个线程保证安全性
 *
 * @author : arthur
 * @date : 2021/4/30 0030 18:44
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> instance =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton(){
    }

    public static ThreadLocalSingleton getInstance(){
        return instance.get();
    }
}
