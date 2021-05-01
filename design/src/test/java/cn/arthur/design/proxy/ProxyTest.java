package cn.arthur.design.proxy;

import cn.arthur.design.proxy.dynamicproxy.cglibproxy.CglibProxy;
import cn.arthur.design.proxy.dynamicproxy.jdkproxy.ISubject;
import cn.arthur.design.proxy.dynamicproxy.jdkproxy.JdkProxy;
import cn.arthur.design.proxy.dynamicproxy.jdkproxy.JdkRealSubject;
import cn.arthur.design.proxy.dynamicproxy.jdkproxy.JdkRealSubject2;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 9:56
 */
public class ProxyTest {

    @Test
    public void staticTest(){
        Proxy proxy=new Proxy(new RealSubject());
        proxy.request();
    }

    @Test
    public void jdkTest(){
        JdkProxy proxy=new JdkProxy();
        ISubject instance = proxy.getInstance(new JdkRealSubject2());
        instance.request();
    }

    @Test
    public void cglib(){
        JdkRealSubject2 instance = (JdkRealSubject2)new CglibProxy().getInstance(JdkRealSubject2.class);
        instance.request();
    }

    @Test
    public void getClazz(){
        byte[] bytes= ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{ISubject.class});
        try{
            FileOutputStream os=new FileOutputStream("C:\\算法\\$Proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        //用cmd打开，转到文件夹下，输入命令jad $Proxy0.class,15:20s
    }
}
