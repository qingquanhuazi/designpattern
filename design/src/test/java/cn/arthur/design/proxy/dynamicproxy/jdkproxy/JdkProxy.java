package cn.arthur.design.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 功能描述：
 * 代理主题
 *
 * @author : arthur
 * @date : 2021/5/1 0001 9:42
 */
public class JdkProxy implements InvocationHandler {
    private ISubject iSubject;


    public ISubject getInstance(ISubject iSubject) {
        this.iSubject = iSubject;
        Class<?> clazz = iSubject.getClass();
        return (ISubject) java.lang.reflect.Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public void before() {
        System.out.println("called before request");
    }

    public void after() {
        System.out.println("called after request");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.iSubject, args);
        after();
        return result;
    }
}

