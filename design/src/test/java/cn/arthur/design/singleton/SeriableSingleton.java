package cn.arthur.design.singleton;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 17:02
 */
public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }
   //序列化:把内存中对象的状态转换为字节码的形式,把字节码通过IO输出流,写到磁盘上，永久保存下来，持久化
    //反序列化:将持久化的字节码通过IO输入流读到内存中来,转化为java对象
    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * readResolve 该方法在反序列化时可保存单例
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
