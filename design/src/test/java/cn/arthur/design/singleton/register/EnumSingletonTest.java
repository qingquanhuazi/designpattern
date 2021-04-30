package cn.arthur.design.singleton.register;

import java.lang.reflect.Constructor;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 16:25
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        Class clazz = EnumSingleton.class;
        //Enum
        Constructor constructor = null;
        try {
            constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            //JDK源码中做了限制，不能反射获取枚举的对象
            Object o = constructor.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
