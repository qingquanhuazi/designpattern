package cn.arthur.design.flyweight.jdk;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 17:14
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(127);
        Integer b=127;

        Integer c=Integer.valueOf(128);
        Integer d=128;
        System.out.println(a==b);
        System.out.println(c==d);
    }
}
