package cn.arthur.design.proxy;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 9:40
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
