package cn.arthur.design.factory.factorymethod;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/10 0010 11:01
 */
public class LightTest {
    public static void main(String[] args) {
        new GreenLightFactory().createLight().light();
    }
}
