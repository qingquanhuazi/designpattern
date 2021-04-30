package cn.arthur.design.singleton.register;

/**
 * 功能描述：
 *   枚举式单例，JDK源码限制发射构造获取实例
 *  缺点:不适合在大批量单例的情况下使用，会造成内存浪费
 * @author : arthur
 * @date : 2021/4/30 0030 16:24
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
