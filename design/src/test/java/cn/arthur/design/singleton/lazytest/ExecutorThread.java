package cn.arthur.design.singleton.lazytest;

import cn.arthur.design.singleton.lazy.LazySimpleSingleton;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 14:57
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ";" + lazySimpleSingleton);
    }
}
