package cn.arthur.design.proxy;

/**
 * 功能描述：
 * 代理主题
 * @author : arthur
 * @date : 2021/5/1 0001 9:42
 */
public class Proxy implements ISubject{
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
     before();
     realSubject.request();
     after();
    }

    public void before(){
        System.out.println("called before request");
    }

    public void after(){
        System.out.println("called after request");
    }
}

