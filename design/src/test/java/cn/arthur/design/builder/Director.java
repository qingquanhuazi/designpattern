package cn.arthur.design.builder;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/30 0030 23:33
 */
public class Director {
    public static void main(String[] args) {
        IBuilder builder=new ConcreteBuilder();
        System.out.println(builder.build());
    }
}
