package cn.arthur.design.flyweight.jdk;

import org.junit.Test;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 17:06
 */
public class StringTest {
    @Test
    public void callTest(){
        String s1="hello";
        String s2="hello";
        String s3="he"+"llo";
        String s4="hel"+new String("lo");
        String s5=new String("hello");
        String s6=s5.intern();//intern表示直接从字符串常量池中去取
        String s7="h";
        String s8="ello";
        String s9=s7+s8;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s4==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s9);
    }
}
