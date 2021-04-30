package cn.arthur.design.singleton;

import cn.arthur.design.singleton.lazy.LazyStaticInnerClassSingleton;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 16:12
 */
public class CrackSingletonTest {
    @Test
    public void reflect() {
        Class<?> clazz = LazyStaticInnerClassSingleton.class;
        Constructor<?> declaredConstructor = null;
        try {
            declaredConstructor = clazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Object o = declaredConstructor.newInstance();
            System.out.println(o);
            Object o1 = declaredConstructor.newInstance();
            System.out.println(o1);
            System.out.println(o == o1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 序列化破环单例
     */
    @Test
    public void serial() {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        try {
            FileOutputStream f1 = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oo1 = new ObjectOutputStream(f1);
            oo1.writeObject(s2);
            oo1.flush();
            oo1.close();
            FileInputStream fi1 = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fi1);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
