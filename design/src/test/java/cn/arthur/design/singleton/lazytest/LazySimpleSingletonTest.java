package cn.arthur.design.singleton.lazytest;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 15:00
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
